package iterator;

public class Trojkat extends Figura {
    double a;
    double b;
    double c;
    double h;

    public Trojkat(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
        nazwa = "Trojkąt";
    }

    @Override
    void scale(double m) {
        this.a = this.a * m;
        this.b = this.b * m;
        this.c = this.c * m;
    }

    @Override
    double pole() {
        return a * h * 0.5;
    }

    @Override
    double obwod() {
        return a + b + c;
    }

    @Override
    double rwpis() {
        return 2 * pole() / (a + b + c);
    }

    @Override
    double ropis() {
        return a * b * c / (4 * pole());
    }
}
