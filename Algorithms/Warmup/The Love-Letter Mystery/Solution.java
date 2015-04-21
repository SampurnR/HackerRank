import java.io.*;
import java.util.*;
class Solution{
    protected static void convertToPalindrome(String n){
        int len = n.length();
        int mid;
        int ops = 0;
        
        mid = len/2;
        
        
        int i;
        for(i=0; i<mid; i++){
            ops += Math.abs(n.charAt(i) - n.charAt(len-i-1));
        }
        
      System.out.println(ops);
        
    }
    public static void main(String[] args)throws IOException{
        Solution so = new Solution();
        int T;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        for(int i=0; i<T; i++){
            convertToPalindrome(br.readLine());
        }
    }
}