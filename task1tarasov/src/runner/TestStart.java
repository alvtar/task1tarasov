package runner;


import storage.*;
import controller.*;
import logic.*;
import view.*;

public class TestStart {

    public static void main(String[] args) {
        
        TariffsList tarList=new TariffsList();
        MenuGenerator menu =new MainMenu();  
        Outputter output=new OutputterImpl(); 
 
        while (true) {

            switch (menu.getAnswer()) {
            case 1: {
                System.out.println("Clients="+ new CountSumClients().countSum(tarList.getTariffs()));
                break;
            }
            case 2: {
                output.showList(new SortByFee().getSorted(tarList.getTariffs()));
                break;
            }
            case 3: {
                output.showList((new SelectTariff().getSelected(tarList.getTariffs(), 
                        new SubMenu1().getAnswer(),new SubMenu2().getAnswer())));
                break;
            }
            case 4: return;
            }
       
        }

    }
    
}