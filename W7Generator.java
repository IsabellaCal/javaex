public class W7Generator 
{ // Generate N integers in [-M, M)
 public static void main(String[] args) 
 { 
 int M = Integer.parseInt(args[0]); 
 int N = Integer.parseInt(args[1]); 
 for (int i = 0; i < N; i++) 
 StdOut.println(StdRandom.uniformInt(-M, M)); 
 } 
}