package attacks.specialAttacks;

import ru.ifmo.se.pokemon.*;

public class AncientPower extends SpecialMove {
    public AncientPower()
    {
        super(Type.ROCK, 60, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon)
    {
        Effect effect = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1); //добавить
        pokemon.addEffect(effect);
        super.applyOppEffects(pokemon);
    }

    @Override
    protected String describe() {
        return "применяет AncientPower";
    }
}