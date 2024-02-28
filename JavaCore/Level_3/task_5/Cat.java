package JavaCore.Level_3.task_5;
// package en.javarush.task.jdk13.task04.task0405;

/* 
Setting the number of cats
*/

public class Cat {
    private static int catCount = 0;

    public static void setCatCount(int catCount) {
        Cat cats = new Cat();
        cats.catCount = catCount;
        // catCount = catCount + 1;
        // System.out.println(cats.catCount);
    }
    
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setCatCount(5);
        // System.out.println(cat.catCount);
    }
}
