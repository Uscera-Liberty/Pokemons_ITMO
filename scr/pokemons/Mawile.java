package pokemons;

import attacks.special.attacks.ShadowBall;
import attacks.status.attacks.DoubleTeam;
import attacks.status.attacks.FakeTears;
import attacks.special.attacks.AncientPower;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mawile extends Pokemon{
    public Mawile(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(50,85,85,55,55,50);
        this.setType(Type.FAIRY , Type.STEEL);
        this.setMove(new DoubleTeam() , new ShadowBall() , new FakeTears() , new AncientPower());
    }
}