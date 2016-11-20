package domain;

public class CorporateTariff extends Tariff {
    protected int discountPercent;

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }
    
    // This method returns "real" Fee - % of Discount
    // (only for demonstrate Polymorphism)
    @Override
    public Integer getFee() {
        return fee*(100-discountPercent)/100;
    }
    
}
