package pokemons;

import attacks.special.attacks.Psybeam;
public class Espeon extends Eevee{
    public Espeon(String name, int lvl)
    {
        super(name, lvl);
        this.setType(Type.PSYCHIC);
        this.setStats(65 , 65 , 60 , 130 , 95 , 110);
        this.addMove(new Psybeam());

    }
}