package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();
        this.nakresliDomecek();

        // posun doleva na začátek prasátka
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.penDown();

        this.nakresliPrasatko();

        // posun nahoru doprava na střed Slunce
        zofka.penUp();
        zofka.move(400);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();

       nakresliHvezdicku();

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(600);
        zofka.turnRight(180);
        zofka.penDown();

        nakresliKolecko(200, 24);

    }

    public void nakresliPrasatko() {
        zofka.turnLeft(90);
        this.nakresliDomecek();
        this.nakresliNozky();
        zofka.move(150);
        this.nakresliNozky();
        zofka.turnRight(90);
    }

    public void nakresliNozky() {
        zofka.turnLeft(45);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnLeft(45);
    }


    public void nakresliDomecek() {
        for (int i = 0; i < 4; i++) {
            zofka.move(150);
            zofka.turnRight(90);
        }

        zofka.penUp();
        zofka.move(150);
        zofka.penDown();

        zofka.turnRight(30);
        zofka.move(150);
        zofka.turnRight(120);
        zofka.move(150);

        zofka.turnRight(30);
        zofka.penUp();
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.penDown();
    }

    public void nakresliKolecko(int polomer, int pocetStran) {
        zofka.penUp();
        zofka.move(polomer);
        zofka.penDown();
        int uhel = 360 / pocetStran;
       int delkaStrany = (int) (Math.sin(Math.PI * (double) uhel / 360d) * polomer * 2);
        zofka.turnRight(90);
        for (int i = 0; i < pocetStran; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(uhel);
        }
        zofka.turnLeft(90);

    }

    public void nakresliHvezdicku() {
        for (int i = 0; i < 8; i++) {
            nakresliPaprsek();
            zofka.turnRight(45);
        }
    }

    public void nakresliPaprsek() {
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnRight(180);
    }


}
