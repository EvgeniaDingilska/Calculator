package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean newCalculator = true;
        for (; newCalculator; ) {

            System.out.println("\n-------- Welcome to Calculator --------");
            System.out.printf("%20s%n %22s%n %25s%n %19s%n %15s%n", "1. Addition;", "2. Subtraction;", "3. Multiplication;", "4. Division;", "5. Exit;");
            System.out.print("Choose operation: ");
            int option = keyboard.nextInt();
            keyboard.nextLine();
            if (option > 0 && option < 6) {
                double num1 = 0, num2 = 0;
                switch (option) {
                    case 1:
                        num1 = getInput(keyboard,1);
                        num2= getInput(keyboard,2);
                        System.out.print("The result of Addition is: " + add(num1,num2));
                        break;
                    case 2:
                        num1 = getInput(keyboard,1);
                        num2= getInput(keyboard,2);
                        System.out.print("The result of Substraction is: " + sub(num1,num2));
                        break;
                    case 3:
                        num1 = getInput(keyboard,1);
                        num2= getInput(keyboard,2);
                        System.out.print("The result of Multiplication is: " + mul(num1,num2));
                        break;
                    case 4:
                        num1 = getInput(keyboard,1);
                        num2= getInput(keyboard,2);
                        System.out.print("The result of Division is: " + div(num1,num2));
                        break;
                    case 5:
                        newCalculator = false;
                        System.out.println("\n-------- Goodbye! --------");
                }
            }else System.out.println("The number is out of the scope");
        }




    }
    public static double getInput(Scanner keyboard, int index){
        System.out.print("Enter the number "+ index+" : ");
        return keyboard.nextDouble();
    }

    public static double add(double number1,double number2) {
        return number1 + number2;
    }

    public static double sub(double number1,double number2) {
        return number1 - number2;
    }

    public static double mul(double number1,double number2) {
        return number1 * number2;
    }

    public static double div(double number1,double number2) {
        return number1 / number2;
    }
}
