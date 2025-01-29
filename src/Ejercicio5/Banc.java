package Ejercicio5;

import java.util.HashSet;
import java.util.Set;

public class Banc {

    private String n_ent;

    private Set<Sucursal> sucursales;

    public Banc(String n_ent){
        this.n_ent = n_ent;
        this.sucursales = new HashSet<>();
    }

    public String getN_ent() {
        return n_ent;
    }

    public void setN_ent(String n_ent) {
        this.n_ent = n_ent;
    }

//Añadir sucursales
    public void addSucursal(Sucursal a){
        this.sucursales.add(a);
    }


@Override
public String toString(){
        return this.n_ent + this.sucursal;
}


}
