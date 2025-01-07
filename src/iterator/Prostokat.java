package iterator;

public class Prostokat extends Figura {

    double bokA;
    double bokB;

    Prostokat(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    @Override
    void scale(double m) {
        this.bokA *= m;
        this.bokB *= m;
    }

    @Override
    double pole() {
        return bokA * bokB;
    }

    @Override
    double obwod() {
        return (2 * bokA) + (2 * bokB);
    }

    @Override
    double rwpis() {
        if(bokA != bokB) {
            return -1;
        } else {
            return bokA * 0.5;
        }
    }

    @Override
    double ropis() {
        return 0.5 * Math.sqrt((bokA * bokA) + (bokB * bokB));
    }
}
