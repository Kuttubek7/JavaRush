package JavaCore.Level_3.task_10;
// package en.javarush.task.jdk13.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Positive and negative numbers
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
    
        if (nAge > 0) {
            nAge = nAge * 2;
            System.out.println(nAge);
        }
        if(nAge == 0) {
            System.out.println(nAge);
        }
        
        if (nAge < 0) {
            nAge = nAge + 1;
            if (nAge == 0) {
                System.out.println(nAge);
            } else {
                System.out.println(nAge);
            }
        } 

    }
}