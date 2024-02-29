package AdpterPattren;

public class phonepay {
    bank b;
    public phonepay(){
        b = new YesBankAdapter();
    }

    int seeBalance(){
        return b.getBalance();
    }
}
