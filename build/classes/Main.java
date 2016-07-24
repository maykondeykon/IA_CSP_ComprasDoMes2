
import aima.core.search.csp.Assignment;
import aima.core.search.csp.BacktrackingStrategy;
import aima.core.search.csp.ImprovedBacktrackingStrategy;
import aima.core.search.csp.MinConflictsStrategy;
import aima.core.search.csp.SolutionStrategy;
import csp.ComprasDoMes;
import csp.ComprasDoMes2;
import csp.ComprasDoMes3;

/**
 *
 * @author maykon
 */
public class Main {
    public static void main(String[] args) {
        
//        ComprasDoMes2 compras = new ComprasDoMes2();
//        ComprasDoMes compras = new ComprasDoMes();
        ComprasDoMes3 compras = new ComprasDoMes3();
        
//        BacktrackingStrategy s = new BacktrackingStrategy();
        MinConflictsStrategy s = new MinConflictsStrategy(100);
        Assignment sol = s.solve(compras);
        System.out.println(sol);
    }
    
}
