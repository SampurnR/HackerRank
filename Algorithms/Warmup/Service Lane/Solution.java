import java.io.*;
import java.util.*;
class Solution{
    protected int N, T; 
    public void setterMethod(){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        T = sc.nextInt();
        int[] width = new int[N];
        int k, l;
        for(k=0; k<N; k++){
            width[k] = sc.nextInt();
        }
        //System.out.println("k");
        int i, j;
        //int[] temp;
        for(l=0; l<T; l++){
            i = sc.nextInt();
            j = sc.nextInt();
            System.out.println(minval(Arrays.copyOfRange(width, i, j+1)));
        }      
     }
    public int minval(int[] arr){
        int i, min = arr[0];
        for(i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        Solution so = new Solution();
        so.setterMethod();
    }
}