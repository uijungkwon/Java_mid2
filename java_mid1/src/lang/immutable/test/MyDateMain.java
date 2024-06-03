package lang.immutable.test;

public class MyDateMain {
    public static void main(String[] args){
        MyDate date1 = new MyDate(2024,1,1);
        MyDate date2 = date1; //같은 객체를 참조하고 있음

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        //date1.setYear(2025); //컴파일 오류
        date1 = date1.changeYear(2025);//반드시 반환 받아야하며, date1은 새로운 객체를 참조하게됨.

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}
