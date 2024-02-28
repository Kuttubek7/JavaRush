package JavaCore.Level_3.task_11;
// package en.javarush.task.jdk13.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Day of the week
*/

public class Program {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        
        if (nAge == 1) {
            System.out.println("Monday");
        } 
        if (nAge == 2) {
            System.out.println("Tuesday");
        }
        if (nAge == 3) {
            System.out.println("Wednesday");
        }
        if (nAge == 4) {
            System.out.println("Thursday");
        }
        if (nAge == 5) {
            System.out.println("Friday");
        }
        if (nAge == 6) {
            System.out.println("Saturday");
        }
        if (nAge == 7) {
            System.out.println("Sunday");
        } 
        
        if(nAge > 7 || nAge < 1) {
            System.out.println("No such day of the week");
        }
        
    }
}