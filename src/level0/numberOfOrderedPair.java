package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-03-04
 * @title : 순서쌍의 개수
 * */

public class numberOfOrderedPair {

    public static void main(String[] args){
        int n = 100;
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int answer = 0;
        for(int i =1; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                answer += ((n/i) == Math.sqrt(n) ? 1:2);
            }
        }
        return answer;
    }
}
