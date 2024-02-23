package prototype;

public class student implements Prototype<student>{
    int age;
    String Batch;
    String name;
    student(){

    }
    student(student s){
        this.age = s.age;
        this.name = s.name;
        this.Batch = s.Batch;
    }
    public student copy(){
        student s1 = new student(this);
        return s1;
    }
}
