import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.random.RandomGenerator;

import static java.lang.Long.compare;

public class Main {

    public static void main(String[] args) {


        Calculator cal = new Calculator();
        boolean some = cal.isDivisible2();

        System.out.println(cal.isDivisible2());
        //another way to use the calculator class
        //System.out.println(some);


        /*
        String[] nameArray = {"Jess", "Barlian","Codey", "Mainer"};
        Set<String> names = new ArrayList<>();

        Iterator<String> it = names.iterator();

        //it.hasNext() checks a boolean if there is another name in the ArrayList
        while(it.hasNext()){
            String name = it.next();
            Calculator.doSomething(name);
        }

         */

        Integer int1 = 3;
        Integer int2 = 5;


        System.out.println("\n" + int1.compareTo(int2));

        System.out.println("\n" + compare(int1, int2));



    }
}
