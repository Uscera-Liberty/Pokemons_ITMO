package pokemons;

import attacks.physical.attacks.Slam;
import attacks.special.attacks.EnergyBall;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Victreebel extends Bellsprout{
    public Victreebel(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(80 , 105 , 65 , 100 , 70 , 70);
        this.setType(Type.GRASS , Type.POISON);
        this.addMove(new Slam() , new EnergyBall());
    }
}