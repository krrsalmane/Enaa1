import java.util.ArrayList;
import java.util.Scanner;

public class Learner extends Person {
    private ArrayList<Double> notes;
Class classe;
public static int id;
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





    }


