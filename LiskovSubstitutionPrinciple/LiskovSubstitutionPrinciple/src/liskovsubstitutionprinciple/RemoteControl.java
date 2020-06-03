package liskovsubstitutionprinciple;

public class RemoteControl implements IRemoteControl {

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

}
