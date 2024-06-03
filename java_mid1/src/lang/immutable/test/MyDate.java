package lang.immutable.test;

public class MyDate {
    private final int year; //불변 객체로 생성
    private final int month;
    private final int day;

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //새로운 객체들을 반환하도록 생성!
    public MyDate changeYear(int year){
        return new MyDate(year, this.month, this.day);
    }
    public MyDate changeMonth(int month){
        return new MyDate(this.year, month, this.day);
    }
    public MyDate changeDay(int day){
        return new MyDate(this.year, this.month, day);
    }
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

