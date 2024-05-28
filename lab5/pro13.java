class Distance {
    double distance;

    Distance(double distance) {
        this.distance = distance;
    }

    void travelTime() {
        System.out.println("Time taken to cover the distance when the speed is 60 miles per hour: " +
                distance / 60);
    }
}

class DistanceMKS extends Distance {
    DistanceMKS(double distance) {
        super(distance);
    }

    void travelTime() {
        System.out.println("Time taken to cover the distance when the speed is 100 km per second: " +
                distance / 100);
    }
}

public class pro13 {
    public static void main(String[] args) {
        Distance d = new Distance(270);
        d.travelTime();
        DistanceMKS d1 = new DistanceMKS(220);
        d1.travelTime();
    }
}