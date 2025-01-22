import java.util.Scanner;

import static java.sql.Types.NULL;

public class mainAire {
    public static void main(String[] args) {

        Aire maquina1 = new Aire("maquina1");

        System.out.println(maquina1);

        System.out.println("___________________________");
        System.out.println("INGRESA: \n +(subir), \n -(bajar),\n 0(para salir)");

        char control =' ';

        Scanner sc = new Scanner(System.in);

        while(control != '0'){

           if(sc.nextLine().length()>0){
               control = sc.nextLine().charAt(0);
//               if(sc.nextLine().charAt(0)!= '+'|sc.nextLine().charAt(0)!= '-'| sc.nextLine().charAt(0)!= '0' ){
//                   System.out.println("Ingresa un valor valido!");
//                   control = sc.nextLine().charAt(0);
//               }
           }else {
               System.out.println("INGRESA UN VALOR VALIDO!");
            }


            if(control == '+'){
                maquina1.subirTemp();
            } else if (control == '-') {
                maquina1.bajarTemp();
            }
            System.out.println(maquina1);
        }

    }
}
