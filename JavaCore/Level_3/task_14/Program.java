package JavaCore.Level_3.task_14;
// package en.javarush.task.jdk13.task04.task0423;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Bouncer policy
*/

public class Program {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        
        String num1 = reader.readLine();
        int number1 = Integer.parseInt(num1);
        
        if (number1 > 20) {
            System.out.println("18 is old enough");
        }
    }
}
