import java.util.ArrayList;
import java.util.Scanner;
public class Instructor extends Person {
//    private ArrayList<Double> notes;
//    Class classe;
    ArrayList<Instructor> instructors = new ArrayList<>();
    public int id;
    private double salary;
    private String specialty;
    public Instructor(String firstname, String lastname, int ID, String email, int numtelph, String specialty , Double salary) {
        super(firstname, lastname, ID, email, numtelph);
        this.salary = salary;
        this.specialty = specialty;
    }
    public Instructor(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void addInstructor() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name :");
        String firstname = sc.nextLine();
        System.out.println("Enter the last name :");
        String lastname = sc.nextLine();
        System.out.println("Enter telephone number:");
        int numtelph = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter email :");
        String email = sc.nextLine();
        System.out.println("enter specialty  :");
        String specialty = sc.nextLine();
        System.out.println("salary  $ : ");
        Double salary = sc.nextDouble();

        Instructor in = new Instructor(firstname, lastname, id, email, numtelph,specialty , salary);

        // Add the new learner to the learners list
       instructors.add(in);
        System.out.println("--- Adding learner succeeded ---");
        id++;
    }

}
