import java.util.ArrayList;
import java.util.Scanner;

public class Learner extends Person {
    private ArrayList<Double> notes;
Class classe;
public  int id;
    static ArrayList<Class> classes = new ArrayList<>();
   static ArrayList<Learner> learners = new ArrayList<>();

    public Learner(double notes, Class classe,String firstname, String lastname, int ID, String email, int numtelph) {
        super(firstname,lastname,ID,email,numtelph);
        this.notes = new ArrayList<>();
        this.classe = classe;
    }
    public Learner(String firstname,String lastname, int id , String email , int numtelph){
        super(firstname,lastname,id,email,numtelph);
    }

    public Learner() {
        super();
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }

    public void setNotes(double notes) {
        this.notes = new ArrayList<>();
    }



    public void addlearner(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name :");
        String firstname = sc.nextLine();
        System.out.println("Enter the last name :");
        String lastname = sc.nextLine();
        System.out.println("Enter  telephone number:");
        int numtelph = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter email :");
        String email = sc.nextLine();

        System.out.println("Enter notes  : ");
        double notes = sc.nextDouble();
        sc.nextLine();

        Learner l = new Learner(notes,classe,firstname,lastname,id,email,numtelph);
        learners.add(l);
        System.out.println("---adding learner  Succeeded---");
        id++;
    }
//    public Class recherche(String nom){
//        for (Class c : classes){
//            if(c.getClassName().equals(nom)) return c;

//        }
//        return null;
//
//    }



    public void Display() {

        for (Learner learner : learners) {
            System.out.println("id: " + learner.getID() + "fistName: " + learner.getFirstname() + "lastName: " + learner.getLastname() + "Email: " + learner.getEmail() + "telephone: " + learner.getNumtelph());
        }


    }
}

