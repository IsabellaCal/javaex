public class W7Collector 
{ 
 public static void main(String[] args) 
 { 
 int N = Integer.parseInt(args[0]); 
 int trials = Integer.parseInt(args[1]); 
 int cardcnt = 0; 
 double start = System.currentTimeMillis()/1000.0; 
 for (int i = 0; i < trials; i++) 
 { 
 int valcnt = 0; 
 boolean[] found = new boolean[N]; 
 while (valcnt < N) 
 { 
 int val = (int) (Math.random() * N); 
 cardcnt++; 
 if (!found[val]) 
 { valcnt++; found[val] = true; } 
 } 
 } 
 double now = System.currentTimeMillis()/1000.0; 
 StdOut.printf("%d %.0f ", N, N*Math.log(N) + .57721*N); 
 StdOut.print(cardcnt/trials); 
 StdOut.printf(" (%.0f seconds)\n", now - start); 
 } 
}