import java.time.LocalDate;

public class Fish extends Animal {
    private int finCount;

    public Fish(String name, LocalDate birthday, Illness illness, int finCount) {
        super(name, birthday, illness);
        this.finCount = finCount;
    }

    @Override
    public void fly() {
        System.out.println(name + " летать не может");
    }

    @Override
    public void eat() {
        System.out.println(" нямкает");
    }

    @Override
    public void toGo() {
        System.out.println(name + " ходить не может");
    }

}