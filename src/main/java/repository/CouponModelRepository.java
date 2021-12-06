package repository;

import datamodel.CouponModel;
import org.apache.commons.lang3.RandomStringUtils;

public class CouponModelRepository {
    public static CouponModel getCuponModel(){
        return CouponModel.getBuilder()
                .couponName(RandomStringUtils.randomAlphabetic(5)+"coupon")
                .couponCode(RandomStringUtils.randomNumeric(4))
                .discount(RandomStringUtils.randomNumeric(2))
                .totalAmount(RandomStringUtils.randomNumeric(2))
                .build();
    }

    public static  String getValidCouponModel(){return "0000";}

}