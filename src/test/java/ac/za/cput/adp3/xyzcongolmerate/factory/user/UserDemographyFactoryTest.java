package ac.za.cput.adp3.xyzcongolmerate.factory.user;


import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserDemography;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static ac.za.cput.adp3.xyzcongolmerate.util.Helper.getSuffixFromClassName;
import static org.junit.Assert.*;

public class UserDemographyFactoryTest {


    private static final String SUFFIX = getSuffixFromClassName(UserDemographyFactory.class);
    @Test
    public void buildUserDemography() {

          String userTitle = "Mr";
          String userEmail ="luzuko@gmail.com";
          UserDemography userDemography = UserDemographyFactory.buildUserDemography(userEmail,userTitle,Helper.generateRandomGivenSuffix(SUFFIX), Helper.generateRandomGivenSuffix(SUFFIX),new Date());
          Assert.assertNotNull(userDemography.getGenderId());
          Assert.assertNotNull(userDemography.getRaceId());
          Assert.assertNotNull(userDemography);
        System.out.println(userDemography.toString());

    }
}
