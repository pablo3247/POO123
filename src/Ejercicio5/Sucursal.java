package Ejercicio5;

public class Sucursal {

    private String n_suc;

    private Banc banc;


    public Sucursal(String n_suc, Banc banc){

        this.n_suc = n_suc;
        this.banc = banc;
    }
    @Override
    public String toString(){
        return this.n_suc+ this.banc;
    }


}
