package controller;

import java.util.ArrayList;

public class SubMenu2 {

    public int generate() {
        ArrayList<String> lst=new ArrayList<>();
        lst.add("");
        lst.add("Select Tariff by Fee MENU");
        lst.add("Enter MAX Fee");
        lst.add("----- ?: ");
        
        return new MenuGeneratorImpl().getAnswer(lst);
    }
 
    
}
