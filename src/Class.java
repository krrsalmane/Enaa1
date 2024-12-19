import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Class {
        private String className;
        private  Instructor instructor;
        ArrayList<Learner>learner = new ArrayList<Learner>();

    public Class(String className, Instructor instructor, ArrayList<Learner> learner) {
        this.className = className;
        this.instructor = instructor;
        this.learner = learner;
    }
    public Class(){}

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Learner> getLearner() {
        return learner;
    }

    public void setLearner(ArrayList<Learner> learner) {
        this.learner = learner;
    }

    // Getter and setter
        public String getClassName() {
            return className;
        }
        public void setClassName(String className) {
            this.className = className;

        }
        Learner st = new Learner();

    Scanner sc = new Scanner(System.in);
    public void make_class() {
        System.out.println("enter the of the class :");
        String name = sc.nextLine();
        System.out.println("enter Instructor name :");
        String k = sc.nextLine();
        st.addlearner();
    }
        }



