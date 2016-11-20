package controller;

import java.util.ArrayList;

public class MainMenu extends MenuGeneratorImpl{
    
    public int getAnswer() {
        ArrayList<String> lst=new ArrayList<>();
        
        lst.add("");
        lst.add("MAIN MENU");
        lst.add("Make your choice:");
        lst.add("1 - Show the total number of clients;");
        lst.add("2 - Sort tariffs by fee;");
        lst.add("3 - Select tariffs;");
        lst.add("4 - Exit.");
        lst.add("----- ?: ");
        
        return generate(lst);
    }
 
}
