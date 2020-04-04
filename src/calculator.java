import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.*;

public class calculator {
    Scanner scan = new Scanner(System.in);
    int firstValue;
    int secondValue;
    int option;
    float total = 0;

    public static void main(String[] args){
        calculator myConst =  new calculator();
        System.out.println("Calculator");
        myConst.firstValue = scanValue("First Value: ");
        myConst.option = printOption();
        myConst.secondValue = scanValue("Second Value: ");
        System.out.println("=====================");
        calculateVal(myConst.option ,myConst.firstValue, myConst.secondValue);


        System.out.println("世界， 再见");
    }


    public static int scanValue(String val){
         int firsVal =  0;
        calculator myScan =  new calculator();

        try{
            System.out.println(val);
            firsVal = myScan.scan.nextInt();
        }
        catch (InputMismatchException e){
            System.err.println("Error: Anda harus masukan angka bulat positive");
        }
        catch (Exception e){
            System.err.println(e);
            e.printStackTrace();
        }

        return firsVal;

    }


    public static int printOption(){
        String[] menu = {"addition", "Subtraction", "Multipication", "Division", "Modulo", "Clear Total", "Exit"};
        int option = 0;
        calculator myScan = new calculator();
        for (int i = 0; i < menu.length ; i++) {
             System.out.println(i+1 +". " + menu[i]);
        }

        try{
            System.out.println("Operator [1...7]: ");
            option = myScan.scan.nextInt();
        }

        catch (InputMismatchException e){
            System.err.println(e);
            System.err.println("Error: Hanya Ada bilangan 1 sampai 7");
        }

        catch (Exception e){
            e.printStackTrace();
        }

        return option;

    }

    public static void calculateVal(int choosen, int firstValue, int secondValue){
        calculator myTotal = new calculator();

        switch (choosen){
            case 1 :
                myTotal.total = firstValue + secondValue;
        break;
            case 2:
                myTotal.total = firstValue - secondValue;
        break;
            case 3:
                myTotal.total = firstValue * secondValue;
        break;
            case 4:
                myTotal.total = firstValue / secondValue;
        break;
            case 5:
                myTotal.total = firstValue % secondValue;
        break;
            case 6:
                myTotal.total = 0;
        break;
        case 7:
            System.out.println("exit... bye");
            System.exit(0);
        break;
        default:
            System.err.println("ERR: masukan angka 1 sampai 7");
        break;
        }

        System.out.println("Total = " + myTotal.total);
    }

}