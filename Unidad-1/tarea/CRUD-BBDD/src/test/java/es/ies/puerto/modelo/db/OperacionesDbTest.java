package es.ies.puerto.modelo.db;

import es.ies.puerto.exception.UsuarioException;
import es.ies.puerto.modelo.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

public class OperacionesDbTest {
    OperacionesDb operacionesDb;
    String urlDB="src/main/resources/usuarios.db";

    String MESSAGE_ERROR="No se ha obtenido el resultado";
    Usuario usuario;

    @BeforeEach
    public void beforeEach(){
        operacionesDb=new OperacionesDb(urlDB);
        usuario=new Usuario("11","Pep",20,"Barcelona");

    }

    @Test
    public void obtenerUsuariosAllTest(){
        try {
            Set<Usuario> lista =operacionesDb.obtenerUsuarios();
            Assertions.assertEquals(10,lista.size(),MESSAGE_ERROR);
        }catch (UsuarioException e){
            Assertions.fail(e.getMessage());
        }
    }

    @Test
    public void obtenerUsuarioTest() throws UsuarioException{
        Usuario usuario=new Usuario("5");
        try {
            usuario=operacionesDb.obtenerUsuario(usuario);
            Assertions.assertNotNull(usuario,MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getId(),MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getNombre(),MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getEdad(),MESSAGE_ERROR);
            Assertions.assertNotNull(usuario.getCiudad(),MESSAGE_ERROR);
        }catch (UsuarioException e){
            Assertions.fail(e.getMessage());
        }
    }
    @Test
    public void insertarEliminarUsuarioTest() throws UsuarioException{
        try {
            int numeroUsuarios=operacionesDb.obtenerUsuarios().size();
            operacionesDb.insertarUsuario(usuario);
            Usuario usuarioObtenido=operacionesDb.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario,usuarioObtenido,MESSAGE_ERROR);
            operacionesDb.eliminarUsuario(usuarioObtenido);
            int numeroUsuariosFinal=operacionesDb.obtenerUsuarios().size();
            Assertions.assertEquals(numeroUsuarios,numeroUsuariosFinal,MESSAGE_ERROR);
        }catch (UsuarioException e){
            Assertions.fail(e.getMessage());
        }
    }
    
    @Test
    public void actualizarUsuarioTest(){
        String nombreUpdate="Pepe Juan";
        int edadUpdate=22;
        String ciudadUpdate="Miami";
        try{
            operacionesDb.insertarUsuario(usuario);
            usuario.setCiudad(ciudadUpdate);
            usuario.setEdad(edadUpdate);
            usuario.setNombre(ciudadUpdate);
            operacionesDb.actualizarUsuario(usuario);
            Usuario usuarioEncontrado=operacionesDb.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario,usuarioEncontrado,MESSAGE_ERROR);
            Assertions.assertEquals(usuario.getNombre(),usuarioEncontrado.getNombre(),MESSAGE_ERROR);
            Assertions.assertEquals(usuario.getEdad(),usuarioEncontrado.getEdad(),MESSAGE_ERROR);
            Assertions.assertEquals(usuario.getCiudad(),usuarioEncontrado.getCiudad(),MESSAGE_ERROR);
            operacionesDb.eliminarUsuario(usuarioEncontrado);
        }catch (Exception exception){
            Assertions.fail(MESSAGE_ERROR);
        }

    }

}
