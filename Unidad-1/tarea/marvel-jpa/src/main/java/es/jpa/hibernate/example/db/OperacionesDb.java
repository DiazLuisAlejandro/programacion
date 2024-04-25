package es.jpa.hibernate.example.db;




import es.jpa.hibernate.example.entities.Alias;
import es.jpa.hibernate.example.entities.Personaje;
import es.jpa.hibernate.example.entities.Poder;
import es.jpa.hibernate.example.exception.PersonajeException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

    public class OperacionesDb extends Conexion{
        public OperacionesDb(String url) {
            super(url);
        }

        public Set<Personaje> obtenerUsuarios() throws PersonajeException {
            String query="select ps.id, ps.nombre, ps.genero, a.alias,p.poder from Personajes as ps " +
                    "join Personajes_Poderes as pp on ps.id=pp.personaje_id "+
                    "join Poderes as p on  pp.poder_id=p.id " +
                    "join Alias as a on a.personaje_id=ps.id";
            return obtener(query);
        }
        public Personaje obtenerUsuario(Personaje usuario) throws PersonajeException {
            String query="select u.id, u.nombre, u.genero from Personajes as u where u.id='"+usuario.getId()+"'";
            Set<Personaje> lista=obtener(query);
            if (lista.isEmpty()){
                return null;
            }
            return lista.iterator().next();

        }
        public void insertarUsuario(Personaje usuario) throws PersonajeException {
            String qry = "INSERT INTO Personajes as u (id,nombre,genero) " +
                    "VALUES ('"+usuario.getId()+"','"+usuario.getNombre()+"','"+usuario.getGenero()+"')";

            actualizar(qry);
        }

        public void actualizarUsuario(Personaje usuario) throws PersonajeException {
            String  query="UPDATE Personajes set nombre='"+usuario.getNombre()+"'," +
                    " genero='"+usuario.getGenero()+
                    " where id='"+usuario.getId()+"' ";
            actualizar(query);
        }

        public void eliminarUsuario(Personaje usuario) throws PersonajeException{
            String query="delete FROM Personajes as p" +
                    " where p.id='"+usuario.getId()+"'";
            actualizar(query);
        }
        private Set<Personaje> obtener(String query) throws PersonajeException {
            Set<Personaje> lista=new HashSet<>();
            Statement statement=null;
            ResultSet rs=null;
            try{
                statement= getConexion().createStatement();
                rs= statement.executeQuery(query);
                while (rs.next()){
                    Integer userId=rs.getInt("id");
                    String userName =rs.getString("nombre");
                    String genero= rs.getString("genero");
                    Alias alias= (Alias) rs.getObject("alias");
                    Set<Poder> poderes= (Set<Poder>) rs.getObject("poder");
                    Personaje usuario=new Personaje(userId,userName,genero,alias,poderes);
                    lista.add(usuario);
                }
            }catch (SQLException exception){
                throw new PersonajeException(exception.getMessage(),exception);
            }finally{
                try {
                    if (rs!=null && !rs.isClosed()){
                        rs.close();
                    }
                    if (statement!=null && !statement.isClosed()){
                        statement.close();
                    }
                    if (!getConexion().isClosed()){
                        getConexion().close();
                    }

                }catch (SQLException e){
                    throw new PersonajeException(e.getMessage(),e);
                }

            }
            return lista;
        }


        private void actualizar(String query) throws PersonajeException {
            Statement statement=null;
            try{
                statement= getConexion().createStatement();
                statement.executeUpdate(query);


            }catch (SQLException exception){
                throw new PersonajeException(exception.getMessage(),exception);
            }finally{
                try {

                    if (statement!=null && !statement.isClosed()){
                        statement.close();
                    }
                    if (!getConexion().isClosed()){
                        getConexion().close();
                    }

                }catch (SQLException e){
                    throw new PersonajeException(e.getMessage(),e);
                }

            }
        }
    }

