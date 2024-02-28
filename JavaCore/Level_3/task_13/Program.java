package JavaCore.Level_3.task_13;
// package en.javarush.task.jdk13.task04.task0422;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
18+
*/

public class Program {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        
        String num1 = reader.readLine();
        int number1 = Integer.parseInt(num1);
        
        // if(number1 >= 18) {
        // }
        
        if (number1 < 18) {
            // System.out.println(s);
            System.out.print("Grow up a little more");
        } else {
            
        }
    }
}
