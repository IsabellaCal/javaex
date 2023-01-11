public class TrinomialDP {
    // Returns the trinomial coefficient T(n, k).
    public static long trinomial(int n, int k){
        long[] a = new long[100];
        if(n==0 && k==0){return 1;}
        if(k<-n || k>n){return 0;} 
        if (a[n] == 0) 
        a[n] =trinomial(n-1,k-1)+trinomial(n-1,k)+trinomial(n-1,k+1);
        return a[n]; 
    }

    // Takes two integer command-line arguments n and k and prints T(n, k).
    public static void main(String[] args){
        int n=Integer.parseUnsignedInt(args[0]);
        int k=Integer.parseUnsignedInt(args[1]);
        System.out.println(trinomial(n, k));
    }
}
