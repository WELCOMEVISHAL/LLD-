package Introduction_Opps;

public class Students {
    public String name;
    int phoneNumber;
    private int age;
    protected double psp;
    String batchName;
    Instructor i;
    Students(String name,int age,double psp){
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.i = new Instructor(1);
    }

    Students(Students oldStudents){
        this.name = new String(oldStudents.name);
        this.psp = oldStudents.psp;
        this.age = oldStudents.age;
        this.i = new Instructor(oldStudents.i);
        this.batchName = oldStudents.batchName;
        this.phoneNumber = oldStudents.phoneNumber;
    }
    void changeBatch(String newBatchName){
        batchName = newBatchName;
    }

    void giveMockInterview(){
        System.out.println(name+" Giving Mock Interview");
    }

    public int getAge(){
        return age;
    }

    void setAge(int new_age){
        age = new_age;
    }
}
