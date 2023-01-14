package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-14
 * @title : 제곱수 판별하기
 * */

public class determiningTheNumberOfSquares {
    public static void main(String[] args){
        int n = 976;
        System.out.println(solution(n));
    }
    public static int solution(int n){
        if(n % Math.sqrt(n) == 0){
            return 1;
        }
        else{
            return 2;
        }
    }
}
