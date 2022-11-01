package attacks.special.attacks;

import ru.ifmo.se.pokemon.*;

public class SweetScent extends StatusMove {
    public SweetScent ()
    {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        pokemon.setMode(Stat.EVASION, -2)
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет SweetScent";
    }
}
