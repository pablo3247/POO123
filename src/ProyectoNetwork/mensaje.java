package ProyectoNetwork;

import java.util.ArrayList;
import java.util.HashMap;

public class mensaje  {

    private int ID=0;

    private String mensajito;

    private String autor;

    public mensaje(int ID,String autor,String mensajito) {
        this.ID = ID;
        this.autor=autor;
        this.mensajito = mensajito;


    }

    public String getAutor() {
        return autor;
    }

    public String getName(){
        return mensajito;
    }

    public int getID(){
        return this.ID;
    }





}
