package JavaCore.Level_2.task_10;
// package en.javarush.task.jdk13.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
How to take over the world
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sAge = reader.readLine();
        int nAge = Integer.parseInt(sAge);
        System.out.println(name + " will take over the world in " + sAge + " years. Mwa-ha-ha!");
    }
}
