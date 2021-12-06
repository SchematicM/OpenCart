package repository;

import datamodel.AppleCinemaModel;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AppleCinemaModelRepository {

    private AppleCinemaModelRepository() {
    }

    public static AppleCinemaModel getAppleCinemaModel() {
        return AppleCinemaModel.builder()
                .radio(5)
                .checkbox(8)
                .text(RandomStringUtils.randomAlphabetic(4))
                .select(4)
                .textArea(RandomStringUtils.randomAlphabetic(8))
                .uploadFile("src/test/resources/FileForUploading.txt")
                .date(LocalDate.now())
                .time(LocalTime.now())
                .dateAndTime(LocalDateTime.now())
                .quantity("3")
                .build();
    }
}
