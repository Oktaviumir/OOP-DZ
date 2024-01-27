import java.time.LocalDate;

public class Animal {
    protected String name;
    protected LocalDate birthday;
    protected Illness illness;

    public Animal(String name, LocalDate birthday, Illness illness){
        this.name = name;
        this.birthday = birthday;
        this.illness = illness;
    }

    public Animal(){
        this("Вася", LocalDate.now(), new Illness("Чумка"));
    }

    private void wakeUp(){
        System.out.println(getType() + " проснулся");
    }

    private void wakeUp(String time){
        System.out.println(getType() + " проснулся в " + time);
    }

    private void hunt(){
        System.out.println(getType() + " охотится");
    }

    private void eat(){
        System.out.println(getType() + " кушает");
    }

    private void sleep(){
        System.out.println(getType() + " спит");
    }

    public void lifeCycle(){
        wakeUp();
        hunt();
        eat();
        sleep();
    }

    public void setIllness(Illness illness){ // даем доступ
        this.illness = illness;
    }

    public String getName() {  // Даем возможность просмотреть
        return name;
    }

    public LocalDate getBirthday(){
        return birthday;
    }

    public Illness getIllness(){
        return illness;
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return String.format("name = %s, birthday = %s, illness = %s", name, birthday, illness);
    }


    public void toGo() {
        System.out.println(name + " может ходить");
    }

    public void fly() {
        System.out.println(name + " может летать");
    }

    public void swim() {
        System.out.println(name + " может плавать");
    }
}
