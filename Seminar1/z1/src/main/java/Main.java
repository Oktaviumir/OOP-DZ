import interfaces.Goable;
import interfaces.Mathable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal() {
            @Override
            public void eat() {

            }
        };

        Cat cat = new Cat("Барсик", LocalDate.of(2020, 03, 20), new Illness("Лишай"));
        Dog dog = new Dog("Шарик", LocalDate.of(2022, 01, 15), new Illness("Чихота"));
        Animal fish = new Fish("Нэмо", LocalDate.of(2023, 05, 18), new Illness("Белокожие"), 2);
        Animal duc = new Duc("Кеша", LocalDate.of(2021, 05, 10), new Illness("Лысая"), 2);
        System.out.println(dog.illness);
        System.out.println(cat.getName());
        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());

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

        List<Goable> goables = new ArrayList<>();
        goables.add(cat);
        goables.add(dog);
        System.out.println(goables);

        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        for (Goable g : goables) {
            System.out.println(g.go());
            g.defaultGO(10.5);
        }

        Goable goable = new Goable() {
            @Override
            public double go() {
                return 0;
            }
        };

        Goable goable1 = () -> 19;

//        Mathable m = new Mathable() {
//            @Override
//            public double addition(double a, double b) {
//                return a + b;
//            }
//        };
//
//        Mathable m2 = Double::sum;

        Mathable m = new Mathable() {
            @Override
            public double addition(double a, double b) {
                return 0;
            }

            @Override
            public double multiply(double a, double b) {
                return 0;
            }
        };

    }
}
