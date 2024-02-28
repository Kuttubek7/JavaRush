package JavaCore.Level_3.task_15;
// package en.javarush.task.jdk13.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Quadrants
*/

public class Program {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num1 = reader.readLine();
        int a = Integer.parseInt(num1);
        
        String num2 = reader.readLine();
        int b = Integer.parseInt(num2);
        
        // первый квадрант
        // 4 6
        if(a > 0 && b > 0) {
            System.out.println("1");
        }
        
        // второй квадрант
        if(a < 0 && b > 0) {
            System.out.println("2");
        }
        
        // третий квадрант
        if(a < 0 && b < 0) {
            System.out.println("3");
        }
        
        // четвертый квадрант
        if(a > 0 && b < 0) {
            System.out.println("4");
        }
    }
}
