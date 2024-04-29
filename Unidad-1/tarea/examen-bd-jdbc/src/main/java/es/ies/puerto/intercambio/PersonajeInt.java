package es.ies.puerto.intercambio;

import java.io.Serializable;
import java.util.Objects;

public class PersonajeInt implements Serializable {
    String id;
    AliasInt aliasInt;

    public PersonajeInt() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AliasInt getAliasInt() {
        return aliasInt;
    }

    public void setAliasInt(AliasInt aliasInt) {
        this.aliasInt = aliasInt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonajeInt that = (PersonajeInt) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
