package enumeraion.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {
        AuthGrade[] grades = AuthGrade.values();//enum의 값들을 모두 가져옴
        for (AuthGrade auth : grades) {
            System.out.println("grade = "+auth.name()+", level = "+ auth.getLevel()+", "+ "설명 = "+ auth.getDescription());
        }
    }
}
