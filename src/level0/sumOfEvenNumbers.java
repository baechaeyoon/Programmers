package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-02-18
 * @title : 짝수의 합
 * */

public class sumOfEvenNumbers {
    public static void main(String[] args){
        int n = 10;
        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;

        for(int i = 0; i <= n; i++) {
            if(i % 2 == 0)
                answer += i;
        }

        return answer;
    }
}
