import java.util.Scanner;

public class metodos {
    Scanner sc = new Scanner(System.in);
    public ObjVehiculo[] llenarRegistros(ObjVehiculo [] r)
    {
    for (int i = 0; i < r.length; i++){
        ObjVehiculo o = new ObjVehiculo();
        System.out.println("ingrese la marca");
        o.setMarca(sc.next());
        System.out.println("ingrese tipo vehiculo");
        o.setTipo(sc.next());
        System.out.println("ingrese cilindraje");
        o.setCilindraje(sc.nextInt());
        if(o.getCilindraje() > 900 && o.getCilindraje() < 1700)
        {
            o.setPagoAnterio(150.000);
        }
        else if(o.getCilindraje()>=1700 && o.getCilindraje() < 2000)
        {
            o.setPagoAnterio(  200.000);
        } else{
            o.setPagoAnterio( 250.000);
        }
        o.setNumeroCelda(i +1);
        r[i]=o;
    }
        return r;
    }
    public ObjVehiculo[] CaclularNuevoPago(ObjVehiculo[] r)
    {
        for (int i = 0; i > r.length; i++){
            r[i].setPagoActual(r[i].getPagoAnterio() * 1.23);
        }
        return r;
    }
    public void Mostrarregistros(ObjVehiculo[] r)
    {
        for(int i = 0; i < r.length; i++){

            System.out.println("marca:" + r[i].getMarca());
            System.out.println("tipovehiculo : " + r[i].getTipo());
            System.out.println("Cilindraje: " + r[i].getCilindraje());
            System.out.println("pagoAnterior: " + r[i].getPagoAnterio());
            System.out.println("pago Actual:" + r[i].getPagoActual());
            System.out.println("Numero de celda:" + r[i].getNumeroCelda());
            System.out.println(".............................");
        }
    }
}
