package example;

import java.util.Scanner;

public class DayOfYear {
    // 각 달의 일 수
    static int[][] mdays = {
            {31,28,31,30,31,30,31,31,30,31,30,31}, // 평년
            {31,29,31,30,31,30,31,31,30,31,30,31}  // 윤년
    };

    // 서기 year년은 윤년인가 평년인가?(윤년 : 1, 평년 : 0)
    static int isLeep(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }

    // 서기 y년 m월 d일의 그 해 경과 일 수를 구함
    static int dayOfYear(int y, int m, int d) {
        int days = d;

        for(int i = 1; i < m; i++) {
            days += mdays[isLeep(y)][i - 1];
        }

        return days;
    }

    // 그 해의 남은 일 수를 구함
    static int leftDayOfYaer(int y, int m, int d) {
        int days = 0;

        int chkLeep = isLeep(y);
        if(chkLeep == 1) {
            days = 366;
        } else {
            days = 365;
        }

        for (int i = 1; i < m; i++) {
            days -= mdays[chkLeep][i - 1];
        }

        return days - d;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int retry;

        do {
            System.out.print("년 : ");
            int year = scan.nextInt();
            System.out.print("월 : ");
            int month = scan.nextInt();
            System.out.print("일 : ");
            int day = scan.nextInt();

            System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year, month, day));
            System.out.printf("남은 일 수는 %d일입니다.\n", leftDayOfYaer(year, month, day));

            System.out.println("한 번 더 할까요? (1.예/0.아니오) : ");
            retry = scan.nextInt();
        }while (retry == 1);
    }
}
