public class Circle {
    private Point center;
    private int ray;

    // costruttore
    public Circle(){
        Point point = new Point();
        ray = 0;
    }

    public Circle(int x, int y, int ray){
        x = center.getX();
        y = center.getY();
        this.ray = ray;
    }

    // metodi acccessori
    public Point getCenter() {
        return center;
    }
    public int getRay() {
        return ray;
    }
    public void setCenter(Point point) {
        this.center = point;
    }
    public void setRay(int ray) {
        this.ray = ray;
    }

    // metodi implementativi
    // sposta orizzontalmente
    public void moveHor(int dx){
        center.moveHor(dx);
    }

    // sposta verticalmente
    public void moveVer(int dx) {
        center.moveVer(dx);
    }

    // verifica di appartenenza di un punto a un cerchio
    // se distanza punto-cerchio = raggio => true
    public boolean belongToCircle(Point point) {
        double distance = Math.sqrt(Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2));
        if(distance == ray){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        String circleStatus = "X: " + center.getX() + ", Y: " + center.getY() + ", Raggio: " + getRay();
        return circleStatus;
    }
}
