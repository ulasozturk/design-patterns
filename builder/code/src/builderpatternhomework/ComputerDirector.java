package builderpatternhomework;

public class ComputerDirector {
    
    private ComputerBuilder computerBuilder;
    
    public ComputerDirector(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }
    
    public void makeComputer(){
        this.computerBuilder.buildRam();        
        this.computerBuilder.buildHdd();
        this.computerBuilder.buildSsd();
        this.computerBuilder.buildCpuBrand();
        this.computerBuilder.buildGpuBrand();
        this.computerBuilder.buildScreenSize();
    }
    
    public Computer getComputer(){
        return this.computerBuilder.getComputer();
    }
    
    public void changeBuilder(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }
    
    public void changeBuilderAndRemake(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
        makeComputer();
    }
}
