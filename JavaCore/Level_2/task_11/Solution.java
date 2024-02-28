package JavaCore.Level_2.task_11;
// package en.javarush.task.jdk13.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Predictions
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        
        String sNumber = reader.readLine();
        int number1 = Integer.parseInt(sNumber);
        
        String number2 = reader.readLine();
        int nAge = Integer.parseInt(number2);
        System.out.println(name + " will receive " + number1 + " in " + number2 + " years.");
    }
}
