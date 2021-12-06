package datamodel;

import lombok.Getter;

@Getter
public class CartModel {

    private String Quantity;
    private String Coupon;
    private String PostCode;
    private String giftCertificate;
    private int zoneValue;
    private int countryValue;

    CartModel(){}

    public static CartModel.Builder getBuilder() {
        return new CartModel().new Builder();
    }

    public class Builder {
        public CartModel.Builder Quantity(String value) {
            Quantity = value;
            return this;
        }
        public CartModel.Builder Coupon(String value) {
            Coupon = value;
            return this;
        }
        public CartModel.Builder PostCode(String value) {
            PostCode = value;
            return this;
        }
        public CartModel.Builder giftCertificate(String value) {
            giftCertificate = value;
            return this;
        }

        public CartModel.Builder zoneValue(int value){
            zoneValue = value;
            return this;
        }
        public CartModel.Builder countryValue(int value){
            countryValue = value;
            return this;
        }

        public CartModel build() {
            return CartModel.this;
        }
    }
}