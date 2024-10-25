import java.util.ArrayList;
import java.util.Scanner;

class Patient {
    private String name;
    private int age;
    private String illness;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getIllness() {
        return illness;
    }

    @Override
    public String toString() {
        return "Patient: " + name + ", Age: " + age + ", Illness: " + illness;
    }
}

class Doctor {
    private String name;
    private String specialization;
    private String hospital;

    public Doctor(String name, String specialization, String hospital) {
        this.name = name;
        this.specialization = specialization;
        this.hospital = hospital;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getHospital() {
        return hospital;
    }

    @Override
    public String toString() {
        return "Doctor: " + name + ", Specialization: " + specialization + ", Hospital: " + hospital;
    }
}

public class Main {
    private static ArrayList<Patient> patients = new ArrayList<>();
    private static ArrayList<Doctor> doctors = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void addPatient() {
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.nextLine(); 
        String illness = scanner.nextLine();

        patients.add(new Patient(name, age, illness));
        System.out.print("");
    }

    public static void addDoctor() {
        String name = scanner.nextLine();
        String specialization = scanner.nextLine();
        String hospital = scanner.nextLine();

        doctors.add(new Doctor(name, specialization, hospital));
        System.out.print("");
    }

    public static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients found.");
        } else {
            for (Patient patient : patients) {
                System.out.println(patient);
            }
        }
    }

    public static void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors found.");
        } else {
            for (Doctor doctor : doctors) {
                System.out.println(doctor);
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    addDoctor();
                    break;
                case 3:
                    viewPatients();
                    break;
                case 4:
                    viewDoctors();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return; 
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
