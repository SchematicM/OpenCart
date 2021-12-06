package repository;

import datamodel.ChangePasswordModel;
import org.apache.commons.lang3.RandomStringUtils;

public class ChangePasswordModelRepository {

    private ChangePasswordModelRepository() {
    }

    public static ChangePasswordModel getValidChangePasswordModel() {
        String password = LoginModelRepository.getValidLoginModel().getPassword();
        return ChangePasswordModel.getBuilder()
                .password(password)
                .passwordConfirm(password)
                .build();
    }

    public static ChangePasswordModel getInValidChangePasswordModel() {
        String password = RandomStringUtils.randomAlphabetic(6);
        String passwordConfirm = RandomStringUtils.randomAlphabetic(3);
        return ChangePasswordModel.getBuilder()
                .password(password)
                .passwordConfirm(passwordConfirm)
                .build();
    }

}
