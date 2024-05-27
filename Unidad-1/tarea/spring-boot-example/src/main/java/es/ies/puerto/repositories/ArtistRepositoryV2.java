package es.ies.puerto.repositories;

import es.ies.puerto.models.Artist;
import es.ies.puerto.services.ArtistServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("artistRepository")
public class ArtistRepositoryV2 {

    private ArtistServiceV1 artistServiceV1;

    @Autowired
    public void setArtistServiceV1(ArtistServiceV1 artistServiceV1){
        this.artistServiceV1=artistServiceV1;
    }

    private List<Artist> list;

    public ArtistRepositoryV2(){
        list=new ArrayList<>();
        list.add(new Artist("1","Pepe Benavente"));
        list.add(new Artist("2","Michael Jackson"));
    }

    public List<Artist> getAll() {
        return list;
    }
}
