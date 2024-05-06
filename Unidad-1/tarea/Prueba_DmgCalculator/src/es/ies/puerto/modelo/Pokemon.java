package es.ies.puerto.modelo;

import es.ies.puerto.enumerate.Type;

public class Pokemon {

    public int id;
    public Type type1;
    public Type type2;
    public String name;

    public final int baseHp;
    public final int baseSpeed;
    public final int baseAttack;
    public final int baseAttackSpc;
    public final int baseDefenceSpc;
    public final int baseDefence;

    public Pokemon(int baseHp, int baseSpeed, int baseAttack, int baseAttackSpc, int baseDefenceSpc, int baseDefence) {
        this.baseHp = baseHp;
        this.baseSpeed = baseSpeed;
        this.baseAttack = baseAttack;
        this.baseAttackSpc = baseAttackSpc;
        this.baseDefenceSpc = baseDefenceSpc;
        this.baseDefence = baseDefence;
    }
}
