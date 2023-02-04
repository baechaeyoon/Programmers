package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-02-04
 * @title : 특이한 정렬
 * */

import java.util.Arrays;

public class unusualArrangement {
    public static void main(String[] args){
        int[] numList = {10000, 20, 36, 47, 40, 6, 10, 7000};
        int n = 30;
        System.out.println(Arrays.toString(solution(numList,n)));
    }

    public static int[] solution(int[] numList, int n){
        return Arrays.stream(numList)
                .boxed()
                .sorted((a,b) -> Math.abs(a-n) == Math.abs((b-n))?b.compareTo(a) : Integer.compare(Math.abs(a-n),Math.abs(b-n)))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
