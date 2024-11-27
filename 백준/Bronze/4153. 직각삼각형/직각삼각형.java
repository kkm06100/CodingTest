import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        try {
            while(true){
                String value = bf.readLine();
                String[] numbersString = value.split(" ");
                int[] numbers = new int[3];

                for(int i = 0; i < 3; i++) {
                    numbers[i] = Integer.parseInt(numbersString[i]);
                }

                if(numbers[0] == 0 && numbers[1] == 0 && numbers[2] == 0) {
                    break;
                }

                Arrays.sort(numbers);

                if(numbers[0] * numbers[0] + numbers[1] * numbers[1] == numbers[2] * numbers[2]) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
