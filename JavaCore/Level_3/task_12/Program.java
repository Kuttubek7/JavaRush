package JavaCore.Level_3.task_12;
// package en.javarush.task.jdk13.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Minimum of two numbers
*/

public class Program {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine();
        int number1 = Integer.parseInt(num1);
        
        String num2 = reader.readLine();
        int number2 = Integer.parseInt(num2);
        
        if (number1 > number2 ) {
            System.out.println(number2);
        }
        if(number1 < number2) {
            System.out.println(number1);
        }
        if(number1 == number2) {
            System.out.println(number1);
        }
    }
}