package JavaCore.Level_4.task_3;
// package en.javarush.task.jdk13.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();

        String num1 = reader.readLine();
        int number1 = Integer.parseInt(num1);
        
        while (number1 > 0) {
            System.out.println(s);
            number1--;
        }

    }
}
