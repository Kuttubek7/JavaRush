package JavaCore.Level_3.task_7;
// package en.javarush.task.jdk13.task04.task0407;

/* 
Count the number of cats
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.count++;

        Cat cat2 = new Cat();
        cat2.count++;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}