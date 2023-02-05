package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-02-05
 * @title : 저주의 숫자3
 * */

public class theNumberOfCurse3 {
    public static void main(String[] args){
        int n = 40;
        System.out.println(solution(n));
    }

    public static int solution(int n){
        int answer = n;
        int i = 1;
        while(i <= answer){
            if((i % 3 == 0) || String.valueOf(i).contains("3")){
                answer++;
            }
            i++;
        }
        return answer;
    }
}
