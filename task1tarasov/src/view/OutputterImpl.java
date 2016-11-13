package view;

import java.util.List;

import domain.Tariff;


public class OutputterImpl implements Outputter {
    
    public void showList(List<Tariff> listIn) {
 
        for (Tariff tar:listIn) {
             
            System.out.println("Tariff Name: "+tar.getTitle()+";   Fee: "+ 
                    tar.getFee()+";   Clients Number: "+tar.getClientsNumber()); 
        }
        System.out.println();
    }
}