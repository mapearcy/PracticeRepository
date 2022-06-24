import java.util.Scanner;

public class Calculator {

    public void Calculator() {

    }

    public static int addNumbers(int firstNum, int secNum) {

        int sum = firstNum + secNum;

        return sum;
    }


    public static int multiplyNumbers(int firstNum, int secNum) {

        int sum = firstNum * secNum;

        return sum;
    }

    public static int subtractNumbers(int firstNum, int secNum) {

        int sum = firstNum - secNum;

        return sum;
    }

    public static boolean isDivisible(int firstNum, int secNum) {
        int sum = firstNum / secNum;
        int sum1 = firstNum % secNum;
        int sum2 = (firstNum % secNum) / 2;

        System.out.println("%n" + sum);
        System.out.println(sum1);
        System.out.println(sum2);

        // this is used to find ONLY the REMAINDER and the /2 is to find out if its even.
        if ((firstNum % secNum) == 0) {
            return true;
        }


        return false;
    }

    public static boolean isDivisible2() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a <= 0 && b <= 0) {
            System.out.println("your first input");
            a = sc.nextInt();
            System.out.println("your second input");
            b = sc.nextInt();
            continue;
        }
        int firstNum = a;
        int secNum = b;

        int sum = firstNum / secNum;
        int sum1 = firstNum % secNum;
        int sum2 = (firstNum % secNum) / 2;

        System.out.println("%n" + sum);
        System.out.println(sum1);
        System.out.println(sum2);

        // this is used to find ONLY the REMAINDER and the /2 is to find out if its even.
        if ((firstNum % secNum) == 0) {
            return true;
        }


        return false;
    }

    public static String doSomething(String name) {
        System.out.println("name");
        return name;
    }


}
