import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   static int lonelyinteger(int[] a) {
       int i;
       if(a.length ==1){
           return a[0];
       }
       int[] count = new int[100];
       for(i=0; i<count.length; i++){
           count[i] = 0;
       }
       for(i=0; i<a.length; i++){
           count[a[i]]++;
       }
       for(i=0; i<count.length; i++){
           if((count[i] == 0) || (count[i]==2)){
               continue;
           }else{
               return i;
           }
       }
      return 0;
    }
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}
