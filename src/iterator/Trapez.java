package iterator;

public class Trapez extends Figura {

    double a;
    double b;
    double c;
    double d;
    double h;

    public Trapez(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
        nazwa = "Trapez";
    }

    @Override
    void scale(double m) {
        this.a = this.a * m;
        this.b = this.b * m;
        this.c = this.c * m;
        this.d = this.d * m;
    }

    @Override
    double pole() {
        return (a + b) * 0.5 * h;
    }

    @Override
    double obwod() {
        return a + b + c + d;
    }

    @Override
    double rwpis() {
        if ((a + b) == (c + d)) {
            return pole() / (a+b);
        } else {
            return -1;
        }
    }

    @Override
    double ropis() {
        // okrąg można opisać tylko na równoramiennym
        if (c == d) {
            double licznik1 = a * b + (Math.pow((a + b), 2) / 4);
            double licznik2 = Math.pow((a + b) * 0.5, 2);
            double mianownik = 4 * a * b;
            return Math.sqrt(licznik1 * licznik2) / mianownik;
        } else {
            return -1;
        }
    }
}
