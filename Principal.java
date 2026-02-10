import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        metodos m= new metodos();
        int n = 0;
        System.out.println("Ingrese la dimension del patio");
        n= sc.nextInt();
        ObjVehiculo[] r = new ObjVehiculo[n];
        r = m.llenarRegistros(r);
        r = m.CaclularNuevoPago(r);
        m.Mostrarregistros(r);
    }
}
