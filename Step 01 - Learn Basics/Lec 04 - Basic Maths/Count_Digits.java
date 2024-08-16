class Solution{
    static int evenlyDivides(int N){
        
        int count = 0; // This will store the final answer
        int originalNum = N; // Store the original number
        
        while(N > 0) {
            int lastDigit = N % 10;
            if(lastDigit != 0 && originalNum % lastDigit == 0) {
                count++;
            }
            N = N / 10;
        }
        
        return count;
    }
}