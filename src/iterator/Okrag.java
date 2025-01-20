package iterator;

public class Okrag extends Figura {

    private double promien;

    Okrag(double promien) {
        this.promien = promien;
        nazwa = "Okrąg";
    }

    @Override
    void scale(double m) {
        this.promien = this.promien * m;
    }

    @Override
    double pole() {
        return 3.1415 * promien * promien;
    }

    @Override
    double obwod() {
        return 2 * 3.1415 * promien;
    }

    @Override
    double rwpis() {
        return promien;
    }

    @Override
    double ropis() {
        return promien;
    }
}
