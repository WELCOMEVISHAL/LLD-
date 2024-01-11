package Introduction_Opps;

public class Students {
    String name;
    int phoneNumber;
    int age;
    double psp;
    String batchName;
    void changeBatch(String newBatchName){
        batchName = newBatchName;
    }

    void giveMockInterview(){
        System.out.println(name+" Giving Mock Interview");
    }
}
