package egzamin;

import java.util.Random;

public class Zadanie {
    int numer;

    Zadanie(int numer) {
        this.numer = numer;
    }

    public int ilePunktow() {
        return new Random().nextInt(101);
    }
}
