package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-30
 * @title : 치킨 쿠폰
 * */

public class chickenCoupon {
    public static void main(String[] args){
        int chicken = 100;
        System.out.println(solution(chicken));
    }

    public static int solution(int chicken){
        int answer = chicken/9;

        if(chicken > 1 && chicken % 9 == 0){
            answer--;
        }
        return answer;
    }
}
