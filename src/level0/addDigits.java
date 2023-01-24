package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-24
 * @title : 자릿수 더하기
 * */

public class addDigits {

    public static void main(String[] args){
        int n = 930211;
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int answer = 0;

        while(n>0){
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}
