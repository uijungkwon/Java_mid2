package time.test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestLoopPlus {
    public static void main(String[] args){
        LocalDate startDate = LocalDate.of(2024,1,1); //날짜만
        //2주 간격으로 5번 반복하여 날짜를 출력!

        for(int i = 0; i< 5; i++){
            LocalDate nextDate = startDate.plusWeeks(2);
            System.out.println("날짜 "+ (i+1) +": "+ nextDate);
            startDate = nextDate;
        }
    }
}
