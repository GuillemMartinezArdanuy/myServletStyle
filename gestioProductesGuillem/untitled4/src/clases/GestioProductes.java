//autor Guillem Ardanuy Martinez


package clases;

import java.util.ArrayList;
import java.util.List;

public class GestioProductes {

    //private Producte producteCreat;
    private ArrayList<Producte> arrayListProductesCreats;

    public ArrayList<Producte> getArrayListProductesCreats() {
        return arrayListProductesCreats;
    }


    public ArrayList<Producte> setArrayListProductesCreats() throws Exception{ // llegim tot el fitxer de productes i creem els objectes en memoria
        System.out.println("dins de setArrayListProductesCreats");
        ArrayList arrayListProductesCreats = new ArrayList();

        ArrayList<Producte> arrayListProductesCreatsPRODUCTE = new ArrayList<Producte>();

        GestioFitxers fitxer=new GestioFitxers();

        //List<String> fitxerLlegit= fitxer.llegirFitxer("C:\\Users\\T0kT0k\\IdeaProjects\\untitled4\\src\\FitxersCss\\productes.txt"); // net i polit llegim fitxer i creem llista de linees :D
        List<String> fitxerLlegit= fitxer.llegirFitxer("C:\\Users\\T0kT0k\\IdeaProjects\\untitled4\\src\\FitxersCss\\productes.txt"); // net i polit llegim fitxer i creem llista de linees :D

        int numeroLinees = fitxerLlegit.size(); // contem kuantes lines hi han

        for (int i=0; i<numeroLinees;i++){
            ArrayList<String> fitxerLlegitArrayList= fitxer.llegimLiniaArrayList(fitxerLlegit,i); //llegim cada linea
            System.out.println("fitxerLLegitArraylist DINS DE CONTAR LINES FITXER i=  "+i+" fitxer es -->"+ fitxerLlegitArrayList);
            System.out.println("---------------");
            arrayListProductesCreats.add(fitxerLlegitArrayList); //afegim el array de la linia a productes creats
            System.out.println("arraylist productes creats ---> "+ arrayListProductesCreats);
            arrayListProductesCreatsPRODUCTE.add(new Producte(Integer.parseInt(fitxerLlegitArrayList.get(0)),fitxerLlegitArrayList.get(1),Double.parseDouble(fitxerLlegitArrayList.get(2)),fitxerLlegitArrayList.get(3),fitxerLlegitArrayList.get(4),fitxerLlegitArrayList.get(5)));
        }

        this.arrayListProductesCreats = arrayListProductesCreatsPRODUCTE;
        return arrayListProductesCreatsPRODUCTE;
    }

    @Override
    public String toString() {
        return "GestioProductes{" +
                "arrayListProductesCreats=" + arrayListProductesCreats +
                '}';
    }

}
