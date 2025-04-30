class Solution {
    public int solution(int num1, int num2) {
        if(num1 < 0 || num1 > 10000 || num2 < 0 || num2 > 10000) {
            throw new IllegalArgumentException("입력하는 숫자의 값은 0이상, 10,000이하여야합니다.");
        }
        
        return num1 == num2 ? 1 : -1;
        // int answer;
        // if(num1 == num2){
        //     answer = 1;
        // }
        // else{
        //     answer = -1;
        // }
        // return answer;
    }
}