import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class project {
    public static void main(String[] args)
    {
        Battle b = new Battle();
        Pokemon p1 = new Thundurus("Тыгыдык в 3 часа ночи",73);
        Pokemon p2 = new Makuhita("Макима", 83);
        Pokemon p3 = new Hariyama("Айанами", 83);
        Pokemon p4 = new Cleffa("Клеффа", 87);
        Pokemon p5 = new Clefairy("Фейри", 87);
        Pokemon p6 = new Clefable("Неопределённый интеграл", 87);

        b.addAlly(p1);
        b.addAlly(p5);
        b.addAlly(p6);

        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p4);

        b.go();
    }
}