package es.jpa.hibernate.example.entities;

import es.jpa.hibernate.example.db.OperacionesDb;
import es.jpa.hibernate.example.exception.PersonajeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PersonajeJDBCTest {
        OperacionesDb operacionesDb;
        String urlDB="src/main/resources/marvel.db";

        String MESSAGE_ERROR="No se ha obtenido el resultado";
        Personaje usuario;
        Poder poder;

        @BeforeEach
        public void beforeEach(){
            operacionesDb=new OperacionesDb(urlDB);
            Poder poder1=new Poder(10,"Superfuerza");
            Poder poder2=new Poder(11,"Superfuerza");
            Alias alias=new Alias(5,"Bruce Banner");
            Set<Poder> poderes= Set.of(poder1,poder2);
            usuario=new Personaje(3,"Hulk","Hombre",alias,poderes);

        }

        @Test
        public void obtenerUsuariosAllTest(){
            try {
                Set<Personaje> lista =operacionesDb.obtenerUsuarios();
                Assertions.assertEquals(10,lista.size(),MESSAGE_ERROR);
            }catch (PersonajeException e){
                Assertions.fail(e.getMessage());
            }
        }

        @Test
        public void obtenerUsuarioTest() throws PersonajeException{
            Personaje usuario=new Personaje(1);
            try {
                usuario=operacionesDb.obtenerUsuario(usuario);
                Assertions.assertNotNull(usuario,MESSAGE_ERROR);
                Assertions.assertNotNull(usuario.getId(),MESSAGE_ERROR);
                Assertions.assertNotNull(usuario.getNombre(),MESSAGE_ERROR);
                Assertions.assertNotNull(usuario.getAlias(),MESSAGE_ERROR);
                Assertions.assertNotNull(usuario.getPoderes(),MESSAGE_ERROR);
            }catch (PersonajeException e){
                Assertions.fail(e.getMessage());
            }
        }
        @Test
        public void insertarEliminarUsuarioTest() throws PersonajeException{
            try {
                int numeroUsuarios=operacionesDb.obtenerUsuarios().size();
                operacionesDb.insertarUsuario(usuario);
                Personaje usuarioObtenido=operacionesDb.obtenerUsuario(usuario);
                Assertions.assertEquals(usuario,usuarioObtenido,MESSAGE_ERROR);
                operacionesDb.eliminarUsuario(usuarioObtenido);
                int numeroUsuariosFinal=operacionesDb.obtenerUsuarios().size();
                Assertions.assertEquals(numeroUsuarios,numeroUsuariosFinal,MESSAGE_ERROR);
            }catch (PersonajeException e){
                Assertions.fail(e.getMessage());
            }
        }

        @Test
        public void actualizarUsuarioTest(){
            String nombreUpdate="Prima de Banner";
            String genero="Mujer";
            try{
                operacionesDb.insertarUsuario(usuario);
                usuario.setNombre(nombreUpdate);
                usuario.setGenero(genero);
                operacionesDb.actualizarUsuario(usuario);
                Personaje usuarioEncontrado=operacionesDb.obtenerUsuario(usuario);
                Assertions.assertEquals(usuario,usuarioEncontrado,MESSAGE_ERROR);
                Assertions.assertEquals(usuario.getNombre(),usuarioEncontrado.getNombre(),MESSAGE_ERROR);
                Assertions.assertEquals(usuario.getGenero(),usuarioEncontrado.getGenero(),MESSAGE_ERROR);
                operacionesDb.eliminarUsuario(usuarioEncontrado);
            }catch (Exception exception){
                Assertions.fail(MESSAGE_ERROR);
            }

        }



}
