import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        int[][] scores = new int[5][3]; // 다섯 명의 학생들의 국어, 수학, 영어 점수를 저장하는 2차원 배열

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 각 학생의 점수를 입력 받음
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번 학생의 국어, 수학, 영어 점수 입력: ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            scores[i][0] = Integer.parseInt(st.nextToken());
            scores[i][1] = Integer.parseInt(st.nextToken());
            scores[i][2] = Integer.parseInt(st.nextToken());
        }

        // 입력된 점수 확인
        System.out.println("============================================================");
        System.out.println("학생들의 점수:");
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + "번 학생: 국어 " + scores[i][0] + ", 수학 " + scores[i][1] + ", 영어 " + scores[i][2]);
        }

        // 문제 4. 각 학생들의 국어, 수학 점수의 합
        System.out.println("============================================================");
        System.out.println("[4번 문제 : 각 학생들의 국어 점수의 합]");
        int score = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < 2; j++) {
                score += scores[i][j];
            }
            System.out.println(i + "번째 학생의 국어, 수학 점수의 합 : " + score);
            score = 0;
        }

        // 문제 5. 국어 성적이 가장 높은 학생은 누구인지 출력해 주세요.
        int max = 0;
        // 1) 최대 점수 구하기
        for (int i = 0; i < scores.length; i++) {
            if (scores[i][0] > max) {
                max = scores[i][0];
            }
        }

        // 2) 최대 점수의 주인 구하기
        // for (int i = 0; i < scores.length; i++) {
        //     if (scores[i][0] == max) {
        //         System.out.println("\n[국어 최대 점수의 주인 구하기]");
        //         System.out.println("최대 점수의 주인은 " + (i + 1) + "번째 학생입니다.");
        //         System.out.println("점수는 " + scores[i][0] + "점입니다.");
        //         return;
        //     }
        // }

        // 문제 6. : 전 과목의 평균 점수가 가장 높은 학생은 누구인지, 그 학생의 평균 점수는 몇 점인지 출력해 주세요.
        max = 0;
        int result = 0;
        // 1. 최고 점수 찾기.
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                max += scores[i][j];
            }
            if (max > result) {
                result = max;
            }
            max = 0;
        }

        // 2. 최고 점수 주인 찾기
        max = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                max += scores[i][j];
            }
            if (max == result) {
                System.out.println("============================================================");
                System.out.println("[6번 문제 : 전 과목 평균 점수가 가장 높은 학생]");
                System.out.println("전 과목의 평균 점수가 가장 높은 학생은 " + (i + 1) + "번째 학생입니다.");
                System.out.println("이 학생의 평균 점수는 " + (double)(max / 3) + "점 입니다.");
                System.out.println("============================================================");
            }
            max = 0;
        }

        // 문제 7. 다섯 명의 학생의 평균 점수
        System.out.println("[7번 문제 : 다섯 명의 학생의 평균 점수]");
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            System.out.println((i+1) + "번째 학생의 평균 점수 : " + (double)(sum/3));
            sum = 0;
        }
    }
}
