import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Барсик", LocalDate.of(2020, 03, 20), new Illness("Лишай"));
        System.out.println(cat.getName());

        Animal animal = new Animal();
//        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());

        Animal dog = new Dog("Шарик", LocalDate.of(2022, 01, 15), new Illness("Чихота"));
        System.out.println(dog.illness);

        Animal fish = new Fish("Нэмо", LocalDate.of(2023, 05, 18), new Illness("Белокожие"), 2);

        Animal duc = new Duc ("Кеша", LocalDate.of(2021, 05, 10), new Illness("Лысая"), 2);

        List<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(fish);
        list.add(new Duc("Кеша", LocalDate.of(2021, 05, 10), new Illness("Лысая"), 2));

        System.out.println(list);
        dog.lifeCycle();

        fish.toGo();
        duc.toGo();
        cat.toGo();
        dog.toGo();
        fish.fly();
        duc.fly();
        cat.fly();
        dog.fly();
        fish.swim();
        duc.swim();
        cat.swim();
        dog.swim();

    }
}
