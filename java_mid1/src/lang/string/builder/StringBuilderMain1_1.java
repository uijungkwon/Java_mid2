package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);// 새롭게 붙인 값들이 들어옴

        sb.insert(4, "Java");
        System.out.println("insert = "+sb);

        //기존 문자열 조작 가능
        sb.delete(4,8);
        System.out.println("delete = "+ sb);

        sb.reverse();
        System.out.println("reverse = "+ sb);

        //StringBuilder -> String
        String string = sb.toString();//string 으로 변환
        System.out.println("string = " + string);
    }
}
