package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class Psybeam extends SpecialMove {
    public Psybeam()
    {
        super(Type.PSYCHIC , 65, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect effect = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1); //конфузия не доработана
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет Psybeam";
    }
}