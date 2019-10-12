/*package Decorator;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;


public class zPapaFritaTest {

    PapaFrita g1;
    PapaFrita c1;
    PapaFrita m1;


    @BeforeTest
    public void setup(){
        g1 = new PapaGrande();
        m1 = new PapaMediana();
        c1 = new PapaChica();
    }

    @Test
    public void PapaGrande(){
        g1 = new Cheddar(g1);
        Assert.assertEquals(50, g1.getPrecio());
        g1 = new BaconPapa(g1);
        Assert.assertEquals(95, g1.getPrecio());
        g1 = new SalsaBarbacoa(g1);
        Assert.assertEquals(115, g1.getPrecio());
    }

    @Test
    public void PapaMediana(){
        m1 = new Cheddar(m1);
        Assert.assertEquals(45, m1.getPrecio());
        m1 = new BaconPapa(m1);
        Assert.assertEquals(90, m1.getPrecio());
        m1 = new SalsaBarbacoa(m1);
        Assert.assertEquals(110, m1.getPrecio());
    }

    @Test
    public void PapaChica(){
        c1 = new Cheddar(c1);
        Assert.assertEquals(40, c1.getPrecio());
        c1 = new BaconPapa(c1);
        Assert.assertEquals(85, c1.getPrecio());
        c1 = new SalsaBarbacoa(c1);
        Assert.assertEquals(105, c1.getPrecio());

    }

}*/