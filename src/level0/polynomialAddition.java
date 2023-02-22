package level0;

/*
 * @author : baechaeyoon
 * @date : 2023-02-22
 * @title : 다항식 더하기
 * */

public class polynomialAddition {
    public static void main(String[] args){
        String polynomial = "3x + 7 + x";
        System.out.println(solution(polynomial));
    }

    public static String solution(String polynomial){
        int xCount = 0;
        int num = 0;

        for(String s : polynomial.split(" ")) {
            if (s.contains("x")) {
                xCount += s.equals("x") ? 1 : Integer.parseInt(s.replaceAll("x", ""));
            } else if (!s.equals("+")) {
                num += Integer.parseInt(s);
            }
        }
        return (xCount != 0 ? xCount > 1 ? xCount + "x" : "x" : "") + (num != 0 ? (xCount != 0 ? " + " : "") + num : xCount == 0 ? "0" : "");
    }

}
