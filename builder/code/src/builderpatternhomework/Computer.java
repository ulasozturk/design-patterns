package builderpatternhomework;

public class Computer implements ComputerPlan{
    private int ram;
    private int hdd;
    private int ssd;
    private String cpuBrand;
    private String gpuBrand;
    private double screenSize;

    
    public int getRam() {
        return ram;
    }

    @Override
    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    @Override
    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getSsd() {
        return ssd;
    }

    @Override
    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getCpuBrand() {
        return cpuBrand;
    }

    @Override
    public void setCpuBrand(String cpuBrand) {
        this.cpuBrand = cpuBrand;
    }

    public String getGpuBrand() {
        return gpuBrand;
    }

    @Override
    public void setGpuBrand(String gpuBrand) {
        this.gpuBrand = gpuBrand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Computer{" + "ram=" + ram + ", hdd=" + hdd + ", ssd=" + ssd + ", cpuBrand=" + cpuBrand + ", gpuBrand=" + gpuBrand + ", screenSize=" + screenSize + '}';
    }
    
    
}
