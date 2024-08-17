class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        
        long rem, n1 = A, n2 = B;
        
        while(A % B != 0) {
            rem = A % B;
            A = B;
            B = rem;
        }
        
        long gcd = B;
        long lcm = (n1 * n2) / gcd;
        
        Long[] arr = new Long[2];
        arr[0] = lcm;
        arr[1] = gcd;
        
        return arr;
    }
}