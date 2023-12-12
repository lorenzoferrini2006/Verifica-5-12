import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;
        int y = 0;
        int raggio;
        int distanza;
        final int dim = 4;
        final int max = 1000;
        final int min = 0;
        Point punto = new Point();

        Circle[] cerchi = new Circle[dim];
        for (int i = 0; i < dim; i++) {
            cerchi[i] = new Circle();
        }

        for (int i = 0; i < dim; i++) {
            try{
                do{
                    System.out.println("X cerchio" + (i + 1) + ": ");
                    x = Integer.parseInt(keyboard.readLine());
                }while(x < min || x > max);
                do{
                    System.out.println("Y cerchio" + (i + 1) + ": ");
                    y = Integer.parseInt(keyboard.readLine());
                }while(y < min || y > max);
                System.out.println("Raggio cerchio" + (i + 1) + ": ");
                raggio = Integer.parseInt(keyboard.readLine());
                cerchi[i] = new Circle(x, y, raggio);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < dim; i++) {
            try{
                do{
                    System.out.println("movimento orizzontale cerchio " + (i + 1) + ": ");
                    distanza = Integer.parseInt(keyboard.readLine());
                    cerchi[i].moveHor(distanza);
                }while(cerchi[i].getCenter().getX() < min || cerchi[i].getCenter().getX() > max);
                do{
                    System.out.println("movimento verticale cerchio " + (i + 1) + ": ");
                    distanza = Integer.parseInt(keyboard.readLine());
                    cerchi[i].moveVer(distanza);
                }while(cerchi[i].getCenter().getY() < min || cerchi[i].getCenter().getY() > max);
            } catch(Exception e) {
                e.printStackTrace();
            }
            String statoCerchio;
            statoCerchio = cerchi[i].toString();
            System.out.println(statoCerchio);

            try{
                do{
                    System.out.println("X punto" + (i + 1) + ": ");
                    x = Integer.parseInt(keyboard.readLine());
                }while(x < min || x > max);
                do{
                    System.out.println("Y punto" + (i + 1) + ": ");
                    y = Integer.parseInt(keyboard.readLine());
                }while(y < min || y > max);
            } catch(Exception e) {
                e.printStackTrace();
            }
            punto.setX(x);
            punto.setY(y);
            if(cerchi[i].belongToCircle(punto)){
                System.out.println("il punto appartiene al cerchio " + (i + 1));
            } else {
                System.out.println("il punto non appartiene al cerchio " + (i + 1));
            }
        }
    }
}