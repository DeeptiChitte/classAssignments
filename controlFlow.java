import java.util.Scanner;

public class controlFlow
{

    public static void main(String[] args) {
        // scanner reads input from the command line through various methods
        Scanner scanner = new Scanner(System.in);
        char answer;
        do {

        // prompt and read a string
        System.out.print("Enter your name: ");
        String username = scanner.next();

        // prompt and read an int
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        //Employment status
        System.out.println("Enter your employment status:'E' for employed, 'U' for unemployed, 'S' for student  ");
        String status = scanner.next();

        System.out.println(String.format("Hello %s, your age is %d ", username, age, status));
        switch (status) {
            case "E":
            case "e":
                System.out.println("You are employed and you own an SUV");
                break;
            case "U":
            case "u":
                System.out.println("You are unemployed and you take bus");
                break;
            case "S":
            case "s":
                System.out.println("You are a student ann you use a scooter");
        }

//Lab #1
        if (age >= 16) {
            System.out.println("You are old enough to drive");
        } else {
            System.out.println("Don't you dare!!!");
        }
        if (age >= 18) {
            System.out.println("You are old enough to vote");
        } else {
            System.out.println("Don't you dare!!!");
        }
        if (age >= 21) {
            System.out.println("You are old enough to drink");
        } else {
            System.out.println("Don't you dare!!!");
        }
        if (age >= 35) {
            System.out.println("You are old enough to be President");
        } else {
            System.out.println("Don't you dare!!!");
        }
        if (age >= 55) {
            System.out.println("You can join AARP");
        } else {
            System.out.println("Don't you dare!!!");
        }
        if (age >= 67) {
            System.out.println("You start drawing Social Security");
        } else {
            System.out.println("Don't you dare!!!");
        }

            //for loops

//        int[] myArray = new int[30];
//        for (int i=0; i<30; i++) {
//            myArray[i] = i;
//        }

//        for (int item : myArray) {
//            System.out.println(item);
//        }
//        int[] myArray1 = new int[60];
//        for (int i=0; i<60; i++) {
//            myArray1[i] = i;
//        }
//
//        for (int item : myArray1) {
//            System.out.println(item);
//        }
//
//        for (int i = myArray.length - 1; i >= 0; --i)
//        {
//            System.out.println(myArray[i]);
////        }
            //While loop
//            int[] myArray = new int[30];
//            int i = 0;
//            while (i < myArray.length) {
//                System.out.println(myArray[i]);
//                i++;
//            }
         //   int i = myArray.length - 1;
//            while (i > 0) {
//                System.out.println(myArray[i]);
//                i--;
//            }
          //Do while loop
            System.out.print("Do you want to answer the questions again? Enter Y or N: ");
            answer = scanner.next().toUpperCase().charAt(0);
        } while(answer == 'Y');
    }

    //Lab #5
    public static int stepFive (int b){
//        int[] myArray = new int[30];
//        for (int i=0; i<30; i++) {
//            myArray[i] = i;
//            System.out.println(myArray[i]);
//        }
//        for (int item: myArray){
//            if (item == b) break;
//            if(item%2 !=0){
//                continue;
//            }
//            else if (item%2 == 0){
//                System.out.println(item);
//            }
//        }
        int[] myArray = new int[30];
        int sum = 0;
        for (int i=0; i<myArray.length; i++) {
            myArray[i] = i;
            System.out.println("int i " + i + "= myArray[" + myArray[i] + "]");
        }
        for (int item : myArray){
            if (item == b) {
                System.out.println("The total sum of even numbers is" + sum);
            }
            if (item%2!=0){
                System.out.println(item);
            }
            else if (item%2 == 0){
                System.out.println(sum += item);
                System.out.println(String.format("The previous sum %d plus the content value %d equals %d equals %d" ,sum, item, sum+item));
            }
        }
        return sum;
    }
    }


