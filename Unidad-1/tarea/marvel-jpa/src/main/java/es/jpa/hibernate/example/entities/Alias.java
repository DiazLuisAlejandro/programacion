package es.jpa.hibernate.example.entities;

import javax.persistence.*;
import java.util.Set;

public class Alias {

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


}
