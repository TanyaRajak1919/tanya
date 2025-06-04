
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + " " + name;
    }

    public int compareTo(Student s) {
        return this.age - s.age;

    }

}

class date2_6 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(19, "tannu"));
        list.add(new Student(16, "laksh"));
        list.add(new Student(11, "isha"));
        list.add(new Student(51, "tanya"));

        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s.toString());
        }

        // list.add(0);
        // list.add(5);
        // list.add(6);

        // Collections.sort(list);
        // System.out.println(list);

    }

}