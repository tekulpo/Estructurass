import java.util.Scanner;

public class nacholee {
    public static void main(String[] args) {
        System.out.println("vamos a sumar dos numeros");
        int n1=0, n2=0,suma=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero");
        n1=sc.nextInt();
        System.out.println("ingrese el numero 2");
        n2= sc.nextInt();
        System.out.println("la suma de los numeros es: "+(n1+n2));
    }
}
