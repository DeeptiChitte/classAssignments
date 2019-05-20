import java.sql.SQLOutput;

public class labJava {


    public static void main(String[] args) {
//Lab #1
        int firstInt = 6;
        int secondInt = 20;
        int thirdInt;
        float f = 4.4f;
        boolean isCold = false;
        String d = "_";

        System.out.println(firstInt);
        System.out.println(secondInt);
//        System.out.println(thirdInt);
        System.out.println(f);
        System.out.println(isCold);
        System.out.println(d);
//Lab#2
        System.out.println(firstInt + secondInt);
//        System.out.println(thirdInt + firstInt);
        System.out.println(secondInt / firstInt);
        System.out.println(secondInt % firstInt);


        int newInt = secondInt / firstInt;
        System.out.println(newInt);
        int newerInt = newInt + firstInt;
        System.out.println(++newerInt);

        // Lab #3
        int x = 100;

        boolean b = true;
        b = x == 100;
        int y = 106;
        int y1 = y - 6;
        System.out.println(x > y);
        System.out.println(y > x);
        System.out.println(x > y1);

        int z = 92;
        System.out.println(x < y && y < z);
        System.out.println(y < z && x >= y);
        System.out.println(z > (y + x) || (x - y) < z);

        System.out.println((x < y) == !(x > y));

//        Lab #4
//        int n = 64;
//        int n1 = n>>1;
//        int n2 = n/2;
//        int n3 = n<<1;
//        int n4 = n*2;
//        System.out.println(n1 == n2);
//        System.out.println(n3 == n4);


//        int n = 40;
//        int n1 = n>>1;
//        int n2 = n/2;
//        int n3 = n<<1;
//        int n4 = n*2;
//        System.out.println(n1 == n2);
//        System.out.println(n3 == n4);


//        int n = 40;
//        int n1 = n>>2;
//        int n2 = n/4;
//        int n3 = n<<2;
//        int n4 = n*4;
//        System.out.println(n1 == n2);
//        System.out.println(n3 == n4);

        int n = 41;
        int n1 = n >> 1;
        int n2 = n / 2;
        int n3 = n << 1;
        int n4 = n * 2;
        System.out.println(n1 == n2);
        System.out.println(n3 == n4);

        anotherMethod();
        playWithStrings();

    }


//    public static void anotherMethod() {
//        int justInt = 450;
//        if (justInt > 1000) {
//            System.out.println(justInt +" " +"is a Big Value");
//        }
//
//            else
//        {System.out.println( justInt +" " +"is not a big value");
//        }
//
//    }
      public static void anotherMethod() {
          int justInt = 450;
//    int justInt1 = justInt/2;
          if (justInt > 1000) {
              System.out.println(justInt + " " + "is a Big Value");
          } else {
              System.out.println(justInt + " " + "is not a big value");
          }
          // Lab #6
          Integer justInt2 = justInt / 2;
          Integer thousand = Integer.valueOf("1000");
          if (thousand.compareTo(justInt) < 0) {
              System.out.println(justInt2 + " is half a big variable.");
          } else {
              System.out.println(justInt2 + " half value is definitely small.");
          }
      }

//Lab #7
          public static void playWithStrings() {
              String FirstName = "Deepti";
              String LastName = "Chitte";
              String FullName = FirstName.concat(" " + LastName);
              System.out.println("Hello " + FirstName + " " + LastName);
              System.out.println("The total length is " + FullName.length());
              if (FullName.contains("o")) {
                  System.out.println(FullName.indexOf('o'));

              } else {
                  System.out.println("FullName does not contain o");
              }
              System.out.println("The character at position 7 is " + FullName.charAt(7));
              if (FullName.contains("son")) {
                  System.out.println("The string contains son.");
              }
              else {
                  System.out.println("The string does not contain son.");
              }

              System.out.println("The last 5 characters are " + FullName.substring(FullName.length()-5));
              if (FullName.contains("\'") && FullName.contains("-")) {
                  System.out.println("The string contains both an apostrophe and a dash.");
              }
              else if (FullName.contains("\'") ) {
                  System.out.println("The string contains an apostrophe.");
              }
              else if (FullName.contains("-")) {
                  System.out.println("The string contains a dash.");
              }
              else {
                  System.out.println("The string contains neither an apostrophe nor a dash.");
              }


    }




}
