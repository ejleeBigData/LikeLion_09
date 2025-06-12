class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void display() {
        System.out.println("브랜드 : " + brand);
    }
}

class Car extends Vehicle {
    String model;

    public Car(String brand, String model) {
         super(brand);
        this.model = model;
    }

    public void display() {
        super.display();
        System.out.println("모델 : " + model);
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle mycar = new Car("현대", "레이");
        Car car = new Car("GM", "SUB");


        car.display();
        mycar.display();
    }
}