import java.io.*;
class Solution{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int i;
        long K;
        for(i=0; i<T; i++){
            K = Integer.parseInt(br.readLine());
            System.out.println(calculate(K));
        }
    }
    protected static long calculate(long K){
        if(K%2 == 0){
            return ((K/2) * (K/2));
        }else{
            return ((K/2) * ((K/2)+1));
        }
    }
    
}