package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        // 코드 작성
        String[] allFruit = fruits.split(",");

        for(String s : allFruit){
            System.out.println(s);
        }
        String joinedString = String.join("->", allFruit);
        System.out.println("joinedString = "+joinedString);

    }
}
