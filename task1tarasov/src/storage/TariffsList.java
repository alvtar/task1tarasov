package storage;

import java.util.List;

import domain.*;

import java.util.ArrayList;

public class TariffsList {
    private List<Tariff> tariffs;
    
    public List<Tariff> getTariffs() {
        return tariffs;
    } 
    
    public TariffsList() {             
        tariffs = new ArrayList<>(); 
        Tariff tariff;// = null;
        tariff = new IndividualTariff();
        tariff.setTitle("Рациональный");
        tariff.setFee(1000);
        tariff.setClientsNumber(5000);
        tariffs.add(tariff);

        tariff = new IndividualTariff();
        tariff.setTitle("Оптима");
        tariff.setFee(500);
        tariff.setClientsNumber(7500);
        tariffs.add(tariff);

        tariff = new IndividualTariff();
        tariff.setTitle("Базовый");
        tariff.setFee(400);
        tariff.setClientsNumber(12000);
        tariffs.add(tariff);
        
        tariff = new CorporateTariff();
        tariff.setTitle("Бизнес-100");
        tariff.setFee(3000);
        ((CorporateTariff) tariff).setDiscountPercent(10);
        tariff.setClientsNumber(2000);
        tariffs.add(tariff);
        
        tariff = new CorporateTariff();
        tariff.setTitle("Бизнес-200");
        tariff.setFee(2200);
        ((CorporateTariff) tariff).setDiscountPercent(15);
        tariff.setClientsNumber(1400);
        tariffs.add(tariff);
        
        tariff = new CorporateTariff();
        tariff.setTitle("Корпоративный");
        tariff.setFee(1100);
        ((CorporateTariff) tariff).setDiscountPercent(20);
        tariff.setClientsNumber(3700);
        tariffs.add(tariff);

    }
}
