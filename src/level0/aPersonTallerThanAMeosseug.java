package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-03-18
 * @title : 머쓱이보다 키 큰 사람
 * */

public class aPersonTallerThanAMeosseug {

    public static void main(String[] args){
        int[] array = {180,120,140};
        int height = 190;
        System.out.println(solution(array,height));
    }

    public static int solution(int[] array, int height){
        int answer = 0;

        for(int i = 0; i<array.length; i++){
            if(array[i] > height){
                answer++;
            }
        }

        return answer;
    }
}
