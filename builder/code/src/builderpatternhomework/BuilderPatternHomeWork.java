package builderpatternhomework;

public class BuilderPatternHomeWork {
    public static void main(String[] args) {
        //ComputerBuilder highEndComputer = new HighEndComputerBuilder();
        
        ComputerDirector computerDirector = new ComputerDirector(new HighEndComputerBuilder());
        
        computerDirector.makeComputer();
        
        Computer computer = computerDirector.getComputer();
        
        System.out.println(computer);
        
        computerDirector.changeBuilder(new MiddleEndComputerBuilder());
        
        computerDirector.makeComputer();

        computer = computerDirector.getComputer();

        System.out.println(computer);
        
        computerDirector.changeBuilderAndRemake(new LowEndComputerBuilder());
        
        System.out.println(computerDirector.getComputer());
        
    }
}
