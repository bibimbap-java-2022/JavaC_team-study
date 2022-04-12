package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final int ROW = 5;
    private static final int COL = 5;

    public static void main(String[] args) {
        // 학번,이름 출력
        System.out.println("201711649 손소영");

        // [numbers 배열을 오름차순으로 정렬한 뒤에 출력해주세요]
        int[] numbers = {1, 12, -1, 22, 17, 15, 123123, 22, -121, 199, 0, -11, -150};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        // [빙고게임]
        // 1. int형 2차원 배열 map을 (ROW*COL) 크기로 생성해주세요

        int[][] map = new int[ROW][COL];

        // 건드리지 않아도 됩니다(map 세팅)
        setMap(map);

        // 2. 스캐너 sc를 생성해주세요
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("숫자를 입력해주세요[ex: 5] : ");

            // 3. 사용자로부터 정수 하나를 입력받아주세요
            int num = sc.nextInt();
            // 4. map 배열에서 해당 숫자의 칸을 0으로 만들어주세요.
            for (int i=0; i<ROW; i++) {
                for (int j=0; j<COL; j++) {
                    if (map[i][j] == num) {
                        map[i][j] = 0;
                    }
                }
            }
            // 5. 3빙고 이상이면 while 문을 종료해주세요.
            if (chkBingo(map)) break;
            System.out.println();
        }
        // 6. 게임이 종료되면 map 배열을 출력해주세요
        for (int i=0; i<ROW; i++) {
            System.out.print("|");
            for (int j=0; j<COL; j++) {
                if (map[i][j] < 10) System.out.print("  ");
                else System.out.print(" ");
                System.out.print(map[i][j] + " |");
            }
            System.out.println();
        }

    }

    private static void setMap(int[][] map) {
        for (int i = 1; i <= ROW*COL; i++) {
            boolean flag = true;
            while (flag) {
                int mi = ((int) (Math.random() * 10)) % ROW;
                int mj = ((int) (Math.random() * 10)) % COL;
                if (map[mi][mj] == 0) {
                    map[mi][mj] = i;
                    flag = false;
                }
            }
        }
    }

    private static Boolean chkBingo(int[][] map) {
        boolean isZero;
        int bingo = 0;

        // 가로 빙고 확인
        for (int i=0; i<ROW; i++) {
            isZero = true;
            for (int j=0; j<COL; j++) {
                if (map[i][j] != 0) {
                    isZero = false;
                    break;
                }
            }
            if (isZero)
                bingo++;
        }

        // 세로 빙고 확인
        for (int i=0; i<COL; i++) {
            isZero = true;
            for (int j=0; j<ROW; j++) {
                if (map[j][i] != 0) {
                    isZero = false;
                    break;
                }
            }
            if (isZero)
                bingo++;
        }

        // 우하향 대각선 빙고 확인
        isZero = true;
        for (int i=0; i<ROW; i++) {
            if (map[i][i] != 0) {
                isZero = false;
                break;
            }
        }
        if (isZero) bingo++;

        //우상향 대각선 빙고 확인
        isZero = true;
        for (int i=0; i<ROW; i++) {
            if (map[i][ROW-(1+i)] != 0) {
                isZero = false;
                break;
            }
        }
        if (isZero) bingo++;

        return (bingo >= 3);


    }
}