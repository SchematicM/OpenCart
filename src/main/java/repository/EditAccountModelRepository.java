package repository;

import datamodel.EditAccountModel;
import org.apache.commons.lang3.RandomStringUtils;

public class EditAccountModelRepository {

    public static EditAccountModel getEditAccountModel() {
        return EditAccountModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(5))
                .lastName(RandomStringUtils.randomAlphabetic(5))
                .email(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .telephone(RandomStringUtils.randomNumeric(10))
                .build();
    }

    public static EditAccountModel changeFirstNameModel() {
        return EditAccountModel.getBuilder()
                .firstName(RandomStringUtils.randomAlphabetic(7))
                .build();
    }

    public static EditAccountModel changeLastNameModel() {
        return EditAccountModel.getBuilder()
                .lastName(RandomStringUtils.randomAlphabetic(8))
                .build();
    }

    public static EditAccountModel changeEmailModel() {
        return EditAccountModel.getBuilder()
                .email(RandomStringUtils.randomAlphabetic(7) + "@gmail.com")
                .build();
    }

    public static EditAccountModel changeTelephoneModel() {
        return EditAccountModel.getBuilder()
                .telephone(RandomStringUtils.randomNumeric(15))
                .build();
    }
}
