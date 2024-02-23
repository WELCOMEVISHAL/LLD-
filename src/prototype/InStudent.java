package prototype;

public class InStudent extends student implements Prototype<student>{
    int psp;
    int rank;

    InStudent(){

    }
    InStudent(InStudent is){
        super(is);
        this.psp = is.psp;
        this.rank = is.rank;
    }
    public InStudent copy(){
        InStudent i1 = new InStudent(this);
        return i1;
//        student i1 = super.copy();
//        i1.name = this.name;
//        i1.psp = this.psp;
//        i1.rank = this.rank;
//        i1.age = 20;
//        i1.Batch = this.Batch;
//        return i1;
    }
}
