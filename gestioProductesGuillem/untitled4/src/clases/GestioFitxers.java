//autor Guillem Ardanuy Martinez

package clases;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestioFitxers {
    public static List<String> llegirFitxer(String ruta) throws IOException {  // llegim tot el fitxer , i retornem una llista amb totes les linees.
        try {
            List<String> llistaAtornar = Files.readAllLines(Paths.get(ruta));
            return llistaAtornar;
        }
        catch (Exception e){
            System.out.println("dins de catch "+e);
            return null;
        }
    }

    public static String llegimLinia(List<String> fitxerLlegit, int idLinia) throws  IOException{ // modo test si funciona aqueta estructura podre fer el que busco
        try{
            String liniaLlegida=fitxerLlegit.get(idLinia);
            return liniaLlegida;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public static ArrayList<String> llegimLiniaArrayList(List<String> fitxerLlegit, int idLinia) throws IOException{
        try{
            String liniaLlegida = fitxerLlegit.get(idLinia);
            ArrayList<String> llistaElementsLinia = new ArrayList<String>(Arrays.asList(liniaLlegida.split(";")));
            return llistaElementsLinia;
        }
        catch (Exception e){
            System.out.println("error --> " + e);
            return null;
        }
    }

}




