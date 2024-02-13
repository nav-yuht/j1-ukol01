package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();

        // slunicko
//        nakresliKolecko(50, 24);
        // posun nahoru doprava na střed Slunce
      /*  zofka.penUp();
        zofka.move(400);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();*/

        //  vesnice
        for (int i = 0; i <5 ; i++) {
            this.nakresliDomecek();
            zofka.penUp();
            zofka.turnLeft(90);
            zofka.move(100);
            zofka.turnRight(90);
            zofka.penDown();
        }

        //posun doleva na domocek vpravo
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(500);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(180);
        zofka.penDown();
        nakresliDomecek();

        // posun doleva na začátek prasátka
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliPrasatko();

        // posun doleva na druhy domecek vlevo
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(220);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliDomecek();

        //moje jmeno V
        zofka.penUp();
        zofka.turnRight(150);
        zofka.move(100);
        zofka.penDown();
        zofka.move(75);
        zofka.turnLeft(120);
        zofka.move(75);


        //      A
        zofka.penUp();
        zofka.turnRight(120);
        zofka.move(75);
        zofka.turnLeft(125);
        zofka.penDown();
        zofka.move(75);
        zofka.turnRight(125);
        zofka.move(75);

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(25);
        zofka.penDown();
        zofka.turnLeft(60);
        zofka.move(40);

        //       N
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(100);
        zofka.turnRight(90);

        zofka.penDown();
        zofka.move(25);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(25);
        zofka.penDown();
        zofka.move(50);

        zofka.turnRight(140);
        zofka.move(95);
        zofka.turnLeft(140);
        zofka.move(75);

        zofka.penUp();
        zofka.move(600);
        zofka.penDown();
        nakresliKolecko(30, 12);

        for (int i = 0; i <6 ; i++) {
            nakresliPaprsek();
            zofka.penUp();
            nakresliKolecko(5, 2);
            zofka.penDown();

        }

        /*zofka.move(100);
        zofka.penDown();
        zofka.move(100);
        zofka.turnLeft(135);
        zofka.move(100);*/


//       puvodni hvezdicka

        /*zofka.penUp();
        zofka.turnRight(180);
        zofka.move(600);
        zofka.turnRight(180);
        zofka.penDown();*/



    }


    public void nakresliPrasatko() {
        zofka.turnLeft(90);
        this.nakresliDomecek();
        this.nakresliNozky();
        zofka.move(75);
        this.nakresliNozky();
        zofka.turnRight(90);
    }

    public void nakresliNozky() {
        zofka.turnLeft(45);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(30);
        zofka.turnRight(180);
        zofka.move(30);
        zofka.turnLeft(45);
    }


    public void nakresliDomecek() {
        for (int i = 0; i < 4; i++) {
            zofka.move(75);
            zofka.turnRight(90);
        }

        zofka.penUp();
        zofka.move(75);
        zofka.penDown();

        zofka.turnRight(30);
        zofka.move(75);
        zofka.turnRight(120);
        zofka.move(75);

        zofka.turnRight(30);
        zofka.penUp();
        zofka.move(75);
        zofka.turnRight(90);
        zofka.move(75);
        zofka.turnRight(90);
        zofka.penDown();
    }
    public void nakresliPaprsek() {

        zofka.move(25);
        zofka.penUp();
        zofka.turnRight(180);



//            zofka.move(40);
//            zofka.turnRight(180);
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
        this.nakresliKolecko(50, 24);
        for (int i = 0; i < 8; i++) {
            nakresliPaprsek();
            zofka.turnRight(45);
        }
    }




}
