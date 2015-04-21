import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N, K;
        int[] a;
        for(int i=0; i<T; i++){
            N = sc.nextInt();
            K = sc.nextInt();
            a = new int[N];
            for(int j = 0; j<N; j++){
                a[j] = sc.nextInt();
            }
            System.out.println(cancelclass(a, K));
        }
    }
    protected static String cancelclass(int[] a, int K){
        int i;
        int count = 0;
        for(i=0; i< a.length; i++){
            if(a[i] <= 0){
                count++;
            }
        }
        if(count >= K){
            return("NO");
        }
        return("YES");
    }
}