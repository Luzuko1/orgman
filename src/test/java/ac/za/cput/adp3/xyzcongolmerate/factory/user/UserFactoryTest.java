package ac.za.cput.adp3.xyzcongolmerate.factory.user;

import ac.za.cput.adp3.xyzcongolmerate.domain.user.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserFactoryTest {


    @Test
    public void buildUser() {

        User user = UserFactory.buildUser("luzuko@gmail.com","Luzuko","Ndlebe");
        Assert.assertNotNull(user);
        Assert.assertNotNull(user.getUserEmail());
        System.out.println(user.toString());
    }
}
