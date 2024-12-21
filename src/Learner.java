import java.util.ArrayList;
import java.util.Scanner;

public class Learner extends Person {
    private ArrayList<Double> notes;
    Class classe;
    public int id;
     public ArrayList<Class> classes = new ArrayList<>();
    public ArrayList<Learner> learners = new ArrayList<>();

    public Learner(ArrayList notes, Class classe, String firstname, String lastname, int ID, String email, int numtelph) {
        super(firstname, lastname, ID, email, numtelph);
        this.notes = notes;
        this.classe = classe;
    }

    public Learner(String firstname, String lastname, int id, String email, int numtelph) {
        super(firstname, lastname, id, email, numtelph);
    }

    public Learner() {
        super();
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }

    public void setNotes(ArrayList notes) {
        this.notes = notes;
    }



public void addlearner() {

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

    // Create a list to hold the notes
    ArrayList<Double> notes = new ArrayList<Double>();

    System.out.println("Please enter how many notes you want:");
    int numberOfNotes = sc.nextInt();
    sc.nextLine(); // Consume newline
    double note;

    // Collect the notes from the user
    for (int i = 0; i < numberOfNotes; i++) {
        System.out.println("Please enter learner note " + (i + 1) + ":");
        note = sc.nextDouble();
        sc.nextLine(); // Consume newline
        notes.add(note);
    }

    // Create a new Learner object with the gathered data
    Learner l = new Learner(notes, classe, firstname, lastname, id, email, numtelph);

    // Add the new learner to the learners list
    learners.add(l);
    System.out.println("--- Adding learner succeeded ---");

    // Increment the ID for the next learner
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
            System.out.println("id: " + learner.getID() + "\n fistName: " + learner.getFirstname()+ "\n lastName: " + learner.getLastname() + "\n Email: " + learner.getEmail() + "\n telephone: " + learner.getNumtelph() );
            System.out.println("\n notes");
            for ( double note : learner.getNotes() ) {
                System.out.println(note);
            }
        }}
        public void Delete() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the ID of the Learner: ");
            int id = sc.nextInt();
            Learner lear =null;
            for (Learner l : learners) {
                if (l.getID()==id) {
                    lear = l;
                }
            }if (lear != null){
                learners.remove(lear);
                System.out.println("Learner delete succeeded!");
            }else {
                System.out.println("it's not there");
            }
        }


    public void Modify() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ID of the Learner: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        boolean found = false; // Flag to track if the learner is found

        for (Learner l : learners) {
            if (l.getID() == id) { // Compare IDs
                System.out.println("Enter the new first name:");
                String firstname = sc.nextLine();
                l.setFirstname(firstname);

                System.out.println("Enter the new last name:");
                String lastname = sc.nextLine();
                l.setLastname(lastname);

                System.out.println("Enter the new telephone number:");
                int numtelph = sc.nextInt();
                l.setNumtelph(numtelph);
                sc.nextLine(); // Consume the newline character

                System.out.println("Enter the new email:");
                String email = sc.nextLine();
                l.setEmail(email);

                // Handle modifying multiple notes (similar to the original function)
                System.out.println("Enter the number of notes you want to modify:");
                int numberOfNotes = sc.nextInt();
                sc.nextLine(); // Consume the newline character
                ArrayList<Double> notes = new ArrayList<>();

                for (int i = 0; i < numberOfNotes; i++) {
                    System.out.println("Enter the new note:");
                    double note = sc.nextDouble();
                    sc.nextLine(); // Consume the newline character
                    notes.add(note);
                }
                l.setNotes( notes ); // Assuming Learner class has a setNotes method

                System.out.println("Learner modified successfully!");
                found = true;
                break; // Exit the loop after finding the learner
            }
        }

        if (!found) {
            System.out.println("Learner with the given ID not found.");
        }
    }



}


