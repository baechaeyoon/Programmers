package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-26
 * @title : 369 게임
 * */
public class game369 {

    public static void main(String[] args){
        int order = 29423;
        System.out.println(solution(order));
    }
    public static int solution(int order){
        int answer = 0;
        int count = 0;

        while(order != 0){
            if(order % 10 == 3 || order % 10 == 6 || order % 10 == 9){
                count ++;
            }
            order = order/10;
        }
        answer = count;
        return answer;
    }
}
