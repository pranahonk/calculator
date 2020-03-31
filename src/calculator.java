import java.util.Scanner;
import java.lang.*;

public class calculator {
    public static void main(String[] args){
        System.out.println("Calculator");


        Scanner scan = new Scanner(System.in);


        System.out.println("Input Number: ");
        int firstValue = scan.nextInt();

        String[] menu = {"addition", "Subtraction", "Multipication", "Division", "Modulo", "Clear Total", "Exit"};

        for (int i = 0; i < menu.length ; i++) {
            System.out.println(i+1 +". " + menu[i]);
        }

        System.out.println("Operator [1...7]: ");
        int chooseMenu = scan.nextInt();

       System.out.println("Input Second Number");
       int secondValue = scan.nextInt();

       float total = 0;

       switch (chooseMenu){
           case 1 :
               total = firstValue + secondValue;
               break;
           case 2:
               total = firstValue - secondValue;
               break;
           case 3:
               total = firstValue * secondValue;
               break;
           case 4:
               total = firstValue / secondValue;
               break;
           case 5:
               total = firstValue % secondValue;
               break;
           case 6:
               total = 0;
               break;
           case 7:
               System.out.println("exit... bye");
               System.exit(0);
               break;
           default:
               System.out.println("input not found");
               break;
       }

        System.out.println("=====================");
        System.out.println("Total = " + total);
    }
}
