import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    double deger1=0,deger2=0;
        System.out.println("yapilcak islemi seciniz (+,-,/,* seklinde)");
        String isaret = scanner.next();

        System.out.println("islem yapilcak 1. degeri giriniz.");
        deger1 = scanner.nextInt();
        System.out.println("islem yapilcak 2. degeri giriniz.");
deger2=scanner.nextInt();
switch (isaret){
    case "+":
        System.out.println(deger1+deger2);
    break;
    case "-"
    :
        System.out.println(deger1-deger2);
    break;
    case"*"
    :
        System.out.println(deger1*deger2);
    break;
    case "/"
    :
        System.out.println(deger1/deger2);
    break;
    default:
        System.out.println("Yanlis bi islem isareti girmis olabilirsiniz.");


}
    }
}