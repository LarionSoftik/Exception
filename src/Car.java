import java.io.EOFException;
import java.util.Random;

public class Car {
    String model;
    int speed;
    int cost;

    public void start() throws EOFException {
        Random random = new Random();
        int z = random.nextInt(20);
        if (z % 2 == 0){
            throw new EOFException();
        } else {
            System.out.println("Автомобиль " + model + " завёлся");
        }
    }

    public void MyException(){
        return;
        }



    public Car() {
    }

    public Car(String model, int speed, int cost) {
        this.model = model;
        this.speed = speed;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
