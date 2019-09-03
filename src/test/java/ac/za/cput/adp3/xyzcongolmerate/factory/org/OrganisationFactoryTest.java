package ac.za.cput.adp3.xyzcongolmerate.factory.org;

import ac.za.cput.adp3.xyzcongolmerate.domain.org.Organisation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrganisationFactoryTest {


    @Test
    public void buildOrganisation() {


        String organisationName = "CSGI";
        Organisation organisation = OrganisationFactory.buildOrganisation(organisationName);
        Assert.assertNotNull(organisation.getOrgCode());
        Assert.assertNotNull(organisation);
        System.out.println(organisation.toString());
    }
}
