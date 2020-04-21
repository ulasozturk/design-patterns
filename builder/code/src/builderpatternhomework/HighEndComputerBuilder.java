package builderpatternhomework;

public class HighEndComputerBuilder implements ComputerBuilder{

    private Computer computer;
    
    public HighEndComputerBuilder(){
        this.computer = new Computer();
    }
    
    @Override
    public void buildRam() {
        computer.setRam(16);
    }

    @Override
    public void buildHdd() {
        computer.setHdd(2000);
    }

    @Override
    public void buildSsd() {
        computer.setSsd(512);
    }

    @Override
    public void buildCpuBrand() {
        computer.setCpuBrand("Intel");
    }

    @Override
    public void buildGpuBrand() {
        computer.setGpuBrand("Nvidia");
    }

    @Override
    public void buildScreenSize() {
        computer.setScreenSize(27);
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }
    
}
