package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args){
        LocalDateTime dt = LocalDateTime.of(2030,1,1,13,30,59);
        System.out.println("YEAR = "+dt.get(ChronoField.YEAR)); //년도 조회
        System.out.println("MONTH_OF_YEAR = " + dt.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("DAY_OF_YEAR = "+dt.get(ChronoField.DAY_OF_YEAR));
        System.out.println("MINUTE_OF_HOUR = " + dt.get(ChronoField.MINUTE_OF_HOUR));

        //편의 메서드 제공
        System.out.println("편의 메서드 제공");
        System.out.println("YEAR = "+dt.getYear()); //년도 조회
        System.out.println("MONTH_OF_YEAR = " + dt.getMonthValue());
        System.out.println("DAY_OF_YEAR = "+dt.getDayOfYear());
        System.out.println("MINUTE_OF_HOUR = " + dt.getMinute());

        System.out.println("편의 메서드에 없음");
        System.out.println("MINUTE_OF_DAY = "+ dt.get(ChronoField.MINUTE_OF_DAY));
        System.out.println("SECOND_OF_DAY = " + dt.get(ChronoField.SECOND_OF_DAY));
    }
}
