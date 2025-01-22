public class mainOrdenadores {
    public static void main(String[] args) {

        Ordenadores pc1 = new Ordenadores("X71",765.99,"Ryzen5","16GB","Rtx 3050","Gaming");
        System.out.println(pc1);
        System.out.println("---");
        System.out.println(pc1.getSpecs());


        //Otro pc
        System.out.println("____________________________");
        Ordenadores pc2 = new Ordenadores("XBU92",500.2,"Ryzen3","16GB","Integrada","Ofimatica");
        System.out.println(pc2);
        System.out.println("---");
        System.out.println(pc2.getSpecs());

        //Cambio de precio!
        System.out.println("________CAMBIO DE PRECIO______");
        pc2.setPrecio(450.9);
        System.out.println(pc2);

    }
}
