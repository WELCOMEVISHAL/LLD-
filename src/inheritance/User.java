package inheritance;

public class User {
    public int user_id;
    private String password;
    protected String email;
    int age;
    void setPassword(String Pass){
        this.password = Pass;
    }
}
