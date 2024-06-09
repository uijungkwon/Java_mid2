package time.test;

import java.time.*;

public class TestZone {
    public static void main(String[] args){
        //서울 회의시간은 2024년 1월 1일 오전 9시
        //이때 런던, 뉴옥의 회의 시간을 구해라
        //존 타임 사용!
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024,1,1), LocalTime.of(9,0), ZoneId.of("Asia/Seoul")); //런던이랑 9시간 차이!
        ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));//with를 사용해서 Zone 시간 구하기!!
        ZonedDateTime nyTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: "+ seoulTime);
        System.out.println("런던의 회의 시간: "+ londonTime);
        System.out.println("뉴욕의 회의 시간: "+ nyTime);
    }
}
