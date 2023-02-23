import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double ucret=10,km;
        Scanner oku=new Scanner(System.in);

        System.out.println("Km giriniz: ");
        km=oku.nextInt();

        if(km<0){
            System.out.println("Km negatif deger alamaz!");
            System.exit(1);
        }

        ucret+=km*2.20;

        if(ucret<20){
            ucret=20;
        }
        System.out.println("Taksimetre ucretiniz = "+ucret);




    }
}