package egzamin;

import java.util.ArrayList;
import java.util.List;

public class Egzamin {
    List<Student> studeci = new ArrayList<>();
    List<Zadanie> zadania = new ArrayList<>();


    void dodajStudenta(Student student) {
        studeci.add(student);
    }

    void dodajZadanie(Zadanie zadanie) {
        zadania.add(zadanie);
    }

    void przeprowadz() {
        for (Zadanie zadanie : zadania) {
            for (Student student : studeci) {
                int punkty = student.zrobZadanie(zadanie);
                student.punkty += punkty;
            }
        }
    }
}
