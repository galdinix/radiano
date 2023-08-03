import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double graus;
        String resp = "y";

        while (resp.equals("y")) {
            do {
                System.out.println("Informe um valor entre 0 e 360:");
                graus = inp.nextInt();
            } while (graus < 0 || graus > 360);

            System.out.println(Math.toRadians(graus) / Math.PI + "PI");
            System.out.println("seno:" + Math.sin(graus));
            System.out.println("cos:" + Math.cos(graus));
            System.out.println("Deseja continuar? [y] or [n]:");
            resp = inp.next();
            resp = resp.toLowerCase();
        }
    }

}