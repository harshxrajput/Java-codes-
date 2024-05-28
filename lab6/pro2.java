interface Motor {
    int getCapacity();

    void run();

    void consume();
}

class WashingMachine implements Motor {
    private int capacity;

    public WashingMachine(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void run() {
        System.out.println("Washing machine motor is running...");
    }

    public void consume() {
        System.out.println("Washing machine motor is consuming energy...");
    }
}

public class pro2 {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine(5);

        System.out.println("Capacity of the motor is " + washingMachine.getCapacity() + " kg");
    }
}
