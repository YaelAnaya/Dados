package yael.dados.uabc.mx;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String option;
       do{
            System.out.println("Ingrese cantidad de lados del dado(6 - 12):");
            int lados = scanner.nextInt();

            Dado dado = new Dado(lados);
            System.out.println("Lado: " + dado.tirarDado());

            System.out.println("¿Quiere lanzar otro dado?");
            option = scanner.next();

        }while(option.equals("Si"));
    }
}
