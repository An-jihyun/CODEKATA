class Solution {
    public int solution(int num1, int num2) {
        double answer = (double) num1/num2 * 1000;
        //타입프로모션 덕에 한 곳만 명시해도 됨
        return (int)answer;
    }
}