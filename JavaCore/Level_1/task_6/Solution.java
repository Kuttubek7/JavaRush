package JavaCore.Level_1.task_6;
// package en.javarush.task.jdk13.task01.task0107;

/* 
No comments needed
*/

public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}
