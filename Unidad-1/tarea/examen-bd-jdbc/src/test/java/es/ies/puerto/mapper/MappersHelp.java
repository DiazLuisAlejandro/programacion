package es.ies.puerto.mapper;

import com.sun.xml.bind.v2.model.core.ID;
import es.ies.puerto.dto.AliasDto;
import es.ies.puerto.dto.EquipamientoDto;
import es.ies.puerto.dto.PersonajeDto;
import es.ies.puerto.dto.PoderDto;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;
import org.junit.jupiter.api.BeforeEach;

import java.util.HashSet;

public class MappersHelp {

    public static final String ID_TEST = "idTest";
    public static final String DESCRIPCION_TEST = "descripcionTest";
    public static final String PERSONAJE_ID_TEST = "personajeIdTest";
    public static final HashSet<Poder> PODERESENTITY_TEST = new HashSet<>();
    public static final HashSet<Equipamiento> EQUIPAMIENTOSENTITY_TEST = new HashSet<>();
    public static final String GENERO_TEST = "generoTest";
    public static final Alias ALIAS_ENTITY_TEST = new Alias();
    public static final String NOMBRE_TEST = "nombreTest";
    public static final AliasDto ALIAS_DTO_TEST = new AliasDto();
    public static final HashSet<EquipamientoDto> EQUIPAMIENTOSDTO_TEST = new HashSet<>();
    public static final HashSet<es.ies.puerto.dto.PoderDto> PODERESDTO_TEST = new HashSet<>();

    public Alias aliasEntity;
    public AliasDto aliasDto;

    public Personaje personajeEntity;
    public PersonajeDto personajeDto;

    public Equipamiento equipamientoEntity;
    public EquipamientoDto equipamientoDto;

    public Poder poderEntity;
    public PoderDto poderDto;

    @BeforeEach
    public void beforeEach(){
        aliasDto=new AliasDto();
        aliasDto.setId(ID_TEST);
        aliasDto.setDescripcion(DESCRIPCION_TEST);
        aliasEntity=new Alias();
        aliasEntity.setDescripcion(DESCRIPCION_TEST);
        aliasEntity.setId(ID_TEST);
        aliasEntity.setPersonaje_id(PERSONAJE_ID_TEST);

        personajeEntity=new Personaje();
        personajeEntity.setId(ID_TEST);
        personajeEntity.setNombre(NOMBRE_TEST);
        personajeEntity.setAlias(ALIAS_ENTITY_TEST);
        personajeEntity.setGenero(GENERO_TEST);
        personajeEntity.setPoderes(PODERESENTITY_TEST);
        personajeEntity.setEquipamientos(EQUIPAMIENTOSENTITY_TEST);
        personajeDto=new PersonajeDto();
        personajeDto.setAlias(ALIAS_DTO_TEST);
        personajeDto.setId(ID_TEST);
        personajeDto.setEquipamientos(EQUIPAMIENTOSDTO_TEST);
        personajeDto.setPoderes(PODERESDTO_TEST);
        personajeDto.setNombre(NOMBRE_TEST);
        personajeDto.setGenero(GENERO_TEST);

        equipamientoEntity=new Equipamiento();
        equipamientoEntity.setNombre(NOMBRE_TEST);
        equipamientoEntity.setDescripcion(DESCRIPCION_TEST);
        equipamientoEntity.setId(ID_TEST);
        equipamientoEntity.setPersonaje_id(PERSONAJE_ID_TEST);
        equipamientoDto=new EquipamientoDto();
        equipamientoDto.setDescripcion(DESCRIPCION_TEST);
        equipamientoDto.setId(ID_TEST);
        equipamientoDto.setNombre(NOMBRE_TEST);

        poderEntity=new Poder();
        poderEntity.setNombre(NOMBRE_TEST);
        poderEntity.setId(ID_TEST);
        poderDto=new PoderDto();
        poderDto.setNombre(NOMBRE_TEST);
        poderDto.setId(ID_TEST);
    }
}
