package egzamin;

import java.util.Random;

public class Student {
    String imie;
    int punkty;

    Student(String imie) {
        this.imie = imie;
    }

    public int zrobZadanie(Zadanie zadanie) {
        int punkty = zadanie.ilePunktow();
        System.out.println("Studencie " + imie + " za zadanie " + zadanie.numer + " otrzymujesz " + punkty + " pkt.");
        return punkty;
    }
}
