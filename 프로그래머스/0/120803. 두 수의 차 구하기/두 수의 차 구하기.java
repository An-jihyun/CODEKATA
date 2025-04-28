class Solution {
    public int solution(int num1, int num2) {
        if (num1 < -50000 || num1 > 50000 || num2 < -50000 || num2 > 50000) {
            throw new IllegalArgumentException("입력하는 숫자들의 값은 -50000이상이면서 50000이하여야합니다.");
        }
        int answer = num1-num2;
        return answer;
    }
}