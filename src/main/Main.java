package main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        CSVTabellieren csvTabellieren = new CSVTabellieren();
        ArrayList<String> zeilen = new ArrayList<>();
        zeilen.add("Name;Strasse;Ort;Alter");
        zeilen.add("Peter Pan;Am Hang 5;12345 Einsam;42");
        zeilen.add("Maria Schmitz;Kölner Straße 45;50123 Köln;43");
        zeilen.add("Paul Meier;Münchener Weg 1;87654 München;65");

        csvTabellieren.tabelliereCSV(zeilen);

    }
}
