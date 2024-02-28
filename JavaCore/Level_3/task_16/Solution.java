package JavaCore.Level_3.task_16;
// package en.javarush.task.jdk13.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Labels and numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();
        int number1 = Integer.parseInt(num1);
        
        boolean zero = (number1 == 0);
        boolean positive = (number1 > 0);
        boolean negative = (number1 < 0);
        
        if(zero) {
            System.out.println("Zero");
        }
        
        if(positive) {
            if (0 == (number1 % 2)) {
                System.out.println("Positive even number");
            } else {
            System.out.println("Positive odd number");
            }
        }
        if (negative) {
            if (0 == (number1 % 2)) {
                System.out.println("Negative even number");
            } else {
                System.out.println("Negative odd number");
            }
        }

    }
}
