package main.company;

import java.time.LocalDate;

public class Solo extends Artist{
    public Solo(String name) {
        this(name, LocalDate.now());
    }

    public Solo(String name, LocalDate debutDt) {
        super(name, debutDt, ArtistType.SOLO);
    }
}
