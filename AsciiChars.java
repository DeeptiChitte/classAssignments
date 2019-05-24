import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class AsciiChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        char answer;


            //public static void printNumbers ()

            for (int i = 0; i <= 127; i++) {
                System.out.printf("%d \n", i, i);
            }

// public static void printLowerCase ()
            {
                for (int i = 97; i <= 122; i++) {
                    System.out.printf("%d : %c \n", i, i);

                }
            }
//public static void printUpperCase ()
            {
                for (int i = 65; i <= 90; i++) {
                    System.out.printf("%d : %c \n", i, i);

                }
            }
            System.out.print("Enter your name: ");
            String username = scanner.next();


            System.out.println(String.format("Hello %s ", username));

            System.out.print("Do you wish to continue Y or N: ");
            answer = scanner.next().toUpperCase().charAt(0);
        String answer2;
            if (answer == 'N') {
                System.out.println("Please return later to complete the survey.");

            } else {
                do {
                    System.out.println("Please continue below");


                    System.out.println("Do you have a red car? (yes, no):");
                    answer = scanner.next().toUpperCase().charAt(0);


                    String petName;
                    String petAge;
                    int luckyNumber;
                    String qbName;
                    int jerseyNum;
                    int carModYear;
                    String favActor;
                    int ranNum;
                    System.out.println("What is the name of your favorite pet?");
                    petName = scanner.next().toUpperCase();
                    System.out.println("What is the age of your favorite pet?");
                    petAge = scanner.next().toUpperCase();
                    System.out.println("What is your lucky number?");
                    luckyNumber = scanner.nextInt();
                    System.out.println("Do you have a favorite quarterback?");
                    qbName = scanner.next().toUpperCase();
                    System.out.println("What is their jersey number?");
                    jerseyNum = scanner.nextInt();


                    do {
                        System.out.println("What is the model year of your car?(2-digits only)");
                        carModYear = scanner.nextInt();
                    } while (carModYear > 99);


                    System.out.println("What is the name of your favorite actor/actress?");
                    favActor = scanner.next().toUpperCase();
                    System.out.println("Enter a random number between 1 and 50.");
                    ranNum = scanner.nextInt();

//For random number
                    int min = 1;
                    int max = 65;
                    int value;
                    {
                        Random r = new Random();
                        value = r.nextInt((max - min) + 1) + min;
                        //       System.out.println(value);
                    }
                    int magicBall;

                    magicBall = (jerseyNum * value) % 75;

                    System.out.println(magicBall);

//    For the 5 non-magic numbers
                    // 3rd letter of Petname
                    char c = petName.charAt(2);
                    System.out.println(petName.charAt(2));
                    int ascii = ((int) c)%65;
                    System.out.println(ascii);
                    //sum of
                    int sum1 = (carModYear + luckyNumber)%65;
                    System.out.println(sum1);
                    //sum
                    int sum2 =(Integer.parseInt(petAge + carModYear))%65;
                    System.out.println(sum2);
                    //qb+ petage + luckynumber
                    int sum3 = (Integer.parseInt(jerseyNum + petAge + luckyNumber))%65;
                    System.out.println(sum3);
                    System.out.println(42);

                    //Print out the lottery numbers
                    int[] array = {ascii, sum1, sum2, sum3, 42};
                    System.out.println("Lottery numbers: " + Arrays.toString(array) + "Magic Ball:" + magicBall);

                    System.out.println("do u want to do it again?");
                     answer2 = scanner.next().toLowerCase();
                }while(answer2 =="y");
                System.out.println("Thank you!!!");
            }


        scanner.close();
    }
}


