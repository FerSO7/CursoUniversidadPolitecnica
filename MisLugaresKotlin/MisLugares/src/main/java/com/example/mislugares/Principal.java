package com.example.mislugares;

class Principal {
    public static void main(String[] main) {

        GeoPunto geoPunto = new GeoPunto(-0.166093,38.995656);

        Lugar lugar = new Lugar("Escuela Politécnica Superior de Gandía",
                "C/ Paranimf, 1 46730 Gandia (SPAIN)",geoPunto,
                null,962849300,
                "http://www.epsg.upv.es",
                "Uno de los mejores lugares para formarse.", 22/12/2,3);
        System.out.println("Lugar " + lugar.toString());

    }
}

