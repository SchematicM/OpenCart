package datamodel;

import lombok.Getter;

@Getter
public class ChangePasswordModel {

    private String password;
    private String passwordConfirm;

    ChangePasswordModel() {
    }

    public static ChangePasswordModel.Builder getBuilder() {
        return new ChangePasswordModel().new Builder();
    }


    public class Builder {
        public ChangePasswordModel.Builder password(String value) {
            password = value;
            return this;
        }

        public ChangePasswordModel.Builder passwordConfirm(String value) {
            passwordConfirm = value;
            return this;
        }

        public ChangePasswordModel build() {
            return ChangePasswordModel.this;
        }
    }
}

