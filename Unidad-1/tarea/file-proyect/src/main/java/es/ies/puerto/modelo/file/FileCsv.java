package es.ies.puerto.modelo.file;

import es.ies.puerto.modelo.Persona;
import es.ies.puerto.utilidades.UtilidadClass;
import org.simpleframework.xml.Element;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileCsv extends UtilidadClass {

    @Element(name = "personas")
    List<Persona> personas;
    String path="src/main/ressources/data.csv";

    public List<Persona> obtenerPersonas(){
        personas= new ArrayList<>();
        int contador=0;

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (contador>0){
                String[] datos = linea.split(DELIMITADOR);
                int id = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                int edad = Integer.parseInt(datos[2]);
                String email = datos[3];
                personas.add(new Persona(id, nombre, edad, email));
            }
                contador++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return personas;

    }
    public Persona obtenerPersonas(Persona persona){
        List<Persona> personas= new ArrayList<>();
        int contador=0;
        boolean encontrado=false;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (contador>0 && !encontrado){
                    String[] datos = linea.split(DELIMITADOR);
                    int id = Integer.parseInt(datos[0]);
                    if (id== persona.getId()){
                        String nombre = datos[1];
                        persona.setNombre(nombre);
                        int edad = Integer.parseInt(datos[2]);
                        persona.setEdad(edad);
                        String email = datos[3];
                        persona.setEmail(email);
                        encontrado=true;
                    }

                }
                contador++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return persona;

    }

    public void addPersona(Persona persona){
        Persona personaBuscar=obtenerPersonas(persona);
        if (personaBuscar.getEmail()==null){
            try (FileWriter writer = new FileWriter(path, true)) {
                writer.write(persona.toCsv()+"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
