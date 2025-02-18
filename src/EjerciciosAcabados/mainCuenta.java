package EjerciciosAcabados;

public class mainCuenta {
    public static void main(String[] args) {

        Cuenta cuenta1 = new Cuenta("Pepe");

        Cuenta cuenta2 = new Cuenta("Manolo",453);



        cuenta1.ingresar(100);
        System.out.println(cuenta1);


        cuenta2.retirar(100);

        System.out.println(cuenta2);
    }
}
