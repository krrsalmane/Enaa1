import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {


    public  void main(String[] args) {
        Learner learner = new Learner();
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Menu pricipale ----------");
        System.out.println("1-add Ap");
        System.out.println("2-display Ap");

        int choix;
        System.out.println("Enter le choix : ");
        choix = sc.nextInt();
        do {
            switch (choix){
                case 1 :
                    learner.addlearner();
                    break;
                case 2:
                    learner.Display();
                default:
                    System.out.println(" invalid choice!");
            }

        }while (choix!=2);

    }

}



