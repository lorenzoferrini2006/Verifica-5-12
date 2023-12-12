/*Obiettivo: Sviluppare due classi, Point e Circle, per rappresentare rispettivamente un punto e un cerchio nel piano cartesiano.
        Classe Point
        Descrizione: Rappresenta un punto nel piano cartesiano con coordinate (x, y).
        Requisiti:
        ●	Costruttori:
        ○	Un costruttore che accetta due coordinate (x, y). Il punto deve esistere in un piano cartesiano limitato tra 0 e 1000 per entrambe le coordinate.
        ○	Un costruttore senza parametri che inizializza il punto all'origine (0, 0).
        ●	Metodi:
        ○	Due metodi per spostare il punto orizzontalmente e verticalmente di una distanza specificata.
*/

public class Point {
     private int x;
     private int y;

     // costruttore
     public Point(){
         x = 0;
         y = 0;
     }

     public Point(int x, int y){
         this.x = x;
         this.y = y;
     }

    // metodi acccessori
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    // metodi implementativi
    // sposta orizzontalmente
    public void moveHor(int dx){
        x += dx;
    }

    // sposta verticalmente
    public void moveVer(int dx) {
        y += dx;
    }
}