class Vehicle {
    int wheels, speed;

    Vehicle(int wheels, int speed) {
        this.wheels = wheels;
        this.speed = speed;
    }
}

class Car extends Vehicle {
    int passengers;

    Car(int wheels, int speed, int passengers) {
        super(wheels, speed);
        this.passengers = passengers;
    }
}

class Truck extends Vehicle {
    int loadLimit;

    Truck(int wheels, int speed, int loadLimit) {
        super(wheels, speed);
        this.loadLimit = loadLimit;
    }
}

public class pro14 {
    public static void main(String[] args) {
        Car c = new Car(4, 80, 4);
        Truck t = new Truck(6, 60, 1000);
        System.out.printf("Car: Wheels: %d, Speed: %d, Passengers: %d\n", c.wheels, c.speed,
                c.passengers);
        System.out.printf("Truck: Wheels: %d, Speed: %d, Load Limit: %d\n", t.wheels, t.speed, t.loadLimit);
        if (c.speed > t.speed) {
            System.out.println("Car is faster than Truck");
        } else if (c.speed < t.speed) {
            System.out.println("Truck is faster than Car");
        } else {
            System.out.println("Car and Truck have same speed");
        }
    }
}