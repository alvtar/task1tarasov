package view;

import java.util.List;

import domain.Tariff;

public interface Outputter {
    public void showList(List<Tariff> listIn);
}
