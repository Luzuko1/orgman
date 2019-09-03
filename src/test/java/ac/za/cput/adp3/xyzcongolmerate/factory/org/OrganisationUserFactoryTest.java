package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import ac.za.cput.adp3.xyzcongolmerate.domain.org.OrganisationUser;
import ac.za.cput.adp3.xyzcongolmerate.util.Helper;
import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;

import static ac.za.cput.adp3.xyzcongolmerate.util.Helper.generateRandomGivenSuffix;
import static ac.za.cput.adp3.xyzcongolmerate.util.Helper.getSuffixFromClassName;
import static org.junit.Assert.*;

public class OrganisationUserFactoryTest {

    private static final String SUFFIX = getSuffixFromClassName(OrganisationUserFactory.class);

    @Test
    public void buildOrganisationUser() {

        String userEmail ="luzuko@gmail.com";
        OrganisationUser organisationUser = OrganisationUserFactory.buildOrganisationUser(Helper.generateRandomGivenSuffix(SUFFIX), userEmail);
        Assert.assertNotNull(organisationUser.getOrgCode());
        Assert.assertNotNull(organisationUser);
        System.out.println(organisationUser.toString());

    }
}
