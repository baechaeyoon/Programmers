package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-02-27
 * @title : 양꼬치
 * */

public class lambSkewers {

    public static void main(String[] args){
        int n = 64;
        int k = 6;
        System.out.println(solution(n,k));
    }

    public static int solution(int n, int k){
        int answer = 0;
        answer = (n*12000) + ((k - (n/10))*2000);
        return answer;
    }
}
