package com.cambridge;

import org.junit.jupiter.api.Test;
import com.cambridge.deneme1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Ffindingunique extends deneme1 {
    Scanner scanner = new Scanner(System.in);
    //This class is created to avoid searching same words
    public static ArrayList<String> word100 = new ArrayList<>();

    //u1 successfully
    @Test
    public void u1() {
        deneme1 deneme1 = new deneme1();
        CopyOnWriteArrayList<String> words2 = new CopyOnWriteArrayList<String>();
        words2.addAll(Arrays.asList("trickling",
                "solely",
                "coffers",
                "car",
                "flash",
                "Software testing app"));

        CopyOnWriteArrayList<String> words3 = findingDups(words2);

        System.out.println(words3);

        /*for (String each : words3) {
            if (each.contains(" ")) {
                System.out.println(each + " has space inside it do you want to remove it?");
                String choise = scanner.toString();
                if (choise.equalsIgnoreCase("Yes")){

                }

            }
        }

         */
        for (int o = 0; o <1 ; o++) {


        for (int i = 0; i < words3.size(); i++) {
            if (words3.get(i).contains(" ")) {
                System.out.println(words3.get(i) + " has space in it\nDo you want to remove it?Yes or No");
                String choise = scanner.nextLine();
                if (choise.equalsIgnoreCase("yes")) {
                    words3.remove(i);
                }else{

                }
            }
        }
            System.out.println(words3);
        }



    }

}
