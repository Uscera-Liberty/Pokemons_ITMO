package pokemons;

import attacks.status.attacks.SleepPowder;
import attacks.status.attacks.SweetScent;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon{
    public Bellsprout(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(50 , 75 , 35 , 70 ,30 , 40);
        this.setType(Type.GRASS , Type.POISON);
        this.setMove(new SleepPowder() , new SweetScent());
    }
}