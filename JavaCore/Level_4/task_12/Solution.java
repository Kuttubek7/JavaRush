package JavaCore.Level_4.task_12;
// package en.javarush.task.jdk13.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Somewhere in the middle
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();
        int a = Integer.parseInt(num1);
        
        String num2 = reader.readLine();
        int b = Integer.parseInt(num2);
        
        String num3 = reader.readLine();
        int c = Integer.parseInt(num3);
        
        if (a > b && a < c || a < b && a > c || a == b || a == c)
            System.out.println(a);
        else
            if (b > a && b < c || b < a && b > c || b == a || b == c)
                System.out.println(b);
            else
                System.out.println(c);


        // System.out.println(number1);
        // System.out.println(number2);
        // System.out.println(number3);

    }
}

// 3 2 1
// 4 2 2

// if (((number1 > number2) && (number1 > number3)) || ((number1 < number2) && (number1 > number3))) {
//     System.out.println(number1);
// } else {
//     if (((number2 > number1) && (number2 < number3)) || ((number2 < number1) && (number2 > number3))) {
//             System.out.println(number2);
//         } else {
//             System.out.println(number3);
//         }
//     }