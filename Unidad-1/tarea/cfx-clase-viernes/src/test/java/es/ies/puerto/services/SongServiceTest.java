package es.ies.puerto.services;

import es.ies.puerto.models.Song;
import es.ies.puerto.repositories.SongRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.ws.rs.core.Response;

import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

public class SongServiceTest {
    SongService songService;

    @Mock
    SongRepository songRepositoryMock;

    @BeforeEach
    public void init(){
        MockitoAnnotations.openMocks(this);
        songService=new SongService();
        songService.setSongRepository(songRepositoryMock);
    }

    @Test
    void getAllTest(){
        when(songRepositoryMock.getSongs()).thenReturn(new ArrayList<>());
        Response response=songService.getSongs();
        Assertions.assertNotNull(response);
        Assertions.assertEquals(200,response.getStatus());
    }
    @Test
    void getOneOkTest(){
        when(songRepositoryMock.getSongById(anyString())).thenReturn(new Song());
        Response response=songService.getSongById("idTest");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(200,response.getStatus());
    }
    @Test
    void getOneNotFoundTest(){
        when(songRepositoryMock.getSongById(anyString())).thenReturn(null);
        Response response=songService.getSongById("idTest");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(404,response.getStatus());
    }

    @Test
    void saveSongOkTest(){
        when(songRepositoryMock.saveSong(any(Song.class))).thenReturn(true);
        Response response=songService.addSong(new Song());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(201,response.getStatus());
    }
    @Test
    void saveSongFalseTest(){
        when(songRepositoryMock.saveSong(any(Song.class))).thenReturn(false);
        Response response=songService.addSong(new Song());
        Assertions.assertNotNull(response);
        Assertions.assertEquals(304,response.getStatus());
    }

    @Test
    void deleteSongOkTest(){
        when(songRepositoryMock.deleteSongById(anyString())).thenReturn(true);
        Response response=songService.deleteSongById("idTest");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(204,response.getStatus());
    }

    @Test
    void deleteSongErrorTest(){
        when(songRepositoryMock.deleteSongById(anyString())).thenReturn(false);
        Response response=songService.deleteSongById("idTest");
        Assertions.assertNotNull(response);
        Assertions.assertEquals(404,response.getStatus());
    }


}
