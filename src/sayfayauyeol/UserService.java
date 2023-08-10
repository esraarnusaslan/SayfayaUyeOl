package sayfayauyeol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {



        List<String> userNames=new ArrayList<>();
        List<String>password=new ArrayList<>();
        List<String>email=new ArrayList<>();

    public  void register(){
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz");
        String name=input.nextLine();


        //username
        String username;
        boolean isExistBefore;

        do {
            System.out.println("Lutfen kullanici adini giriniz");
            username=input.next();
            isExistBefore=this.userNames.contains(userNames);
            if (isExistBefore){
                System.out.println("Daha once bu kullanici adi kullanilmistir");
            }
        }while (isExistBefore);


        //email
        String email;
        boolean isExistEmail;

        do {
            isExistEmail=false;
            System.out.println("Lutfen email adresi giriniz :");
            email=input.nextLine();
            if (!isValidEmail(email)){
                System.out.println("Lutfen tekrar deneyiniz");
                isExistEmail=true;
            }else {
                isExistEmail=this.email.contains(email);
            }
            isExistEmail=this.email.contains(email);
        }while (isExistEmail);

    }

    public boolean isValidEmail(String email){
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

}
