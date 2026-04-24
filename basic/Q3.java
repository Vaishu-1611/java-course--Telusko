class Student {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vaishu";
        s1.age = 20;
        s1.display();
    }
}