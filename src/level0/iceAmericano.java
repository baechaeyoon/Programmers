package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-02-24
 * @title : 아이스 아메리카노
 * */

import java.util.Arrays;

public class iceAmericano {

    public static void main(String[] args){
        int money = 15000;
        System.out.println(Arrays.toString(solution(money)));
    }

    public static int[] solution(int money){
        return new int[] {money / 5500, money % 5500};
    }
}
