package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    public static void main(String[] args){
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        // 코드 작성

        System.out.println("시작 날짜 : "+ startDate);
        System.out.println("목표 날짜 : "+ endDate);

        //"시간의 간격" = periond!! 으로 구하기
        Period period = Period.between(startDate, endDate);//시간의 간격 구하기
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);//"일"의 간격 구하기

        System.out.println("남은 기간: " + period.getYears()+"년 "+ period.getMonths()+"개월 "+ period.getDays()+"일");//간격에서 뽑아 써야함
        System.out.println("디데이: "+ daysBetween+"일 남음");
    }
}
