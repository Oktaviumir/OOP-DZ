import java.time.LocalDate;

public class Dog extends Animal {
    public Dog(String name, LocalDate birthday, Illness illness){
        super(name, birthday, illness);
    }

    @Override
    public void fly() {
        System.out.println(name + " летать не может");
    }

}
