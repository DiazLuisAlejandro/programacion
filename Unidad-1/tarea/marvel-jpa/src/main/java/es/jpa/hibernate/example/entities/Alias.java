package es.jpa.hibernate.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class Alias implements Serializable {

    private static final long serialVersionUID = -7250234396452258822L;
    @Id
    @TableGenerator(name = "gen_person",
            table = "table_keys",
            pkColumnName = "name_table",
            valueColumnName = "cod_key",
            pkColumnValue = "person", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "gen_person", strategy = GenerationType.TABLE)
    @Column(name = "id")
    private Integer id;

    @Column(name = "alias")
    private String alias;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alias alias = (Alias) o;
        return Objects.equals(id, alias.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Alias() {
    }

    public Alias(Integer id, String alias) {
        this.id = id;
        this.alias = alias;
    }
}
