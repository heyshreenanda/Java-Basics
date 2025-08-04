class Student {
    int rnum;
    String name;

    Student(int rnum, String name) {
        this.rnum = rnum;
        this.name = name;
    }
}

public class ArrObject {
    public static void main(String[] args) {
        Student arr[];
        arr = new Student[5];
        arr[0] = new Student(1, "abc");
        arr[1] = new Student(2, "jnkvj");

        System.out.println(arr[0].rnum + " " + arr[1].name);

    }
}