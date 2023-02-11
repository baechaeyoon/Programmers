package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-02-11
 * @title : 유한소수 판별하기
 * */

public class determiningFiniteDecimalNumbers {

    public static void main(String[] args){
        int a = 11;
        int b = 22;
        System.out.println(solution(a,b));
    }
    public static int solution(int a, int b) {
        int answer = 0;

        for (;b%2 == 0;) {
            b = b/2;
        }
        for (;b%5 == 0;) {
            b = b/5;
        }

        if ((a/(double)b)%1 == 0) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}
