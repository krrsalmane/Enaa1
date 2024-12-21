import java.util.ArrayList;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Learner learner = new Learner();
        int choice;
        Class make = new Class();
        do {
            System.out.println(" --- Main Menu --- ");
            System.out.println("1. Manage Learner");
            System.out.println("2. Manage Instructor");
            System.out.println("3. Manage Class");
            System.out.println("4. Exit");
            System.out.println("enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("======= Learner Menu ======");
                        System.out.println("1-Add Learner");
                        System.out.println("2-Display the Learner");
                        System.out.println("3-Delete Learner");
                        System.out.println("4-Modify on Leaner");

                        System.out.println("Enter the choice : ");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                learner.addlearner();
                                break;
                            case 2:
                                learner.Display();
                                break;
                            case 3:
                                //learner.delete();
                                break;
                            case 4:
                                // learner.modify();
                                break;

                            default:
                                System.out.println(" invalid choice!");
                        }

                    } while (choice != 5);
                    break;
                case 2:
                    do {

                        System.out.println("======= instructor Menu ======");
                        System.out.println("1-Add instructor");
                        System.out.println("2-Display the instructor");
                        System.out.println("3-Delete instructor");
                        System.out.println("4-Modify on instructor");


                        System.out.println("Enter the choice : ");
                        choice = sc.nextInt();

                        switch (choice) {
                            case 1:
                                learner.addlearner();
                                break;
                            case 2:
                                learner.Display();
                                break;
                            case 3:
                                make.create_class();
                                break;
                            case 4:

                                break;
                            case 5:

                                break;

                            default:
                                System.out.println(" invalid choice!");
                        }

                    } while (choice != 6);
                    break;
                case 3:
                    do {

                        System.out.println("======= Class Menu ======");
                        System.out.println("1-create class");
                        System.out.println("2-Display the Class");
                        System.out.println("3-Delete Class");
                        System.out.println("4-Modify on Class");


                        System.out.println("Enter the choice : ");
                        choice = sc.nextInt();
                        Class ss = new Class();
                        switch (choice) {
                            case 1:
                               ss.create_class();
                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:

                                break;
                            case 5:

                                break;

                            default:
                                System.out.println(" invalid choice!");
                        }

                    } while (choice != 5);
                case 4:
                    break;


            }

       }while (choice != 4) ;
    }}


