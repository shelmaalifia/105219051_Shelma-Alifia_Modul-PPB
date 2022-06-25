package com.example.modul2;

import java.util.ArrayList;
import java.util.List;

public class KatalogFotoUtil {
    private static int[] ridArray = {
            R.drawable.kucing1,
            R.drawable.kucing2,
            R.drawable.kucing3,
            R.drawable.kucing4

    };

    private static String[] filenameArray = {
            "Kucing 1",
            "Kucing 2",
            "Kucing 3",
            "Kucing 4"
    };

    private static List<KatalogFoto> katalogFotoList;

    public static void init(){
        katalogFotoList = new ArrayList<>();
        int nArray = ridArray.length;
        for(int i=0; i<nArray; i++){
            katalogFotoList.add(new KatalogFoto(ridArray[i], filenameArray[i]));
        }
    }

    public static List<KatalogFoto> getKatalogFotoList(){

        return katalogFotoList;
    }

    public static KatalogFoto getKatalogFotoAt(int i){

        return katalogFotoList.get(i);
    }
}
