package es.jpa.hibernate.example.config;

import es.jpa.hibernate.example.exception.PersonajeException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    String urlDb;

    public AppConfig() throws PersonajeException {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("app.properties")) {
            properties.load(fis);
            urlDb= (String) properties.get("urlDb");
        } catch (IOException e) {
            throw new PersonajeException(e.getMessage(),e);
        }
    }
}
