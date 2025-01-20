package egzamin;

public class Protokol {
    Egzamin egzamin;

    Protokol(Egzamin egzamin) {
        this.egzamin = egzamin;
    }

    void wyswietlProtokolZEgzaminu() {
        int maxPunktow = egzamin.zadania.size() * 100;
        int punktyNaZaliczenie = maxPunktow / 2;
        for (Student student: egzamin.studeci) {
            System.out.print("Student: " + student.imie + " punkty: " + student.punkty + "/" + maxPunktow + " wynik: ");
            if (student.punkty > punktyNaZaliczenie) {
                System.out.println("ZALICZONY");
            } else {
                System.out.println("NIEZALICZONY");
            }
        }
    }
}
