package JavaCore.Level_4.task_8;
// package en.javarush.task.jdk13.task04.task0437;

/* 
Triangle of eights
*/

public class Solution {
    public static void main(String[] args) {
        int x = 8;

        for(int i = 1; i <= 10; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(x);
            }
            System.out.println();
        }

    }
}

// Программа должна отобразить прямоугольный 
// треугольник из восьмерок с основанием 10 и высотой 10.