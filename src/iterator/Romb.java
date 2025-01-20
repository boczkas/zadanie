package iterator;

public class Romb extends Figura {

    double a;
    double h;

    public Romb(double a, double h) {
        this.a = a;
        this.h = h;
        nazwa = "Romb";
    }

    @Override
    void scale(double m) {
        this.a = this.a * m;
    }

    @Override
    double pole() {
        return a * h;
    }

    @Override
    double obwod() {
        return 4 * a;
    }

    @Override
    double rwpis() {
        return 0.5 * h;
    }

    @Override
    double ropis() {
        // na dowolnym rombie nie można opisać okręgu
        return -1;
    }
}
