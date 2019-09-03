package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.UserRole;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import org.junit.Assert;
import org.junit.Test;

import static ac.za.cput.adp3.xyzcongolmerate.util.Helper.getSuffixFromClassName;
import static org.junit.Assert.*;

public class UserRoleFactoryTest {

    private static final String SUFFIX = getSuffixFromClassName(UserRoleFactory.class);

    @Test
    public void buildUserRole() {

        UserRole userRole = UserRoleFactory.buildUserRole(Helper.generateRandomGivenSuffix(SUFFIX),"Luzuko@gmail.com",Helper.generateRandomGivenSuffix(SUFFIX));
        Assert.assertNotNull(userRole);
        System.out.println(userRole.toString());
    }
}
