class Vehicle {
    protected int regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;
  
    public void showData() {
        System.out.println("Registration Number: " + this.regnNumber);
        System.out.println("Speed: " + this.speed);
        System.out.println("Color: " + this.color);
        System.out.println("Owner Name: " + this.ownerName);
    }
}
  
class Bus extends Vehicle {
    private int routeNumber;
 
    Bus(int routeNumber) {
        this.routeNumber = routeNumber;
    }
 
    public void showData() {
        System.out.println("This is a bus class");
        System.out.println("Route Number: " + this.routeNumber);
        super.showData();
    }
}
  
class Car extends Vehicle {
    private String manufacturerName;
 
    Car(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }
  
    public void showData() {
        System.out.println("This is a car class");
        System.out.println("Manufacturer Name: " + this.manufacturerName);
        super.showData();
    }
}
 
public class pro6_3 {
    public static void main(String[] args) {
        Bus bus = new Bus(69);
        bus.regnNumber = 6996;
        bus.speed = 120;
        bus.color = "black";
        bus.ownerName = "ashutosh";
        System.out.println("This is a vehicle class");
        bus.showData();
        System.out.println();
        Car car = new Car("Tata");
        car.regnNumber = 578;
        car.speed = 180;
        car.color = "red";
        car.ownerName = "bedi";
        System.out.println("This is a vehicle class");
        car.showData();
    }
}