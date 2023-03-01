package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-03-01
 * @title : 옷 가게 할인 받기
 * */

public class getaDiscountOnaClothingStore {

    public static void main(String[] args){
        int price = 580000;
        System.out.println(solution(price));
    }

    public static int solution(int price){
        int answer = 0;

        if(price >= 500000){
            answer = (int)(price * 0.8);
        }
        else if(price >= 300000){
            answer = (int)(price * 0.9);
        }
        else if(price >= 100000){
            answer = (int)(price * 0.95);
        }
        else{
            answer = price;
        }
        return answer;
    }
}
