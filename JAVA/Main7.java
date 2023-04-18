import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Cuenta c1[] = new Cuenta[10];
        for (int i = 0; i < c1.length; i++) {
            c1[i] = new Cuenta(i, 100);
        }
        System.out.println("ingrese su identificación: ");
        int x = src.nextInt();

        while (x <= 10 && x >= 0) {
            System.out.println("-----------------------Menú Principal--------------------------" + "\n" +
                    "1: consultar saldo" +
                    "\t" + "2: retirar" +
                    "\t" + "3: depositar" +
                    "\t" + "4: salir");
            int decision = src.nextInt();
            if (decision == 1) {
                System.out.println("su balance es: " + c1[x].getBalance());
            } else if (decision == 2) {
                System.out.print("coloque el monto a retirar: ");
                c1[x].Withraw(src.nextDouble());
            } else if (decision == 3) {
                System.out.print("coloque el monto a depositar: ");
                c1[x].Deposit(src.nextDouble());
            } else if (decision == 4) {
                break;
            } else {
                System.out.println("ingresa una opción valida");
            }

        }
        if (x > 10 || x < 0) {
            System.out.println("ingrese una identificacion valida");
        }
    }
}
