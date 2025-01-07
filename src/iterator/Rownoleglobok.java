package iterator;

public class Rownoleglobok extends Figura {

    double a;
    double h;

    Rownoleglobok(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    void scale(double m) {
        this.a = this.a * m;
        this.h = this.h * m;
    }

    @Override
    double pole() {
        return a * h;
    }

    @Override
    double obwod() {
        return (2 * a) + (2 * h);
    }

    @Override
    double rwpis() {
        return 0;
    }

    @Override
    double ropis() {
        return 0;
    }
}
