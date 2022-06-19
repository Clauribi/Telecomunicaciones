package com.company;

public class Main {

    public static void main(String[] args) {

        ParteDeTrabajo parte1 = null;
        ParteDeIncidencia parte2 = null;
        ParteDeSolicitud parte3 = null;
        try {
            parte1 = new ParteDeTrabajo("instalación fibra",2, 8.50, 20220619);
            System.out.println(parte1);
            parte2 = new ParteDeIncidencia("reparación fibra", 2, 8.50, 19/06/2022, 20);
            System.out.println(parte2);
            System.out.println(parte2.calculaCosteTotal());
            parte3 = new ParteDeSolicitud("reparacion movil", 3, 10, 19/06/2022, 10);
            System.out.println(parte3);
            System.out.println(parte3.calculaCosteTotal());

        } catch (ExArgumentoIncorrecto e) {
        e.printStackTrace();
    }
    }
}
