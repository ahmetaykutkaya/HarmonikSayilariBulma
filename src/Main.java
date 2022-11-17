import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner data = new Scanner(System.in);

        int n ;
        double rasult =0;
        System.out.print("Sayiyi Giriniz : ");
        n = data.nextInt();

        for (double i = 1 ;i <=n;i++){
            rasult += (1/i);
        }
        System.out.print(rasult);
    }
}