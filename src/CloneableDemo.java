class Course implements Cloneable{
    public String subject1;
    public String subject2;
    public String subject3;

    public Course(String subject1, String subject2, String subject3) {
        this.subject1 = subject1;
        this.subject2 = subject2;
        this.subject3 = subject3;
    }

    public Course clone() {
        try {
            return (Course) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", subject1, subject2, subject3);
    }
}

class Student implements Cloneable {
    public int id;
    public String name;
    public Course courses;

    public Student(int id, String name, Course courses) {
        this.id = id;
        this.name = name;
        this.courses = courses;
    }

    public Student ShallowCopy() {
        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Student DeepCopy() {
        try {
            Student student = (Student) super.clone();
            student.courses = (Course) courses.clone();
            return student;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format(" id: %d\n name: %s\n courses: %s", id, name, courses);
    }
}

public class CloneableDemo {
    public static void main(String[] args) {
        Course scienceGrpA = new Course("Physics", "Chemistry", "Maths");

        Student s1 = new Student(100, "John", scienceGrpA);
        System.out.println("s1");
        System.out.println(s1);

        // Shallow copy, default behavior
        Student s2 = s1.ShallowCopy();
        System.out.println("s2");
        System.out.println(s2);

        s2.courses.subject3 = "Biology";
        System.out.println("s1 (I changed subject3 of s2, it also changed subject3 of s1 due to shallow copy)");
        System.out.println(s1);

        // Deep copy, custom behavior
        Course scienceGrpB = new Course("Physics", "Chemistry", "Biology");
        Student s3 = new Student(200, "Hannah", scienceGrpB);
        System.out.println("s3");
        System.out.println(s3);

        Student s4 = s3.DeepCopy();
        s4.courses.subject3 = "Maths";
        System.out.println("s3 (Even after changing subject3 of s4, It will not affect s3");
        System.out.println(s3);
    }
}
/*
 * Note:
 * - Marker Interface
 * - clone() is a protected methode of Object class is used
 * - By default super.clone() return copy of this object which is of Object type. Hence, we need to type cast it.
 * - Without implementing Cloneable interface it throws CloneNotSupportedException exception
 * - Shallow copy
 * */
