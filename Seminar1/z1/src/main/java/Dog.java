import interfaces.Goable;

import java.time.LocalDate;

public class Dog extends Animal implements Goable {
    public Dog(String name, LocalDate birthday, Illness illness){
        super(name, birthday, illness);
    }


    public Dog() {
    }

    @Override
    public void fly() {
        System.out.println(name + " летать не может");
    }

    @Override
    public void eat() {
        System.out.println(" грызет");
    }

    @Override
    public double go() {
        return 5;
    }
}
