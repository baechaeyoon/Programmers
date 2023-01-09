package level0;
/*
 * @author : baechaeyoon
 * @date : 2023-01-09
 * @title : 다음에 올 수
 * */

public class nextNumber {
    public static void main(String[] args){
        int[] list = {1,2,3,4};
        System.out.println(solution(list));
    }
        public static int solution(int[] common) {
            int answer = 0;

            if(common[1]-common[0]==common[2]-common[1]){
                answer = common[common.length-1]+(common[1]-common[0]);
            }
            else{
                answer = common[common.length-1]*(common[1]/common[0]);
            }
            return answer;
        }

}
