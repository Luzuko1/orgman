package ac.za.cput.adp3.xyzcongolmerate.factory.demography;

import ac.za.cput.adp3.xyzcongolmerate.domain.demography.Gender;
import org.junit.Assert;
import org.junit.Test;

public class GenderFactoryTest {


    @Test
    public void buildGender() {

        String genderDescription = "Male";
        Gender gender = GenderFactory.buildGender(genderDescription);
        Assert.assertNotNull(gender.getGenderId());
        Assert.assertNotNull(gender);
        System.out.println(gender.toString());

    }
}
