package Introduction_Opps;
import Introduction_Opps.Students;

public class Main {
    public static void main(String[] args) {

        Students s1 = new Students("A",30,30.00);
        s1.name = "Sofia";
        int age = s1.getAge();
        s1.psp = 3.00;
        s1.setAge(-20);

        Students s2 = new Students(s1);

        System.out.println(s1.hashCode()+"-"+s2.hashCode());


        /*Students s1 = new Students();
        s1.name = "Sofia";
        s1.age = 30;
        s1.batchName = "abc";
        s1.psp = 30.00;
        s1.phoneNumber = 12345;

        Students  s2 = new Students();
        s2.name = "Asha";
        s2.age = 28;
        s2.batchName = "abed";
        s2.psp = 39.00;
        s2.phoneNumber = 123456;

        System.out.println(s1.name);
        System.out.println(s1);
        System.out.println(s2);

        Students s3 = s1;
        s1.name = "vishal";

        System.out.println(s3);
        System.out.println(s2.name);
        System.out.println(s1.name);

        s1.giveMockInterview();
        s2.giveMockInterview();
        */
    }
}