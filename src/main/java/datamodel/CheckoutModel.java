package datamodel;

import lombok.Getter;

@Getter
public class CheckoutModel {
    private String firstName;
    private String lastName;
    private String company;
    private String address1;
    private String address2;
    private String city;
    private String postcode;
    private String deliveryMethodComment;
    private String paymentMethodComment;

    CheckoutModel(){}
    public static CheckoutModel.Builder getBuilder() {
        return new CheckoutModel().new Builder();
    }

    public class Builder {
        public CheckoutModel.Builder firstName(String value) {
            firstName = value;
            return this;
        }
        public CheckoutModel.Builder lastName(String value) {
            lastName = value;
            return this;
        }
        public CheckoutModel.Builder company(String value) {
            company = value;
            return this;
        }
        public CheckoutModel.Builder address1(String value) {
            address1 = value;
            return this;
        }
        public CheckoutModel.Builder address2(String value) {
            address2 = value;
            return this;
        }
        public CheckoutModel.Builder city(String value) {
            city = value;
            return this;
        }
        public CheckoutModel.Builder postcode(String value) {
            postcode = value;
            return this;
        }
        public CheckoutModel.Builder deliveryMethodComment(String value) {
            deliveryMethodComment = value;
            return this;
        }
        public CheckoutModel.Builder paymentMethodComment(String value) {
            paymentMethodComment = value;
            return this;
        }
        public CheckoutModel build() {
            return CheckoutModel.this;
        }
    }
}