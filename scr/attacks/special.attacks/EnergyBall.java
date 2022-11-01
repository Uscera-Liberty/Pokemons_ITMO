package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall()
    {
        super(Type.GRASS, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect effect = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет EnergyBall";
    }
}