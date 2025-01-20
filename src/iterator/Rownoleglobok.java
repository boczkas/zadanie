package iterator;

public class Rownoleglobok extends Figura {

    double a;
    double b;
    double h;

    Rownoleglobok(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
        nazwa = "Rownoleglobok";
    }

    @Override
    void scale(double m) {
        this.a = this.a * m;
        this.b = this.b * m;
    }

    @Override
    double pole() {
        return a * h;
    }

    @Override
    double obwod() {
        return (2 * a) + (2 * b);
    }

    @Override
    double rwpis() {
        // nie można wpisać okręgu do dowolnego równoległoboku
        return -1;
    }

    @Override
    double ropis() {
        return -1;
    }
}
