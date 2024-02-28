package JavaCore.Level_3.task_17;
// package en.javarush.task.jdk13.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Describing numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String num1 = reader.readLine();
        int number1 = Integer.parseInt(num1);
        
        boolean one = (number1 >= 1 && number1 < 10);
        boolean two = (number1 > 9 && number1 < 100);
        boolean three = (number1 > 99 && number1 < 1000);
        
        if(one) {
            if(0 == (number1 % 2)) {
                System.out.println("even single-digit number");
            } else {
                System.out.println("odd single-digit number");
            }
        }
        if(two) {
            if(0 == (number1 % 2)) {
                System.out.println("even two-digit number");
            } else {
                System.out.println("odd two-digit number");
            }
        }
        
        if(three) {
            if(0 == (number1 % 2)) {
                System.out.println("even three-digit number");
            } else {
                System.out.println("odd three-digit number");
            }
        }
    }
}

