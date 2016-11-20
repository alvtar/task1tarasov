package controller;

import java.util.ArrayList;


public class SubMenu2 extends MenuGeneratorImpl {

    public int getAnswer() {
        ArrayList<String> lst=new ArrayList<>();
        
        lst.add("");
        lst.add("Select Tariff by Fee MENU");
        lst.add("Enter MAX Fee");
        lst.add("----- ?: ");
        
        return generate(lst);
    }
   
}
