import java.util.ArrayList;


public class App {

    public static void main(String[] args) throws Exception {

        Simulation simulation = new Simulation();

        ArrayList<Item> phase1 = simulation.loadItems("/Users/adrienlhemann/Desktop/java-rocket/src/phase-1.txt");
        ArrayList<Item> phase2 = simulation.loadItems("/Users/adrienlhemann/Desktop/java-rocket/src/phase-2.txt");
        ArrayList<Rocket> U1Phase1 = simulation.loadU1(phase1);
        ArrayList<Rocket> U1Phase2 = simulation.loadU1(phase2);
        ArrayList<Rocket> U2Phase1 = simulation.loadU2(phase1);
        ArrayList<Rocket> U2Phase2 = simulation.loadU2(phase2);
        int budgetU1Phase1 = simulation.runSimulation(U1Phase1);
        int budgetU1Phase2 = simulation.runSimulation(U1Phase2);
        int budgetU2Phase1 = simulation.runSimulation(U2Phase1);
        int budgetU2Phase2 = simulation.runSimulation(U2Phase2);

        System.out.println("Budget U1 for Phase1: " + budgetU1Phase1);
        System.out.println("Budget U1 for Phase2: " + budgetU1Phase2);
        System.out.println("Budget U2 for Phase1: " + budgetU2Phase1);
        System.out.println("Budget U2 for Phase2: " + budgetU2Phase2);

       
    


        
     }
    
}
