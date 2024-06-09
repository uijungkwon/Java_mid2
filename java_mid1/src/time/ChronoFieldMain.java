package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMain {
    public static void main(String[] args){
        ChronoField[] values = ChronoField.values();
        for(ChronoField value : values){
            System.out.println(value + ", range = " + value.range()); //숫자의 범위
        }
        System.out.println("MONTH_OF_YEAR.range() = " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("DAY_OF_YEAR.range() = " + ChronoField.MICRO_OF_DAY.range());
    }
}
