package pokemons;

import attacks.special.attacks.ShadowBall;
import attacks.status.attacks.Confide;
import attacks.status.attacks.WorkUp;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Eevee extends Pokemon{
    public Eevee(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(55 , 55, 50 , 45 ,65 , 55);
        this.setType(Type.NORMAL);
        this.setMove(new ShadowBall() , new Confide() , new WorkUp());
    }
}