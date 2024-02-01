package datetime;

import java.time.LocalDate;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //current date
        Date currentDate = new Date();
        System.out.println(currentDate);

        //local date
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }
}


