import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {


    public  static  void main(String[] args) {
        Learner learner = new Learner();
        Class make = new Class();
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Menu pricipale ----------");
        System.out.println("1-add Ap");
        System.out.println("2-display Ap");
        System.out.println("3-make a class");


        int choice;
        System.out.println("Enter le choice : ");
        choice = sc.nextInt();
        do {
            switch (choice){
                case 1 :
                    learner.addlearner();
                    break;
                case 2:
                    learner.Display();
                    break;
                case 3:
                    make.make_class();
                    break;
                default:
                    System.out.println(" invalid choice!");
            }

        }while (choice!=3);

    }

}



