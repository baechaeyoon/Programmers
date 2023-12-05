package level1;

/*
 * @author : baechaeyoon
 * @date : 2023-12-05
 * @title : 추억 점수
 * */

import java.util.Arrays;
import java.util.HashMap;

public class memoriesScore {

    public static void main(String[] args){
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may"},{"kein", "deny", "may"}, {"kon", "coni"}};

        System.out.println("solution >> "+Arrays.toString(solution(name,yearning,photo)));
        System.out.println("solution2 >> "+Arrays.toString(solution2(name,yearning,photo)));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo){
        int[] answer = new int[photo.length];

        for(int i =0; i< photo.length; i++){
            for(int j =0; j<photo[i].length; j++){
                for(int k =0; k<name.length; k++){
                    if(photo[i][j].equals(name[k])){
                        answer[i] += yearning[k];
                    }
                }
            }
        }

        return answer;
    }

    public static int[] solution2(String[] name, int[] yearning, String[][] photo){
        int[] answer = new int[photo.length];

        HashMap<String, Integer> map = new HashMap<>();

        for(int i =0; i<name.length; i++){
            map.put(name[i], yearning[i]);  //추억하는 사람 이름에 점수 저장
        }

        for(int i =0; i< photo.length; i++){
            String[] persons = photo[i];    //그룹별 배열 생성
            int score = 0;

            for(int j =0; j< persons.length; j++){
                String person = persons[j];
                if(map.containsKey(person)){    //map의 key에 photo 속 사람이 있다면
                    score += map.get(person);   //점수 추가
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}
