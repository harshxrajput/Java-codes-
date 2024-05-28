import java.util.Scanner;

class Grader {
    int score;

    Grader(int score) {
        this.score = score;
    }

    public String letterGrade() {
        if (score >= 90)
            return "O";
        else if (score >= 80)
            return "E";
        else if (score >= 70)
            return "A";
        else if (score >= 60)
            return "B";
        else if (score >= 50)
            return "C";
        else
            return "F";
    }
}

public class pro5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = sc.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
            System.exit(0);
        }
        Grader g = new Grader(score);
        System.out.println("Grade: " + g.letterGrade());
    }
}