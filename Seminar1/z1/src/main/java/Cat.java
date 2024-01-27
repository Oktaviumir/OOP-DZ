import java.time.LocalDate;

public class Cat extends Animal{
    public Cat(String name, LocalDate birthday, Illness illness){
        super(name, birthday, illness);
    }

    @Override
    public void swim() {
        System.out.println(name + " не умеет плавать");
    }

    @Override
    public void fly() {
        System.out.println(name + " не умеет летать");
    }
}
