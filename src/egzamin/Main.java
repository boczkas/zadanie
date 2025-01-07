package egzamin;

public class Main {
    public static void main(String[] args) {
        Egzamin egzamin = new Egzamin();
        egzamin.dodajStudenta(new Student("Natalia"));
        egzamin.dodajStudenta(new Student("Karol"));
        egzamin.dodajStudenta(new Student("Grzesiek"));

        egzamin.dodajZadanie(new Zadanie(1));
        egzamin.dodajZadanie(new Zadanie(2));
        egzamin.dodajZadanie(new Zadanie(3));

        egzamin.przeprowadz();

        Protokol protokol = new Protokol(egzamin);
        protokol.wyswietlProtokolZEgzaminu();
    }
}
