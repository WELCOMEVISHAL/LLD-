package builderDP;

import java.util.Objects;

public class Main {
    public static void main(String[] args){
        StudentHelper h = new StudentHelper()
            .setAge(-1)
            .setEmail("abc@gmail.com")
            .setPsp(10.00);

//        Student s = h.build();
//        StudentHelper h2 = new StudentHelper();
//        Student s2 = new Student(h2);

        System.out.println("break");
    }

    public class Student {
    String name;
    int id;
    double psp;
    int age;
    int gradYear;
    String email;
//    public Student(StudentHelper h) {
//        if (h.age < 10) {
//            throw new IllegalArgumentException("age can't be less than 10");
//        }
//
//        if (Objects.equals(h.getEmail(), "")) {
//            throw new IllegalArgumentException();
//        }
//
//        this.age = h.age;
//        this.email = h.email;
//        this.name = h.name;
//        this.psp = h.psp;
//        this.id = h.id;
//        if (h.gradYear != 0) {
//            this.gradYear = h.gradYear;
//        }
//
//        static Student getInstance () {
//            return new Student();
//        }
//    }
    }
}
