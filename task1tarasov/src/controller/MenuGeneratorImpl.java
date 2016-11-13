package controller;


import java.util.ArrayList;
import java.util.Scanner;



public class MenuGeneratorImpl implements MenuGenerator {

    @Override
    public int getAnswer(ArrayList<String> choice) {
        
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


}
