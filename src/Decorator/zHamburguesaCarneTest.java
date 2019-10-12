package Decorator;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class zHamburguesaCarneTest {
    Hamburguesa carne;

    @BeforeTest
    public void setup(){
        carne = new HamburguesaCarne();
    }

    @Test
    public void HamburguesaCarne(){
        carne = new QuesoAzul(carne);
        Assert.assertEquals(220, carne.getPrecio());
        carne = new Bacon(carne);
        Assert.assertEquals(270, carne.getPrecio());
        carne = new Huevo(carne);
        Assert.assertEquals(280, carne.getPrecio());
        carne = new Molleja(carne);
        Assert.assertEquals(360, carne.getPrecio());
        carne = new CebollaCaramelizada(carne);
        Assert.assertEquals(420, carne.getPrecio());
    }

    @Test
    public void agregarMedallon() {
        carne.agregarMedallon();
        Assert.assertEquals(250, carne.getPrecio());
        carne.agregarMedallon();
        Assert.assertEquals(300, carne.getPrecio());
        carne.agregarMedallon();
        Assert.assertEquals(350, carne.getPrecio());
    }


}