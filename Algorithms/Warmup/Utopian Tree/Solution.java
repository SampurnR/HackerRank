import java.util.*;
class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        int[] N = new int[T];
        int i = 0;
        for (i=0; i<T; i++){
            N[i] = sc.nextInt();
        }
        for(i=0; i<T; i++){
            //System.out.println(N[i]);
            System.out.println(calculateHeight(N[i]));
        }
    }
    public static int calculateHeight(int n){
        int i = 1;
        int height =1; //initially height is 1
        while (i<=n){
            if(i%2 != 0){
                height *= 2;
            }else{
                height +=1;
            }
            i++;
        }
        return height;
    }
}