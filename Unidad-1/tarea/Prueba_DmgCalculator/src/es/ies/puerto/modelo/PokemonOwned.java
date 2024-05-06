package es.ies.puerto.modelo;

import es.ies.puerto.enumerate.Nature;

public class PokemonOwned extends Pokemon {
    public int level;
    public Nature nature;
    public int ivHp;
    public int ivSpeed;
    public int ivAttack;
    public int ivAttackSpc;
    public int ivDefenceSpc;
    public int ivDefence;

    public PokemonOwned(int baseHp, int baseSpeed, int baseAttack, int baseAttackSpc, int baseDefenceSpc, int baseDefence) {
        super(baseHp, baseSpeed, baseAttack, baseAttackSpc, baseDefenceSpc, baseDefence);
    }
}
