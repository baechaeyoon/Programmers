package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-03-15
 * @title : 주사위의 개수
 * */

public class numberOfDice {

    public static void main(String[] args){
        int[] box = {10, 8, 6};
        int n = 3;
        System.out.println(solution(box,n));
    }

    public static int solution(int[] box, int n){
        int answer = (box[0]/n) * (box[1]/n) * (box[2]/n);
        return answer;
    }
}
