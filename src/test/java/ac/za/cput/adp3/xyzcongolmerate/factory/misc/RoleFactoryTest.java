package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {


    @Test
    public void buildRole() {

        String roleName = "Admin";
        Role role = RoleFactory.buildRole(roleName);
        Assert.assertNotNull(role.getRoleId());
        Assert.assertNotNull(role);
        System.out.println(role.toString());
    }
}
