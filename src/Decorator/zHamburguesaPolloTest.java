package Decorator;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class zHamburguesaPolloTest {
    Hamburguesa pollo;


    @BeforeTest
    public void setup(){
        pollo = new HamburguesaPollo();
    }

    @Test
    public void HamburguesaPollo(){
        pollo = new QuesoAzul(pollo);
        Assert.assertEquals(170, pollo.getPrecio());
        pollo = new Bacon(pollo);
        Assert.assertEquals(220 , pollo.getPrecio());
        pollo = new Huevo(pollo);
        Assert.assertEquals(230, pollo.getPrecio());
        pollo = new Molleja(pollo);
        Assert.assertEquals(310, pollo.getPrecio());
        pollo = new CebollaCaramelizada(pollo);
        Assert.assertEquals(370, pollo.getPrecio());
    }

    @Test
    public void agregarMedallon(){

        pollo.agregarMedallon();
        Assert.assertEquals(200, pollo.getPrecio());
        pollo.agregarMedallon();
        Assert.assertEquals(250, pollo.getPrecio());
        pollo.agregarMedallon();
        Assert.assertEquals(300, pollo.getPrecio());


    }

}
