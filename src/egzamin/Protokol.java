package egzamin;

public class Protokol {
    Egzamin egzamin;

    Protokol(Egzamin egzamin) {
        this.egzamin = egzamin;
    }

    void wyswietlProtokolZEgzaminu() {
        int punktyNaZaliczenie = egzamin.zadania.size() * 50;
        for (Student student: egzamin.studeci) {
            System.out.print("Student: " + student.imie + " punkty: " + student.punkty + " wynik: ");
            if (student.punkty > punktyNaZaliczenie) {
                System.out.println("ZALICZONY");
            } else {
                System.out.println("NIEZALICZONY");
            }
        }
    }
}
