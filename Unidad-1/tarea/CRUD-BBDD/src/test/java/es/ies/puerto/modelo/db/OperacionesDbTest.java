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

    @BeforeEach
    public void beforeEach(){
        operacionesDb=new OperacionesDb(urlDB);
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
    public void insertarUsuarioTest() throws UsuarioException{
        Usuario usuario=new Usuario("11","Pep",20,"Barcelona");
        try {
            operacionesDb.insertarUsuario(usuario);
            Usuario usuarioObtenido=operacionesDb.obtenerUsuario(usuario);
            Assertions.assertEquals(usuario,usuarioObtenido,MESSAGE_ERROR);
        }catch (UsuarioException e){
            Assertions.fail(e.getMessage());
        }
    }

}
