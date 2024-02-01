package es.ies.puerto.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppPersona {

    static HashMap<String,Persona> personaHashMap;
    static List<Persona> personasList;

    public static void main(String[] args) {
        personaHashMap=new HashMap<>();
        personasList=new ArrayList<>();
        Persona persona1=new Persona("David","47565723T");
        addPersonaLista(persona1);
        addPersonaHashMap(persona1);

    }

     public static boolean addPersonaLista(Persona persona){
        if (!existePersonaList(persona)){
            return personasList.add(persona);
        }
        return true;
    }

    public static boolean existePersonaList(Persona persona){
        if (personasList.isEmpty()){
            return false;
        }
        if (personasList.contains(persona)){
            return false;
        }
        return true;
    }

    public static boolean addPersonaHashMap(Persona persona){
        if (!existePersonaHashMap(persona)){
            personaHashMap.put(persona.getDni(),persona);
        }
        return true;
    }
    public static boolean existePersonaHashMap(Persona persona){
        if (personaHashMap.isEmpty()){
            return false;
        }
        if (personaHashMap.containsKey(persona.getDni())){
            return false;
        }
        return true;
    }
}
