package builderpatternhomework;

public class MiddleEndComputerBuilder implements ComputerBuilder{
    
    private Computer computer;
    
    public MiddleEndComputerBuilder(){
        this.computer = new Computer();
    }
    
    @Override
    public void buildRam() {
        computer.setRam(12);
    }

    @Override
    public void buildHdd() {
        computer.setHdd(1000);
    }

    @Override
    public void buildSsd() {
        computer.setSsd(256);
    }

    @Override
    public void buildCpuBrand() {
        computer.setCpuBrand("AMD");
    }

    @Override
    public void buildGpuBrand() {
        computer.setGpuBrand("Nvidia");
    }

    @Override
    public void buildScreenSize() {
        computer.setScreenSize(21);
    }

    @Override
    public Computer getComputer() {
        return this.computer;
    }

}
