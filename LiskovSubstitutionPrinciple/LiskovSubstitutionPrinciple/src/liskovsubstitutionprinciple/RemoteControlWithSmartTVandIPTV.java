package liskovsubstitutionprinciple;

public class RemoteControlWithSmartTVandIPTV implements IRemoteControl, ISmartTV, IIPTV{

    @Override
    public void nextChannel() {
        System.out.println("Bir sonraki kanala geçildi!");
    }

    @Override
    public void previousChannel() {
        System.out.println("Bir önceki kanala geçildi!");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Ses arttırıldı!");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Ses azaltıldı!");
    }

    @Override
    public void openWebBrowser() {
        System.out.println("Web tarayıcısı açıldı!");
    }

    @Override
    public void openYoutube() {
        System.out.println("Youtube uygulaması açıldı!");
    }

    @Override
    public void openNetflix() {
        System.out.println("Netflix uygulaması açıldı!");
    }

    @Override
    public void openSpotify() {
        System.out.println("Spotify uygulaması açıldı!");
    }

    @Override
    public void openIPTV() {
        System.out.println("IPTV açıldı!");
    }
    
}
