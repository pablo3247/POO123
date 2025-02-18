package Student;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Person {

    private String name;
    private String address;
    private String DNI;
    int contador =0;


    public Person(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public void setDni(String DNI){
        this.DNI = DNI;
    }

    public boolean comprobarDNI(String DNI){

        if(DNI.length() == 9){

          ArrayList<String> nums =new ArrayList<>(Arrays.asList(DNI.split("")));

          String letra = nums.getLast();
          nums.removeLast();

         String nums1= nums.stream()
                  .reduce("",(previousSum, value) -> previousSum+value);


         int numLetra  = Integer.parseInt(nums1) % 23;

         char [] DNILetras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K'};

            System.out.println(letra);
            System.out.println(DNILetras[numLetra]);

        if(Objects.equals(letra, DNILetras[numLetra] + "")){

            return true;
        }
         else {
            throw new IllegalArgumentException("El DNI no es correcto ");        }


        }
        else {
            throw new IllegalArgumentException("El DNI no es correcto ");
        }

    }

    public void study(){

        contador++;
    }






    @Override
    public String toString(){
        return this.name + "\n\t" + this.address +  contador;
    }


}
