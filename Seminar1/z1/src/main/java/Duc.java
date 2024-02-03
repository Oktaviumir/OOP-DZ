import java.time.LocalDate;

public class Duc extends Animal {
    private int wingCount;

    public Duc(String name, LocalDate birthday, Illness illness, int wingCount){
        super(name, birthday, illness);
        this.wingCount = wingCount;
    }


    @Override
    public void eat() {
        System.out.println(" клюет");
    }
}
