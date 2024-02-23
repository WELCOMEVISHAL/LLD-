package prototype;

public class Main {
    public static void fillReistry(studentRegistry s1){
        InStudent i1 = new InStudent();
        s1.register("Intelligent",i1);
        student s = new student();
        s.Batch = "A";
        s1.register("Batch_A_Student",s);
    }
    public static void main(String[] args){
        studentRegistry s1 = new studentRegistry();
        fillReistry(s1);

//        student s = new student();
//        s.name = "Karan";
//        s.age = 30;

        student bqtchACopy1 = s1.get("batch_A_Student");
        student bqtchCopy2 = s1.get("Intelligent");

        System.out.println("debug");
    }
}
