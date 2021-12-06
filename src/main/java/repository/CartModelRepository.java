package repository;
import datamodel.CartModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class CartModelRepository {
    public static CartModel getCartModel() {
        return CartModel.getBuilder()
                .PostCode(RandomStringUtils.randomNumeric(5))
                .giftCertificate(RandomStringUtils.randomAlphabetic(5))
                .Quantity(RandomStringUtils.randomNumeric(2))
                .Coupon(RandomStringUtils.randomAlphabetic(5))
                .zoneValue((int) ( Math.random() * 2 ))
                .countryValue((int) ( Math.random() * 255 ))
                .build();
    }
}