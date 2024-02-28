package JavaCore.Level_4.task_7;
// package en.javarush.task.jdk13.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Drawing a rectangle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();
        int number1 = Integer.parseInt(num1);
        // System.out.println(number1);
        
        String num2 = reader.readLine();
        int number2 = Integer.parseInt(num2);
        // System.out.println(number2);
        
        int x = 8;
        
        for(int i = 0; i < number1; i++) {
            for(int j = 0; j < number2; j++) {
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
