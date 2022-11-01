package attacks.special.attacks;

import ru.ifmo.se.pokemon.*;

public class FakeTears extends StatusMove {
    public FakeTears ()
    {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        pokemon.setMode(Stat.SPECIAL_DEFENSE, -2)
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет FakeTears";
    }
}
