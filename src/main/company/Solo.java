package main.company;

import java.time.LocalDate;

public class Solo extends Artist{
    public Solo(String name) {
        super(name);
    }

    public Solo(String name, LocalDate debutDt, String type) {
        super(name, debutDt, type);
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }
}
