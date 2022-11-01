package pokemons;

import attacks.physical.attacks.Slam;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Weepinbell extends Bellsprout{
    public Weepinbell(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(65 , 90 , 50 ,85 , 45 , 55);
        this.setType(Type.GRASS , Type.POISON);
        this.addMove(new Slam());
    }
}