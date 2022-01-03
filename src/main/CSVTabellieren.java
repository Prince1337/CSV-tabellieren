package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVTabellieren {

  public void tabelliereCSV(List<String> csvZeilen){
    ArrayList<String> neueCSVZeilen = new ArrayList<>();
    final String leerzeichen = " ";
    final String trennzeichen = "|";
    final String trennzeichenUeberschrift = "-";

    for (String zeile: csvZeilen) {
      String[] zeileArray = zeile.split(";");
      zeileArray[0].length();

      neueCSVZeilen.add(zeileArray[0] + leerzeichen.repeat(17 - zeileArray[0].length()) + trennzeichen +
          zeileArray[1] +  leerzeichen.repeat(17 - zeileArray[1].length()) + trennzeichen +
          zeileArray[2] +  leerzeichen.repeat(17 - zeileArray[2].length()) + trennzeichen +
          zeileArray[3] + leerzeichen.repeat(17 - zeileArray[3].length()));

      if(csvZeilen.get(0).equals(zeile))
        neueCSVZeilen.add(trennzeichenUeberschrift.repeat(17) + "+" + trennzeichenUeberschrift.repeat(17) +
            "+" + trennzeichenUeberschrift.repeat(17) + "+" + trennzeichenUeberschrift.repeat(17));

    }


    for (String zeile: neueCSVZeilen) {
      System.out.println(zeile);
    }







  }
}
