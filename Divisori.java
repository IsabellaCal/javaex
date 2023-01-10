public class Divisori {
    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b){ 
            int max = Math.abs(a);
            int min = Math.abs(b);
            while (max > 0) {
                if (max < min) {
                    int x = max;
                    max = min;
                    min = x;
                }
                max=max%min;
            }
            return min;
        }
     // Returns the least common multiple of a and b.
     public static int lcm(int a, int b){
        int max = Math.abs(a);
        int min = Math.abs(b);
        while (max > 0) {
            if (max < min) {
                int x = max;
                max = min;
                min = x;
            }
            max=max%min;
        }
        return (a*b)/min;
     }
     // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b){
        if(gcd(a, b)==1){
        return true;}
        else{return false;}
    }
     // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int a){
        int count=0;
        for(int i=1;i<a;i++){
           if(areRelativelyPrime(i, a)==true){
           count++;
           }
        }return count;
    }


    // Takes two integer command-line arguments a and b and prints
    // each function, evaluated in the format (and order) given below.
    public static void main(String[] args){
        int a=Integer.parseUnsignedInt(args[0]);
        int b=Integer.parseUnsignedInt(args[1]);
        System.out.println(gcd(a,b));
        System.out.println(lcm(a,b));
        System.out.println(areRelativelyPrime(a,b));
        System.out.println(totient(a));
    }
    
}
