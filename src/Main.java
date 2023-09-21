/*I have neither given nor recieved any unauthorised aid on this piece of work */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input 1 number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please input another number");
        int secondNumber = scanner.nextInt();
        int resultOne = add(firstNumber,secondNumber);
        System.out.println(resultOne);


        System.out.println("please input your name");
        String name = scanner.next();
        String resultTwo = greeting(name);
        System.out.println(resultTwo);


        System.out.println("please input a number");
        int number1 = scanner.nextInt();
        System.out.println("please input a number");
        int number2 = scanner.nextInt();
        System.out.println("please input a number");
        int number3 = scanner.nextInt();
        System.out.println("please input a number");
        int number4 = scanner.nextInt();
        int resultThree = add(number1,number2,number3,number4);
        System.out.println(resultThree);


        System.out.println("please input anything");
        String toBePrinted = scanner.next();
        String resultFour = printMe(toBePrinted);

    }

        //add
        public static int add(int numOne, int numTwo){
            return numOne+numTwo;
        }

        //greeting
        public static String greeting(String name){
            return "Bonjour, " + name;
        }

        //add
        public static int add(int numOne, int numTwo, int numThree, int numFour){
            int oneTwo = add(numOne,numTwo);
            int threeFour = add(numThree,numFour);
            int sum = add(oneTwo,threeFour);
                    return sum;
        }

        //printMe
        public static void printMe(String toBePrinted){
        System.out.println(toBePrinted);


        }

}
