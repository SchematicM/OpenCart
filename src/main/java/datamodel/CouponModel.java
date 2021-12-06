package datamodel;

import lombok.Getter;

@Getter
public class CouponModel {
    private String couponName;
    private String couponCode;
    private String discount;
    private String totalAmount;

    public CouponModel(){}
    public static CouponModel.Builder getBuilder() {
        return new CouponModel().new Builder();
    }

    public class Builder {
        public CouponModel.Builder couponName(String value) {
            couponName = value;
            return this;
        }
        public CouponModel.Builder couponCode(String value) {
            couponCode = value;
            return this;
        }
        public CouponModel.Builder discount(String value) {
            discount = value;
            return this;
        }
        public CouponModel.Builder totalAmount(String value) {
            totalAmount = value;
            return this;
        }

        public CouponModel build() {
            return CouponModel.this;
        }
    }
}