package attacks.special.attacks;

import ru.ifmo.se.pokemon.*;

public class SleepPowder extends StatusMove {
    public SleepPowder ()
    {
        super(Type.GRASS, 0, 75);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        pokemon.setMode(Stat.EVASION, -2) // усыпляет цель
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет SleepPowder";
    }
}
