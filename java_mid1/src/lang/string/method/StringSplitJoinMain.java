package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args){
        String str = "Apple, Banna, Oragne";

        //split()
        String[] splitStr = str.split(",");//문자열 배열 생성
        for(String s: splitStr){
            System.out.println(s);
        }

        String joinStr = "";
        for(int i = 0; i<splitStr.length ; i++){
            String string = splitStr[i];
            joinStr += string;// 문자열 배열을 한 문장으로 합치기
            if(i != splitStr.length-1){
                joinStr += "-";
            }
        }

        System.out.println("joinStr = "+ joinStr);
        //join
        String joinedStr = String.join("-", "A", "B", "C"); //합칠 문자를 앞에 써줌
        System.out.println("joinedStr = "+ joinedStr);

        //문자열 배열 연결
        String result = String.join("-",splitStr );
        System.out.println("result = " + result);

    }
}
