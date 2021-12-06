package datamodel;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Builder
public class AppleCinemaModel {

    private int radio; // 5, 6 or 7
    private int checkbox; // 8, 9, 10 or 11
    private String text;
    private int select; // 4, 3, 2 or 1
    private String textArea;
    private String uploadFile;
    private final LocalDate date;
    private final LocalTime time;
    private final LocalDateTime dateAndTime;
    private String quantity;

}