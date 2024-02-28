package JavaCore.Level_3.task_6;
// package en.javarush.task.jdk13.task04.task0406;

/* 
Name register
*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        // System.out.println("setName: " + fullName);
        Cat cats = new Cat();
        this.fullName = fullName;
        // System.out.println("setName: " + this.fullName);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        String firstName = "Eshimkulov";
        String lastName = "Kuttubek";
        cat.setName(firstName, lastName);
        // System.out.println("main: " + cat.fullName);
    }
}
