package testausta;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class OhjelmaTest {

    // toteuta tänne testit luokkaa Ohjelma-varten
    @Test
    public void testaaPullojenMaaraOikein() {

        Assert.assertTrue("Pullojen määrä väärin", Ohjelma.suorita(new Scanner("3\n2\n1\n-1\n")).contains("Pulloja: 6"));
        Assert.assertTrue("Pullojen määrä väärin", Ohjelma.suorita(new Scanner("1\n0\n-55\n-1\n")).contains("Pulloja: 1"));
        Assert.assertTrue("Pullojen määrä väärin", Ohjelma.suorita(new Scanner("-55\n-1\n")).contains("Pulloja: 0"));

    }

    @Test
    public void testaaOppilaidenMaaraOikein() {

        Assert.assertTrue("Oppilaiden määrä väärin", Ohjelma.suorita(new Scanner("3\n2\n1\n-1\n")).contains("Oppilaita: 3"));
        Assert.assertTrue("Oppilaiden määrä väärin", Ohjelma.suorita(new Scanner("1\n0\n-55\n-1\n")).contains("Oppilaita: 2"));
        Assert.assertTrue("Oppilaiden määrä väärin", Ohjelma.suorita(new Scanner("-55\n-1\n")).contains("Oppilaita: 0"));

    }

    @Test
    public void testaaKaMaaraOikein() {

        Assert.assertTrue("Oppilaiden määrä väärin", Ohjelma.suorita(new Scanner("3\n2\n1\n-1\n")).contains("Keskiarvo: 2.0"));
        Assert.assertTrue("Oppilaiden määrä väärin", Ohjelma.suorita(new Scanner("1\n0\n-55\n-1\n")).contains("Keskiarvo: 0.5"));
        Assert.assertTrue("Oppilaiden määrä väärin", Ohjelma.suorita(new Scanner("-55\n-1\n")).contains("Keskiarvoa ei voida laskea"));

    }

    @Test
    public void testaaOikeaTulostus() {
        Assert.assertEquals("Pulloja: 6\n"
                + "Oppilaita: 3\n"
                + "Keskiarvo: 2.0", Ohjelma.suorita(new Scanner("3\n2\n1\n-1\n")));

        Assert.assertEquals("Pulloja: 1\n"
                + "Oppilaita: 2\n"
                + "Keskiarvo: 0.5", Ohjelma.suorita(new Scanner("1\n0\n-55\n-1\n")));
        Assert.assertEquals("Pulloja: 0\n"
                + "Oppilaita: 0\n"
                + "Keskiarvoa ei voida laskea", Ohjelma.suorita(new Scanner("-55\n-1\n")));
    }
}
