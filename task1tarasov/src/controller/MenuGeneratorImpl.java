package controller;


import java.util.ArrayList;
import java.util.Scanner;


public abstract class MenuGeneratorImpl implements MenuGenerator {

    @Override
    public int generate(ArrayList<String> choice) {
        
        for (String ch : choice) {
            System.out.println(ch);
        }

        @SuppressWarnings("resource")
        Scanner in=new Scanner(System.in);
        if (in.hasNextInt()) { 
                return in.nextInt();
        }
        return 0;
    }
    @Override
    public abstract int getAnswer(); 
    
}
