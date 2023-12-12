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