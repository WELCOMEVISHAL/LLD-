package Introduction_Opps;

public class Instructor {
    int id;
    Instructor(int id){
        this.id = id;
    }

    Instructor(Instructor oldInstructor){
        this.id = oldInstructor.id;
    }
}
