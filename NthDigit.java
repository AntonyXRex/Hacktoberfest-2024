import java.util.Scanner;
public class nthDigit {
    public int findNthDigit(int n) {
        long digitInNum = 1, start = 1, end = 9;

        while (n > digitInNum * end) {
            n -= digitInNum * end;
            digitInNum++;
            start *= 10;
            end *= 10;
        }

        long num = start + (n - 1) / digitInNum;
        String numStr = Long.toString(num);
        return numStr.charAt((int) ((n - 1) % digitInNum)) - '0';
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        nthDigit nthDigit = new nthDigit();
        scanner.close();
        System.out.println("The " + n + "th digit is: " + nthDigit.findNthDigit(n));
    }
}
