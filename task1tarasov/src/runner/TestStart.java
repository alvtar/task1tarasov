package runner;


import storage.*;
import controller.*;
import logic.*;
import view.*;

public class TestStart {

    public static void main(String[] args) {
        
        TariffsList tarList=new TariffsList();
        MainMenu menu =new MainMenu();  
        Outputter output=new OutputterImpl(); 
 
        while (true) {

            switch (menu.generate()) {
            case 1: {
                System.out.println("Clients="+ new CountSumClients().countSum(tarList.getTariffs()));
                break;
            }
            case 2: {
                output.showList(new SortByFee().getSorted(tarList.getTariffs()));
                break;
            }
            case 3: {
                //Select
                output.showList((new SelectTariff().getSelected(tarList.getTariffs(),new SubMenu1().generate(),new SubMenu2().generate())));
                break;
            }
            case 4: return;
            }
       
        }

    }
    
}