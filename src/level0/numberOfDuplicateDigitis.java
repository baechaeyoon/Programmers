package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-03-11
 * @title : 중복된 숫자 개수
 * */

public class numberOfDuplicateDigitis {
    public static void main(String[] args){
        int[] array = {0,2,3,4};
        int n = 1;
        System.out.println(solution(array,n));
    }

    public static int solution(int[] array, int n){
        int answer= 0;

        for(int i =0; i<array.length; i++){
            if(array[i] == n){
                answer++;
            }
        }
        return answer;
    }
}
