package es.jpa.hibernate.example.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Personajes")
public class Personaje implements Serializable {

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

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "genero")
	private String genero;

	@OneToOne
	private Alias alias;
	@ManyToMany
	private Set<Poder> poderes;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Alias getAlias() {
		return alias;
	}

	public void setAlias(Alias alias) {
		this.alias = alias;
	}

	public Set<Poder> getPoderes() {
		return poderes;
	}

	public void setPoderes(Set<Poder> poderes) {
		this.poderes = poderes;
	}

	public Personaje(Integer id, String nombre, String genero, Alias alias, Set<Poder> poderes) {
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.alias = alias;
		this.poderes = poderes;
	}

	public Personaje() {
	}

	public Personaje(Integer id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Personaje personaje = (Personaje) o;
		return Objects.equals(id, personaje.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}