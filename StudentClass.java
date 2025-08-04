import java.util.Scanner;

class Student {
    String name;
    int rollNum;
    float marks;

    Student(String name, int rollNum, float marks) {
        this.name = name;
        this.rollNum = rollNum;
        this.marks = marks;
    }
}

class StudentClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student stu[] = new Student[3];
        stu[0] = new Student("abc", 10001, 100);
        stu[1] = new Student("abcdw", 10031, 90);
        stu[2] = new Student("abhbjc", 12201, 100);

        for (Student s : stu) {
            System.out.println("Name: " + s.name + "  roll number: " + s.rollNum + " marks: " + s.marks);
        }
        sc.close();
    }
}