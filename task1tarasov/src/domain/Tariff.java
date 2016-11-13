package domain;

public abstract class Tariff {
    protected String title;
    protected int fee;
    protected int clientsNumber=0;
  
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    public void setFee(int fee) {
        this.fee = fee;
    }

    public abstract Integer getFee();
    
    
    public int getClientsNumber(){
        return clientsNumber;
    }

    public void setClientsNumber(int clients){
        clientsNumber=clientsNumber+clients;
    }

}
