package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-04-11
 * @title : 배열의 평균값
 * */

public class averageOfArray {

    public static void main(String[] args){
        int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        System.out.println(solution(numbers));
    }

    public static double solution(int[] numbers){
        double answer = 0;
        double sum = 0;

        for(int i = 0; i<numbers.length; i++){
            sum += numbers[i];
        }
        answer = sum / numbers.length;
        return answer;
    }
}
