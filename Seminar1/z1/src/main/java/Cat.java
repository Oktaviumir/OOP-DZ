import interfaces.Goable;
import interfaces.Huntable;

import java.time.LocalDate;

public class Cat extends Animal implements Huntable, Goable {
    public Cat(String name, LocalDate birthday, Illness illness){
        super(name, birthday, illness);
    }

    public Cat() {
    }

    @Override
    public void swim() {
        System.out.println(name + " не умеет плавать");
    }

    @Override
    public void eat() {
        System.out.println(" кушает");
    }

    @Override
    public void fly() {
        System.out.println(name + " не умеет летать");
    }

    @Override
    public double go() {
        return 7;
    }
}
