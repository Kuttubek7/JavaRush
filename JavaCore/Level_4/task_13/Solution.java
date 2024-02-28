package JavaCore.Level_4.task_13;
// package en.javarush.task.jdk13.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = 0;
        int res = 0;

        while(true) {
            number1 = Integer.parseInt(reader.readLine());
            
            if(number1 == -1) {
                res = res + -1;
                // System.out.println(number1);
                break;
            }
            res = res + number1;
            // System.out.println(res);
        }
        System.out.println(res);
    }
}

//   for(int inputtedNumber = 0; inputtedNumber != -1; sumOfInputtedNumbers = sumOfInputtedNumbers + inputtedNumber)
//     {
//         inputtedNumber = Integer.parseInt(reader.readLine());
//         if(inputtedNumber==-1){
//             System.out.println(sumOfInputtedNumbers);
//             break;
//         }
//     }
