package JavaCore.Level_3.task_18;
// package en.javarush.task.jdk13.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Positive number
*/

public class Solution {
    public static int res = 0;
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
        
        int res = 0;
        
        if(number1 > 0 && number1 != 0) {
            res++;
        } 
        if(number2 > 0 && number2 != 0) {
            res++;
        }
        if(number3 > 0 && number3 != 0) {
            res++;
        }
        
        System.out.println(res);

    }
}
