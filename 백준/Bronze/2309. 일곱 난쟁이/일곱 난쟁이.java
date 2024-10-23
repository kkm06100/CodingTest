import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        List<Integer> smallGuys = new ArrayList<>();
        
        // 입력 받기
        for (int i = 0; i < 9; i++) {
            smallGuys.add(scanner.nextInt());
            sum += smallGuys.get(i);
        }
        
        // 두 명의 가짜 난쟁이를 찾기
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - smallGuys.get(i) - smallGuys.get(j) == 100) {
                    // 가짜 난쟁이를 제거
                    smallGuys.remove(j); // j를 먼저 제거
                    smallGuys.remove(i); // 그 다음 i를 제거
                    Collections.sort(smallGuys);
                    
                    // 결과 출력
                    for (int k = 0; k < 7; k++) {
                        System.out.println(smallGuys.get(k));
                    }
                    return;
                }
            }
        }
    }
}
