package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Race;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RaceFactoryTest {


    @Test
    public void buildRace() {

        String raceDescription = "African";
        Race race = RaceFactory.buildRace(raceDescription);
        Assert.assertNotNull(race.getRaceId());
        Assert.assertNotNull(race);
        System.out.println(race.toString() );
    }
}
