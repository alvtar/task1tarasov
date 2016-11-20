package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import domain.*;


public class SortByFee {
     
        public List<Tariff> getSorted(List<Tariff> listIn) {
           
            List<Tariff> listOut=new ArrayList<>();
            listOut.addAll(listIn);
            
            Collections.sort(listOut, new Comparator<Tariff>()  {
                public int compare(Tariff o1, Tariff o2) {
                    return o1.getFee().compareTo(o2.getFee());
                }
            });        
            return listOut;       
        }
        
}
