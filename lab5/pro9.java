class Building {
    int floors, rooms, footage;
 
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
    int bedrooms, bathrooms;

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
 
class Office extends Building {
    int telephones, tables;
 
    Office(int floors, int rooms, int footage, int telephones, int tables) {
        super(floors, rooms, footage);
        this.telephones = telephones;
        this.tables = tables;
    }
 
    void display() {
        super.display();
        System.out.println("Telephones: " + telephones);
        System.out.println("Tables: " + tables);
    }
} 
 
public class pro9 {
    public static void main(String[] args) {
        Office o = new Office(3, 10, 1000, 10, 20);
        o.display();
    }
}