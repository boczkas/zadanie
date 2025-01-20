package iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> figury = new ArrayList<>();
        figury.add(new Okrag(5));
        figury.add(new Kwadrat(10));
        figury.add(new Prostokat(5, 10));
        figury.add(new Trapez(1,2,3,4,5));
        figury.add(new Romb(10, 5));
        figury.add(new Rownoleglobok(10, 20, 15));
        figury.add(new Trojkat(1, 2, 3, 4));

        for (Figura figura: figury) {
            System.out.println("======================");
            System.out.println(figura.nazwa + ":");
            System.out.println();
            System.out.println("Pole: " + figura.pole());
            System.out.println("Obwód: " + figura.obwod());
            System.out.println("Promień okręgu wpisanego: " + figura.rwpis());
            System.out.println("Promień okręgu opisanego: " + figura.ropis());

            System.out.println();
            System.out.println("Po skalowaniu:");
            figura.scale(2);
            System.out.println("Pole: " + figura.pole());
            System.out.println("Obwód: " + figura.obwod());
            System.out.println("Promień okręgu wpisanego: " + figura.rwpis());
            System.out.println("Promień okręgu opisanego: " + figura.ropis());
        }
    }
}
