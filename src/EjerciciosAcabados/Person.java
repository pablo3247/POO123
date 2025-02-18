package EjerciciosAcabados;

public class Person {

    private String name;
    private String address;


    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void setAddress(String addres){
        this.address = addres;
    }

    public String getName(){
        return name;
    }

    public String getAddress() {
        return address;
    }



   @Override
   public String toString(){
        return this.name + "\n\t" + this.address;
   }

}


