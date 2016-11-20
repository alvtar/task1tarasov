package logic;

import java.util.ArrayList;
import java.util.List;
import domain.Tariff;


public class SelectTariff {
    
    public List<Tariff> getSelected(List<Tariff> listIn, int minFee, int maxFee){
        
        List<Tariff> listOut=new ArrayList<>();
        
        for (Tariff tar:listIn) {
            int fee=tar.getFee();
            
            if (fee>=minFee & fee<=maxFee) {
                listOut.add(tar);
            }
        }   
        return listOut;
    }

}
