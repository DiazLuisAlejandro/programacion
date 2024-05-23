package es.ies.puerto.dto;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Poder;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class PersonajeDto implements Serializable {
    private String id;
    private String nombre;
    private String genero;

    private AliasDto alias;
    private Set<EquipamientoDto> equipamientos;
    private Set<PoderDto> poderes;
    public PersonajeDto() {
        this.poderes=new HashSet<>();
        this.equipamientos=new HashSet<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public AliasDto getAlias() {
        return alias;
    }

    public void setAlias(AliasDto alias) {
        this.alias = alias;
    }

    public Set<EquipamientoDto> getEquipamientos() {
        return equipamientos;
    }

    public void setEquipamientos(Set<EquipamientoDto> equipamientos) {
        this.equipamientos = equipamientos;
    }

    public Set<PoderDto> getPoderes() {
        return poderes;
    }

    public void setPoderes(Set<PoderDto> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonajeDto that = (PersonajeDto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "PersonajeDto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", alias=" + alias +
                ", equipamientos=" + equipamientos +
                ", poderes=" + poderes +
                '}';
    }
}
