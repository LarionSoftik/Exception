import java.io.EOFException;

public class Main {
    public static void main(String[] args) throws EOFException {
        Car ford = new Car("Ford", 170, 10000);
        ford.start();
    }
}
