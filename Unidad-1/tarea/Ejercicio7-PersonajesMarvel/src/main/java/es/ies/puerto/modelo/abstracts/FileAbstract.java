package es.ies.puerto.modelo.abstracts;

import es.ies.puerto.utilidades.UtilidadClass;

import java.io.File;
import java.nio.file.Path;

public abstract class FileAbstract extends UtilidadClass {
    public static File buscarFile(String path){
        return new File(path);
    }

}
