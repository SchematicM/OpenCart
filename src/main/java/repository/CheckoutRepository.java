package repository;

import datamodel.CheckoutModel;
import org.apache.commons.lang3.RandomStringUtils;

public class CheckoutRepository {
    public static CheckoutModel getCheckoutModel(){
        return CheckoutModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(5))
                .lastName(RandomStringUtils.randomAlphabetic(5))
                .company(RandomStringUtils.randomAlphabetic(5))
                .address1(RandomStringUtils.randomAlphabetic(5)+RandomStringUtils.randomNumeric(2))
                .address2(RandomStringUtils.randomAlphabetic(5)+RandomStringUtils.randomNumeric(2))
                .city(RandomStringUtils.randomAlphabetic(4))
                .postcode(RandomStringUtils.randomNumeric(5))
                .deliveryMethodComment(RandomStringUtils.randomAlphabetic(20))
                .paymentMethodComment(RandomStringUtils.randomAlphabetic(20))
                .build();    }
}