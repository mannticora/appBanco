import java.util.Scanner;

public class appBancaria {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double saldoActualizado = 1599.99;


        int opcionMenu;
        do {
            System.out.println("** Escriba el número de la opción deseada **\n" +
                    "1 - Consultar Saldo\n2 - Retirar\n3 - Depositar\n9 - Salir");
            opcionMenu = teclado.nextInt();

            switch (opcionMenu){
                case 1:

                    System.out.println("El saldo actualizado es de:\n$" + saldoActualizado);
                    break;

                case 2:

                    System.out.println("¿Cuándo desea retirar?");
                    double retiro = teclado.nextDouble();

                    if (retiro <= saldoActualizado){
                        saldoActualizado -= retiro;
                        System.out.println("Se retiró $" + retiro + ", su saldo es de:\n$" + saldoActualizado);
                    } else if (retiro > saldoActualizado) {
                        System.out.println("No tiene suficiente saldo.");
                    }
                    break;

                case 3:

                    System.out.println("¿Cuánto es la cantidad que va a depositar?");
                    double deposita = teclado.nextDouble();

                    saldoActualizado += deposita;
                    System.out.println("Su saldo actual es de:\n$" + saldoActualizado + " ¡Gracias!");
                    break;

                case 9:
                    System.out.println("¡Gracias, vuelva pronto!");
                    break;
            }
        } while (opcionMenu != 9);
        }
    }