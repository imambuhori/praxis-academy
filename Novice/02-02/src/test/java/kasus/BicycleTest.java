import org.junit.Assert;
import org.junit.Test;

public class BicycleTest {
        
    @Test
    public void constructorBicycleTest() {

        Bicycle c = new Bicycle(2, 8, 20);
        c.setCadence(6);
        c.setGear(10);
        c.setSpeed(50);
        
        Assert.assertEquals(8, c.cadence);
        Assert.assertEquals(10, c.gear);
        Assert.assertEquals(58, c.speed);

        c.applyBrake(30);
        Assert.assertEquals(28, c.speed);

        c.applyBrake(28);
        Assert.assertEquals(0, c.speed);
        
        Assert.assertEquals("Stopped", c.stop(c.speed));

        c.speedUp(100);
        c.applyBrake(90);
        Assert.assertEquals(10, c.speed);


    }       
}
