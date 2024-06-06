package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random(); //랜덤 수
    private int[] lottoNumbers;
    private int count;

    //로또 번호 생성기(1~45), 중복된 숫자 X
    public int[] generate(){
        lottoNumbers = new int[6];
        count =0;
        while(count<6){
            int number = random.nextInt(45)+1;
            if(check(number)) { //숫자 중복 체크
                lottoNumbers[count] = number;
                count++;
            }
        }
        return lottoNumbers;
    }

    private boolean check(int n){
        for(int i = 0; i< count; i++){//모두 공통 변수로 확인!
            if(lottoNumbers[i] == n)
                return false;
        }
        //for문에서 모든 검사가 통과되면
        return false;
    }
}
