import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    int hak = 3;
    String kullaniciAdi , sifre;
    int bakiye = 55000;
    
    
    

    System.out.print("Kullanici adinizi giriniz : ");
    kullaniciAdi = scanner.nextLine();
    System.out.print("Sifrenizi giriniz : ");
    sifre = scanner.nextLine();

    if(kullaniciAdi.equals("Borawrr") && sifre.equals("Bt140520_")){

        System.out.println("Sisteme basarili bir sekilde giris yaptiniz ! ");
        System.out.println("Lutfen asagidan yapmak istediginiz islemi seciniz. ");
        
        while(hak > 0){
            
            System.out.println("1-Para Yatirma\n" + "2-Para Cekme\n" + "3-Bakiye Sorgulama\n" + "4-Cikis Yap");
            int secim = scanner.nextInt();

            
            switch(secim){

                case 1:
                    System.out.print("Yatirmak istediginiz miktari giriniz : ");
                    int yatirma = scanner.nextInt();
                    bakiye += yatirma;
                    System.out.println("Isleminiz basarili bir sekilde gerceklesmistir.");
                    
                    break;

                case 2:
                    System.out.print("Cekmek istediginiz miktari giriniz. ");
                    int cekme = scanner.nextInt();
                    bakiye -= cekme;
                    System.out.println("Isleminiz basarili bir sekilde gerceklesmistir.");
                    break;

                case 3:
                    System.out.println("Guncel bakiyeniz : " + bakiye);
                    break;

                case 4:
                    System.out.println("Tekrardan gorusmek uzere ! ");
                    return;
                }
            }




        }else{
            hak--;
            System.out.println("Hatali bilgi girdiniz lutfen tekrar deneyiniz! (Kalan hak sayisi : " + hak + ")" );
            if(hak == 0){
                System.out.println("Hakkiniz kalmamistir. Hesabiniz bloke edildi.");
            }
        }
        
          scanner.close();
    }
    

















}
