import java.util.Scanner;

public class SommeDeuxNombres {

    public static void main(String[] args) {
        int nombre1,nombre2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le premier nombre : ");
        nombre1 = scanner.nextInt();

    
        System.out.print("Entrez le deuxième nombre : ");
        nombre2 = scanner.nextInt();

        int somme = addition(nombre1,nombre2);

        System.out.println("La somme de " + nombre1 + " et " + nombre2 + " est " + somme);

        scanner.close();
    }
    public static int addition(int a, int b){
        return a + b;
    }
}