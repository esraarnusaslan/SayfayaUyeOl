package sayfayauyeol;

import java.util.Scanner;

public class Deneme {



    public static boolean isValidEmail(String email){
        boolean isExistEmail;
        if (email.contains("@")){
            System.out.println("Lutfen space kullanmayizniz");
            isExistEmail=false;
        }if (!email.contains("@")){
            System.out.println("Lutfen @ isareti giriniz");
            isExistEmail=false;
        }else if (!(email.endsWith("@gmail.com") || email.endsWith("@yahoo.com") ||email.endsWith("@hotmail.com"))){
            System.out.println("mail adresiniz gmail.com, yahoo.com ya da hotmail.com ile bitmesi gerekiyor");
            isExistEmail=false;
        } else if (email.startsWith("@")) {
            System.out.println("@ isaretinden once sadece buyuk harf, kucuk harf, rakam ya da -+_ sembolleri kullanabilirsiniz");
            isExistEmail=false;
        }else {
            String ilkKisim=email.split("@")[0];
            boolean kontrol=ilkKisim.replaceAll("[A-Za-z0-9-._]","").length()==0;
            if (!kontrol){
                System.out.println("@ isaretinden once sadece buyuk harf, kucuk harf, rakam ya da -+_ sembolleri kullanabilirsiniz");
            }
            isExistEmail=kontrol;
        }
        return isExistEmail;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen mail adresi girin");
        String email=input.nextLine();

        System.out.println("isValidEmail(email) = " + isValidEmail(email));
    }
}
