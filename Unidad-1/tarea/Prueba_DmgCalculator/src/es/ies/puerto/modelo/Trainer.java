package es.ies.puerto.modelo;

import java.util.HashMap;
import java.util.List;

public class Trainer {
    public HashMap<String,PokemonOwned> pokemons;
    public final int id;
    public final String OT;

    public int money;

    public Trainer(int id, String ot, int money) {
        this.id = id;
        this.OT = ot;
        this.money=money;
        pokemons=new HashMap<>();
    }

    public HashMap<String, PokemonOwned> getPokemons() {
        return pokemons;
    }

    public void setPokemons(String nickname, PokemonOwned pokemon) {
        pokemons.put(nickname,pokemon);
    }
}
