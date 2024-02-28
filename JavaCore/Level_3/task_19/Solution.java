package JavaCore.Level_3.task_19;
// package en.javarush.task.jdk13.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Positive and negative numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        String num1 = reader.readLine();
        int number1 = Integer.parseInt(num1);
        
        String num2 = reader.readLine();
        int number2 = Integer.parseInt(num2);
        
        String num3 = reader.readLine();
        int number3 = Integer.parseInt(num3);

        // System.out.println(number1);
        // System.out.println(number2);
        // System.out.println(number3);
        
        int positiv = 0;
        int negativ = 0;
        
        if (number1 > 0 && number1 != 0) {
            positiv++;
        } 
        if (number1 < 0 && number1 != 0){
            negativ++;
        }
        
        if (number2 > 0 && number2 != 0) {
            positiv++;
        } 
        if (number2 < 0 && number2 != 0) {
            negativ++;
        }
        
        if (number3 > 0 && number3 != 0) {
            positiv++;
        }
        if(number3 < 0 && number3 != 0) {
            negativ++;
        }
        
        System.out.println("Number of negative numbers: " + negativ);
        System.out.println("Number of positive numbers: " + positiv);
    }
}

