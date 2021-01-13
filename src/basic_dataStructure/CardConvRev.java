package basic_dataStructure;

public class CardConvRev {
    // 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환합니다.
    static void cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while(x != 0);
    }

    public static void main(String[] args) {
        char[] d = new char[35];

        cardConvR(167, 16, d);
        for (int i = 0; i < d.length; i++) {
            if(d[i] != 0) {
                System.out.print(d[i]);
            }
        }
    }
}
