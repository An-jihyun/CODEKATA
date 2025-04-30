class Solution {
    public int solution(int num1, int num2) {
        if(num1 <= 0 || num1 > 100 || num2 <= 0 || num2 > 100) {
            throw new IllegalArgumentException("입력하는 숫자의 값은 0보다 크고 100보다 작거나 같아야 합니다.");
        }
        int answer = num1 / num2;
        return answer;
    }
}