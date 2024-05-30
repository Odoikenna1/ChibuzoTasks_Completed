package ac;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AcTest {


    @Test
    public void testThatAcCanBeSwitchedOn()
    {
        Ac odoTronic = new Ac();
        assertTrue(odoTronic.turnAcOn());
    }
    @Test
    public void testThatAcCanBeSwitchedOff()
    {
        Ac odoTronic = new Ac();
        assertFalse(odoTronic.turnAcOff());
    }
//    @Test
//    publi
    @Test
    public void testThatAcTemperatureCanBeChanged()
    {
        Ac odoTronic = new Ac();
        odoTronic.turnAcOn();
        odoTronic.setTemperature(15);
        assertEquals(16, odoTronic.getAcTemperature());
    }
    @Test
    public void testThatAcTemperatureCanBeRaised()
    {
        Ac odoTronic = new Ac();
        odoTronic.turnAcOn();
        int raiseTempToDegree = 38;
        for(int numberOfCalls = 1; numberOfCalls <= raiseTempToDegree; numberOfCalls++)
        {
            odoTronic.raiseTemperature();
        }
        assertEquals(30, odoTronic.getAcTemperature());
    }
    @Test
    public void testThatAcTemperatureCanBeDropped()
    {
        Ac odoTronic = new Ac();
        odoTronic.turnAcOn();
        int dropTempToDegree = 6;
        for (int currentTemperature = 16; currentTemperature > dropTempToDegree; currentTemperature--)
        {
            odoTronic.dropTemperature();
        }
        assertEquals(16, odoTronic.getAcTemperature());
    }
}