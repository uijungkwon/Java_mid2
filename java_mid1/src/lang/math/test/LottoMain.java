package lang.math.test;

public class LottoMain {
    public static void main(String[] args){
        LottoGenerator generator = new LottoGenerator();
        int[] lottoNumbers = generator.generate();
        System.out.print("로또 번호: ");
        for (int i = 0; i< lottoNumbers.length; i++){
            System.out.print(lottoNumbers[i]+" ");
        }
    }
}
