package es.ies.puerto.modelo.implement;

import es.ies.puerto.modelo.abstracts.FileAbstract;

import es.ies.puerto.modelo.Personaje;
import es.ies.puerto.modelo.interfaces.ICrudInterface;
import es.ies.puerto.utilidades.UtilidadClass;
import org.simpleframework.xml.Element;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class FileCsv extends FileAbstract implements ICrudInterface {
    @Element(name = "personajes")
    List<Personaje> personajes;
    String path="src/main/resources/Personajes.csv";

    public List<Personaje> obtenerPersonas() {
        List<Personaje> personajes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(DELIMITADOR);
                String nombre = datos[0];
                String alias = datos[1];
                String genero = datos[2];
                Set<String> poderes = Collections.singleton(datos[3]);
                Personaje persona = new Personaje(nombre,alias,genero,poderes);
                personajes.add(persona);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personajes;

    }

    public Personaje obtenerPersona(Personaje persona) {
        boolean encontrado = false;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while (((linea = br.readLine()) != null) && !encontrado) {
                String[] datos = linea.split(DELIMITADOR);
                String nombre =datos[0];
                if (nombre == persona.getNombre()) {
                    String alias = datos[1];
                    String genero = datos[2];
                    Set<String> poderes = Collections.singleton(datos[3]);
                    persona.setNombre(nombre);
                    persona.setAlias(alias);
                    persona.setGenero(genero);
                    persona.setPoderes(poderes);
                    encontrado = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persona;
    }

    public void addPersona(Personaje personaje) {
     //   Personaje personaBuscar = new Personaje(Personaje.getNombre());
       // personaBuscar = obtenerPersona(personaBuscar);
       // if (personaBuscar.ge() == null) {
         //   try (FileWriter writer = new FileWriter(path, true)) {
              //  writer.write(persona.toCsv()+ "\n");
           // } catch (IOException e) {
              //  e.printStackTrace();
           // }
        //}
        if (!personajes.contains(personaje)){
            personajes.add(personaje);
        }
    }

    public void deletePersona(Personaje personaje) {
        Personaje personaBuscar = new Personaje(personaje.getId());
        List<Personaje> personajes = obtenerPersonas();
        personajes.remove(personaje);
        try (FileWriter writer = new FileWriter(path)) {
            for (Personaje personaFile : personajes) {
                writer.write(personaFile.toCsv() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void updatePersona(Personaje persona) {
        List<Personaje> personas = obtenerPersonas();
        try (FileWriter writer = new FileWriter(path)) {
            for (Personaje personasFile : personas) {
                if (personasFile.equals(persona)) {
                    writer.write(persona.toCsv() + "\n");
                } else {
                    writer.write(personasFile.toCsv() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
