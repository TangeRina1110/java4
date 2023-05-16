package Asem4.h1;

public class Student implements Comparable<Student> {
    private String Name;
    private int Mark;
    public Student(String fullName, int Mark) {
        this.Name = fullName;
        this.Mark = Mark;
    }

    @Override
    public int compareTo(Student o) {
        return o.Mark - this.Mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", Mark=" + Mark +
                '}';
    }
}

