package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-03-16
 * @title : 안전지대
 * */

public class safeZone {
    public static void main(String[] args){
        int[][] board = {{1,1,1,1,1,1}, {1,1,1,1,1,1}, {1,1,1,1,1,1}, {1,1,1,1,1,1}, {1,1,1,1,1,1}, {1,1,1,1,1,1}};
        System.out.println(solution(board));
    }

    public static int solution(int[][] board){
        int answer = 0;
        int length = board.length;
        int[][] temp = new int[length+2][length+2];

        for(int i = 1; i<length+1; i++){
            for(int j =1; j<length+1; j++){
                temp[i][j] = board[i-1][j-1];
            }
        }

        for(int i = 1; i<length+1; i++){
            for(int j = 1; j<length+1; j++){
                if(temp[i][j] == 1){
                    for(int a = i-1; a<=i+1; a++){
                        for(int b = j-1; b <= j+1; b++){
                            if(temp[a][b] != 1) temp[a][b]=2;
                        }
                    }
                }
            }
        }

        for(int i =1; i<length+1; i++){
            for(int j = 1; j<length+1; j++){
                if(temp[i][j] == 0) answer++;
                System.out.println(temp[i][j]);
            }
            System.out.println("");
        }
        return answer;
    }
}
