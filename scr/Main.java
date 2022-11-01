import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void Main(String[] args)
    {
        Battle b = new Battle();
        Pokemon p1 = new Bellsprout("Горохострел",73);
        Pokemon p2 = new Weepinbell("Плакучая ива", 83);
        Pokemon p3 = new Victreebel("Виктор", 83);
        Pokemon p4 = new Mawile("Мавиле", 87);
        Pokemon p5 = new Eevee("Киви", 87);
        Pokemon p6 = new Espeon("Пион", 87);

        b.addAlly(p1);
        b.addAlly(p5);
        b.addAlly(p6);

        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p4);

        b.go();
    }
}