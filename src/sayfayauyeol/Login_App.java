package sayfayauyeol;

import java.util.Scanner;

public class Login_App {
    public static void main(String[] args) {


        start();




    }



    public static void start() {
        Scanner input=new Scanner(System.in);


        int select;
        do {
            showmenu();
            select= input.nextInt();
            switch (select){
                case 1:

                    break;
                case 2:
                    //giris yapacak
                    break;
                case 0:
                    //cikis yapacak
                    System.out.println("Iyi gunler");
                    break;
                default:
                    System.out.println("Lutfen gecerli bir deger giriniz");
            }

        }while (select!=0);




    }


    public static void showmenu() {
        System.out.println("=============   School Management App   =============");
        System.out.println("\n 1 - Uye Ol\n 2 - Giris Yap\n 0 - Cikis\n");
        System.out.println("Seciniz:  ");

    }
}
