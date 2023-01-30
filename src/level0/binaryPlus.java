package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-30
 * @title : 이진수 더하기
 * */

public class binaryPlus {
    public static void main(String[] args){
        String bin1 = "1001";
        String bin2 = "1111";
        System.out.println(solution(bin1,bin2));
    }
    public static String solution(String bin1, String bin2){
        long newValue = Long.parseLong(bin1, 2) + Long.parseLong(bin2, 2);
        return Long.toBinaryString(newValue);
    }
}
