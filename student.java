import java.util.Scanner;

class Student {
    private String name;
    private int grade;
    private int[] marks;

   
    public Student(String name, int grade, int[] marks) {
        this.name = name;
        this.grade = grade;
        setMarks(marks);
    }

    public void setMarks(int[] marks) {
        this.marks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 0 && marks[i] <= 100) {
                this.marks[i] = marks[i];
            } else {
                this.marks[i] = 0; 
            }
        }
    }

    public double calculateAverage() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return (double) total / marks.length;
    }

    public void printStudentDetails() {
        System.out.println("Student Object Created:");
        System.out.println("name: " + name);
        System.out.println("grade: " + grade);
        System.out.print("marks: [");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]);
            if (i < marks.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println();
        System.out.printf("Average marks: %.1f\n", calculateAverage());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int grade = scanner.nextInt();
        scanner.nextLine();
        String[] marksInput = scanner.nextLine().split(",");
        int[] marks = new int[marksInput.length];
        for (int i = 0; i < marksInput.length; i++) {
            marks[i] = Integer.parseInt(marksInput[i]);
        }

      
        Student student = new Student(name, grade, marks);

        student.printStudentDetails();
    }
}
