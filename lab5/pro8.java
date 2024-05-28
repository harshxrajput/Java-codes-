class Building {
    int floors;
    int rooms;
    int footage;
 
    Building(int floors, int rooms, int footage) {
        this.floors = floors;
        this.rooms = rooms;
        this.footage = footage;
    }
 
    void display() {
        System.out.println("Floors: " + floors);
        System.out.println("Rooms: " + rooms);
        System.out.println("Footage: " + footage);
    }
}
 
class House extends Building {
    int bedrooms;
    int bathrooms;
 
    House(int floors, int rooms, int footage, int bedrooms, int bathrooms) {
        super(floors, rooms, footage);
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }
 
    void display() {
        super.display();
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Bathrooms: " + bathrooms);
    }
}
 
public class pro8 {
    public static void main(String[] args) {
        House h = new House(12, 42, 2000, 13, 8);
        h.display();
    }
}