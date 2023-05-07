package com.cambridge;

import com.cambridge.utilies.Driver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.lang.reflect.Array;
import java.util.*;

public class deneme1 {
    @Test
    public void first() throws InterruptedException {

        ArrayList<String> words=new ArrayList<>();
       // words.addAll(Arrays.asList("trickling","solely","coffers","merely","software testing craft"));
        words.addAll(Arrays.asList("levied",
                "trickling" ,
                "solely" ,
                "coffers" ,
                "allotted" ,
                "merely" ,
                "attorney",
                "fallacy" ,
                "thoroughly","feasible" ,
                "trivial","İllustrating" ,
                "Comprehensive" ,
                "retained" ,
                "fallible" ,
                "inconsistent" ,
                "propagate" ,
                "precise" ,
                "amplified" ,
                "magnified" ,
                "elusive" ,
                "commission " ,
                "omission" ,
                "propagate" ,
                "misbehave" ,
                "essence" ,
                "orthogonal" ,
                "nagging" ,
                "postulate"));




        System.out.println(words.size());
        for (String each:words){
            Driver.getDriver().get("https://dictionary.cambridge.org/");

            //Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler")).click();
            WebElement searchBox=Driver.getDriver().findElement(By.xpath("//input[@name='q'] "));
            searchBox.sendKeys(each+Keys.ENTER);

    WebElement defBox=Driver.getDriver().findElement(By.xpath("//div[@class='def ddef_d db'] "));
    System.out.println("\n"+each+"\n"+defBox.getText()+"\n"+Driver.getDriver().getCurrentUrl());








        }
        /*Driver.getDriver().get("https://dictionary.cambridge.org/");
        Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler")).click();
        WebElement searchBox=Driver.getDriver().findElement(By.xpath("//input[@name='q'] "));
        searchBox.sendKeys("Illustrate"+ Keys.ENTER);
        System.out.println(Driver.getDriver().getCurrentUrl());

         */
    }
}
