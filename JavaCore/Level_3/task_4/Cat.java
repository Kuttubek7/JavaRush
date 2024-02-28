package JavaCore.Level_3.task_4;
// package en.javarush.task.jdk13.task04.task0404;

/* 
Cat register
*/

public class Cat {
    private static int catCount = 0;

    public static void addNewCat() {
        catCount++;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.addNewCat();
        // Cat cat1 = new Cat();
        // cat.addNewCat();
        // System.out.println(cat.catCount);
    }
}
