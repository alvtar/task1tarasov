package domain;

public class CorporateTariff extends Tariff {
    protected int discountPercent;

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }
 
    @Override
    public Integer getFee() {
        return fee*(100-discountPercent)/100;
    }
    
}
