import java.util.*;

class Solution{
    public static void main(String[] args){
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int i, j;
        int[] sticks = new int[N];
        for(i=0; i<N; i++){
            sticks[i] = sc.nextInt();
        }
        Arrays.sort(sticks);
        int min = sticks[0],count = 0;
        for(i=0; i<N; i++){
            for(int x : sticks){
                if(x !=0){
                    min = x;
                    break;
                }
            }
            sticks = cutOperation(sticks, min);
            Arrays.sort(sticks);
        }
    }
   protected static int[] cutOperation(int[] sticks, int min){
       int j, count = 0;
       count = 0;
            for(j=0; j<sticks.length; j++){
                if(sticks[j] > 0){
                    count++;
                    sticks[j] = sticks[j] - min;
                }    
            }
       if(count != 0){System.out.println(count);} 
            
            return sticks;
   } 
}