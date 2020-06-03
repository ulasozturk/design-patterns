package liskovsubstitutionprinciple;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LiskovSubstitutionPrinciple {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String model;
        int year;
        while (true) {
            System.out.print("TV modelini giriniz (Çıkmak için 0 giriniz): ");
            model = reader.readLine();
            
            if(model.length() == 1 && Integer.parseInt(model) == 0){
                break;
            }

            System.out.print("Model yılını giriniz: ");
            try {
                year = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid Format!");
                continue;
            }

            if (year > 2017) {
                RemoteControlWithSmartTVandIPTV rc = new RemoteControlWithSmartTVandIPTV();
                
                System.out.println("Seçenekler: ");
                System.out.println("1) Bir sonraki kanala geç\n"
                        + "2) Bir önceki kanala geç\n"
                        + "3) Sesi arttır\n"
                        + "4) Sesi düşür\n"
                        + "5) Web tarayıcısını aç\n"
                        + "6) Youtube uygulamasını aç\n"
                        + "7) Netflix uygulamasını aç\n"
                        + "8) Spotify uygulamasını aç\n"
                        + "9) IPTV'yi aç\n"
                        + "0) Geri");
                OUTER:
                while (true) {
                    System.out.print("Seçiminiz (Çıkmak için 0 giriniz): ");
                    int input = 0;
                    try{
                        input = Integer.parseInt(reader.readLine());
                    } catch(NumberFormatException nfe){
                        System.err.println("Lütfen tamsayı giriniz!");
                        continue;
                    }
                    switch (input) {
                        case 1: rc.nextChannel(); break;
                        case 2: rc.previousChannel(); break;
                        case 3: rc.increaseVolume(); break;
                        case 4: rc.decreaseVolume(); break;
                        case 5: rc.openWebBrowser(); break;
                        case 6: rc.openYoutube(); break;
                        case 7: rc.openNetflix(); break;
                        case 8: rc.openSpotify(); break;
                        case 9: rc.openIPTV(); break;
                        case 0: break OUTER;
                        default: System.out.println("Lütfen seçeneklerden birini seçiniz!");
                    }
                }
            }
            else if(year > 2012){
                RemoteControlWithSmartTV rc = new RemoteControlWithSmartTV();
                
                System.out.println("Seçenekler: ");
                System.out.println("1) Bir sonraki kanala geç\n"
                        + "2) Bir önceki kanala geç\n"
                        + "3) Sesi arttır\n"
                        + "4) Sesi düşür\n"
                        + "5) Web tarayıcısını aç\n"
                        + "6) Youtube uygulamasını aç\n"
                        + "7) Netflix uygulamasını aç\n"
                        + "8) Spotify uygulamasını aç\n"
                        + "0) Geri");
                OUTER:
                while (true) {
                    System.out.print("Seçiminiz (Çıkmak için 0 giriniz): ");
                    int input = 0;
                    try{
                        input = Integer.parseInt(reader.readLine());
                    } catch(NumberFormatException nfe){
                        System.err.println("Lütfen tamsayı giriniz!");
                        continue;
                    }
                    switch (input) {
                        case 1: rc.nextChannel(); break;
                        case 2: rc.previousChannel(); break;
                        case 3: rc.increaseVolume(); break;
                        case 4: rc.decreaseVolume(); break;
                        case 5: rc.openWebBrowser(); break;
                        case 6: rc.openYoutube(); break;
                        case 7: rc.openNetflix(); break;
                        case 8: rc.openSpotify(); break;
                        case 0: break OUTER;
                        default: System.out.println("Lütfen seçeneklerden birini seçiniz!");
                    }
                }
            }
            else{
                RemoteControl rc = new RemoteControl();
                System.out.println("Seçenekler: ");
                System.out.println("1) Bir sonraki kanala geç\n"
                        + "2) Bir önceki kanala geç\n"
                        + "3) Sesi arttır\n"
                        + "4) Sesi düşür\n"
                        + "0) Geri");
                OUTER:
                while (true) {
                    System.out.print("Seçiminiz (Çıkmak için 0 giriniz): ");
                    int input = 0;
                    try{
                        input = Integer.parseInt(reader.readLine());
                    } catch(NumberFormatException nfe){
                        System.err.println("Lütfen tamsayı giriniz!");
                        continue;
                    }
                    switch (input) {
                        case 1: rc.nextChannel(); break;
                        case 2: rc.previousChannel(); break;
                        case 3: rc.increaseVolume(); break;
                        case 4: rc.decreaseVolume(); break;
                        case 0: break OUTER;
                        default: System.out.println("Lütfen seçeneklerden birini seçiniz!");
                    }
                }
            }
        }
        System.out.println("Kumanda uygulamasını kullandığınız için teşekkür ederiz.");
    }
}
