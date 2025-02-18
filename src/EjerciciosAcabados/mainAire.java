package EjerciciosAcabados;

import java.util.Scanner;

public class mainAire {
    public static void main(String[] args) {

        Aire maquina1 = new Aire("maquina1",5,1,10);

        System.out.println(maquina1);


        System.out.println("___________________________");
        System.out.println("INGRESA: \n +(subir), \n -(bajar),\n 0(para salir)");

        String control =" ";

        char controlDefinitivo=' ';
        Scanner sc = new Scanner(System.in);

        while(controlDefinitivo != '0'){
            control = sc.nextLine();
           if(control.isEmpty() | (control.length() >1)) {
               System.out.println("INGRESA UN VALOR VALIDO!");
           }
           else {
               controlDefinitivo=control.charAt(0);
                switch (controlDefinitivo){
                    case '+':
                        maquina1.subirTemp();
                        System.out.println(maquina1);
                        break;

                    case '-':
                        maquina1.bajarTemp();
                        System.out.println(maquina1);
                        break;
                    case '0':
                        break;
                    default:
                        System.out.println("INGRESA UN VALOR VALIDO!");
                }
            }
        }
    }
}
