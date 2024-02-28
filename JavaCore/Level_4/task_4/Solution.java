package JavaCore.Level_4.task_4;
// package en.javarush.task.jdk13.task04.task0433;

/* 
Seeing dollars in your future
*/

public class Solution {
    public static void main(String[] args) {
        String s = "$$$$$$$$$$";
        int i = 10;
        while(i > 0) {
            System.out.println(s);
            i--;
        }

    }
}