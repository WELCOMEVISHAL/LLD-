package AdpterPattren;

import AdpterPattren.thirdParty.icicibank;

public class IciciAdapter implements bank{
    icicibank i = new icicibank();
    public int getBalance(){
        return i.enquireBalance();
    }
}
