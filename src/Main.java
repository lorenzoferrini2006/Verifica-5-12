import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

        int x;
        int y;
        int raggio;

        Circle[] cerchi = new Circle[4];
        for (int i = 0; i < 4; i++) {
            cerchi[i] = new Circle();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("X cerchio" + (i + 1) + ": ");
            try{
                x = Integer.parseInt(keyboard.readLine());
            } catch(Exception e) {
                e.printStackTrace();
            }
            System.out.println("Y cerchio" + (i + 1) + ": ");
            try{
                y = Integer.parseInt(keyboard.readLine());
            } catch(Exception e) {
                e.printStackTrace();
            }
            System.out.println("Raggio cerchio" + (i + 1) + ": ");
            try{
                raggio = Integer.parseInt(keyboard.readLine());
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < 4; i++) {
            String statoCerchio;
            statoCerchio = cerchi[i].toString();
            cerchi[i].moveHor(32);
            cerchi[i].moveVer(16);
            System.out.println(statoCerchio);
        }
    }
}