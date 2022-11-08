package tests;

import service.AddressPageService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddressPageTest extends BaseTest {

    private AddressPageService addressPageService;

    @BeforeClass
    public void setUp() {
        addressPageService = new AddressPageService();
    }

    @Test
    public void createAddressTest() {
        addressPageService.createYourAddress();
        String actualTitleOfAddress = addressPageService.getTitleOfAddressPage();
        String expectedTitleOfAddress = "MINSK";
        Assert.assertTrue(actualTitleOfAddress.contains(expectedTitleOfAddress), "The actual title of the address does not match expected!");
    }

    @Test
    public void deleteAddressTest() {
        addressPageService.deleteAddress();
        String actualMessageOfPageAfterDeleteAddress = addressPageService.getTextOfPageAfterDeleteAddress();
        String expectedMessageOfPageAfterDeleteAddress = "No addresses are available.";
        addressPageService.clickOnLogoutButton();
        Assert.assertTrue(actualMessageOfPageAfterDeleteAddress.contains(expectedMessageOfPageAfterDeleteAddress), "The actual message of the page does not match expected!");
    }

}
