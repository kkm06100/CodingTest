import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger n = new BigInteger(st.nextToken());
        BigInteger m = new BigInteger(st.nextToken());
        System.out.print(n.divide(m) + "\n" + n.remainder(m));
    }
}