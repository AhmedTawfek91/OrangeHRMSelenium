package Utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Generators {

    public static String DATE_TIME_GENERATOR = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
}
