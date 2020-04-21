package builderpatternhomework;

public class LowEndComputerBuilder implements ComputerBuilder{
    
    private Computer computer;
    
    public LowEndComputerBuilder(){
        this.computer = new Computer();
    }
    
    @Override
    public void buildRam() {
        computer.setRam(8);
    }

    @Override
    public void buildHdd() {
        computer.setHdd(512);
    }

    @Override
    public void buildSsd() {
        computer.setSsd(128);
    }

    @Override
    public void buildCpuBrand() {
        computer.setCpuBrand("AMD");
    }

    @Override
    public void buildGpuBrand() {
        computer.setGpuBrand("AMD");
    }

    @Override
    public void buildScreenSize() {
        computer.setScreenSize(15);
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }

}
