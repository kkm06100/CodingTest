import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        str = str.replace("c=","A");
        str = str.replace("c-","A");
        str = str.replace("dz=","A");
        str = str.replace("d-","A");
        str = str.replace("lj","A");
        str = str.replace("nj","A");
        str = str.replace("s=","A");
        str = str.replace("z=","A");
        System.out.println(str.length());
    }
        
}