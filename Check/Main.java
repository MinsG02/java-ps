import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. 단순 출력 확인
        System.out.println("================================");
        System.out.println("✅ Java 개발 환경 테스트 시작");
        System.out.println("================================");

        // 2. 입력 기능 확인 (Scanner)
        Scanner scanner = new Scanner(System.in);
        System.out.print("테스트를 위해 본인의 이름을 입력해 보세요: ");
        String name = scanner.nextLine();

        // 3. 반복문 및 로직 확인
        System.out.println("\n[실행 결과]");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + "번째 인사: 안녕하세요, " + name + "님!");
        }

        System.out.println("\n정상적으로 실행되었습니다. 테스트를 종료합니다.");
        scanner.close();
    }
}