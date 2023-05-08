package com.cambridge;

import org.junit.jupiter.api.Test;
import com.cambridge.deneme1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Ffindingunique extends deneme1 {
    //This class is created to avoid searching same words
    public static ArrayList<String> word100=new ArrayList<>();
    //u1 successfully
    @Test
    public void u1()  {
        deneme1 deneme1=new deneme1();
        CopyOnWriteArrayList<String> words2=new CopyOnWriteArrayList<String>();
words2.addAll(Arrays.asList("trickling" ,
        "solely" ,
        "coffers",
        "car",
        "flash"));

        CopyOnWriteArrayList<String> words3= findingDups(words2);

        System.out.println(words3);




    }

}
