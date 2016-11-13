package logic;


import java.util.List;

import domain.*;

public class CountSumClients {
    
    public int countSum(List<Tariff> listIn) {
        
        int sum=0;
        
        for (Tariff tar:listIn) {
            
            sum=sum+tar.getClientsNumber();
        }
        
        return sum;
    }
    
 
    
    
}
