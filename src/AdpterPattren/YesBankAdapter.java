package AdpterPattren;

import AdpterPattren.thirdParty.yesbank;


public class YesBankAdapter implements bank{
    yesbank y = new yesbank();

    public int getBalance(){
        return y.checkBalance();
    }
}
