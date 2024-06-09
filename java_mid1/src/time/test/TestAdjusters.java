package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args){
        int year = 2024;
        int month = 1;

        LocalDate date = LocalDate.of(year, month, 1);//첫째날
        DayOfWeek firstDayOfWeek = date.getDayOfWeek();//월요 ~ 일욜 출력
        DayOfWeek lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();// 날짜 조작 - 그 달의 마지막날
        System.out.println("firstDayOfWeek = "+ firstDayOfWeek);
        System.out.println("lastDayOfWeek = "+ lastDayOfWeek);
    }
}
