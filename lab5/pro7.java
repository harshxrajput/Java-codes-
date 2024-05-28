class Staff {
    int code;
    String name;
 
    Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
 
class Teacher extends Staff {
    String subject;
    String publication;
 
    Teacher(int code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }
}
 
class Officer extends Staff {
    String grade;
 
    Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }
}
 
class Typist extends Staff {
    int speed;

    Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }
}
 
class RegularTypist extends Typist {
    int remuneration;
 
    RegularTypist(int code, String name, int speed, int remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }
}
 
class CasualTypist extends Typist {
    int dailyWages;
 
    CasualTypist(int code, String name, int speed, int dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }
}
 
public class pro7 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "Teacher", "oops", "first publication");
        Officer officer = new Officer(2, "Officer", "Grade A");
        RegularTypist regularTypist = new RegularTypist(3, "Regular Typist", 112, 1000);
        CasualTypist casualTypist = new CasualTypist(4, "Casual Typist", 60, 500);
        System.out.printf("""
                Teacher:
                Code: %d
                Name: %s
                Subject: %s
                Publication: %s
                \n""", teacher.code, teacher.name, teacher.subject, teacher.publication);
        System.out.printf("""
                Officer:
                Code: %d
                Name: %s
                Grade: %s
                \n""", officer.code, officer.name, officer.grade);
        System.out.printf("""
                Regular Typist:
                Code: %d
                Name: %s
                Speed: %d
                Remuneration: %d
                \n""", regularTypist.code, regularTypist.name, regularTypist.speed,
                regularTypist.remuneration);
        System.out.printf("""
                Casual Typist:
                Code: %d
                Name: %s
                Speed: %d
                Daily Wages: %d
                \n""", casualTypist.code, casualTypist.name, casualTypist.speed, casualTypist.dailyWages);
    }
}