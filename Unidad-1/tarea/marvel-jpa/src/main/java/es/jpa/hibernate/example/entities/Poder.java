package es.jpa.hibernate.example.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Poderes")
public class Poder implements Serializable {
    private static final long serialVersionUID = -7250234396452258822L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "poder")
    private String poder;

    @ManyToMany
    private Set<Personaje> personajes;

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
