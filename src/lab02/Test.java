
package lab02;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Test {
    public static void main(String[] args) {
        boolean cont = false;
        do {            
            try {
                String s = "";
                String pattern = "^SE[0-9]{4}$";
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the string: ");
                s = sc.nextLine();
                if(! s.matches(pattern)) 
                    throw new Exception();
                System.out.println("The string is "+ s);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid !");
                cont = true;
            }
        } while (cont);
    }
}
