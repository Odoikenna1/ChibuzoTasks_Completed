package ac;

public class Ac {

    private boolean theAcIsOn;
    private int temperature =16;


    public boolean turnAcOn()
    {
        return theAcIsOn = true;
    }
    public boolean turnAcOff()
    {
        this.temperature = 0;
        return theAcIsOn = false;
    }
    public int setTemperature(int newTemperature)
    {
        turnAcOn();
        if (newTemperature >= 16 && newTemperature <= 30) temperature = newTemperature;
        return this.temperature;
    }
    public int raiseTemperature()
    {
        turnAcOn();
        if(this.temperature < 30) this.temperature++;
        return this.temperature;
    }
    public int dropTemperature()
    {
        turnAcOn();
        if(this.temperature > 16) this.temperature--;
        return this.temperature;
    }
    public int getAcTemperature()
    {
        turnAcOn();
        return temperature;
    }

}
