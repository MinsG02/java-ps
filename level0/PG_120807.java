/*
* 정수 num1과 num2가 매개변수로 주어집니다.
* 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
* */

public class PG_120807 {
    public int solution(int num1, int num2) {
        int answer = 0;

        if (num1 != num2) //양쪽 변수가 다르다면?
            answer = -1; //-1 반환
        else //동일하다면
            answer = 1; //1 반환

        return answer; //메서드 answer 값 반환
    }

    public static void main(String [] args){
        int n1 = 11;
        int n2 = 10;
        PG_120807 pg = new PG_120807();

        System.out.println(pg.solution(n1, n2));

    }
}
