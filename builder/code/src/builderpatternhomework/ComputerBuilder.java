package builderpatternhomework;

public interface ComputerBuilder {
    
    public void buildRam();
    public void buildHdd();
    public void buildSsd();
    public void buildCpuBrand();
    public void buildGpuBrand();
    public void buildScreenSize();
    
    public Computer getComputer();

}
