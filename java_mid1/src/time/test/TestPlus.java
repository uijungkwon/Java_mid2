package time.test;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args){
        LocalDateTime dateTime = LocalDateTime.of(2024,1,1,0,0,0);
        LocalDateTime futureDateTime = dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("기준시각: "+ dateTime);
        System.out.println("변경된 시각: "+futureDateTime);
    }
}
