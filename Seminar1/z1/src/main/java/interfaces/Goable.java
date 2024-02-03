package interfaces;

public interface Goable {
    public static final double PI = 3.1415926;
    double go();

    default void defaultGO(double speed){
        System.out.println("Объект движется со скоростью " + speed);
    }


}
