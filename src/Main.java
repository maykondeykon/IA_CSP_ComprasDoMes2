
import aima.core.search.csp.Assignment;
import aima.core.search.csp.BacktrackingStrategy;
import aima.core.search.csp.ImprovedBacktrackingStrategy;
import aima.core.search.csp.MinConflictsStrategy;
import aima.core.search.csp.SolutionStrategy;
import csp.ComprasDoMes2;

/**
 *
 * @author maykon
 */
public class Main {

    public static void main(String[] args) {

        ComprasDoMes2 compras = new ComprasDoMes2();
//        BacktrackingStrategy s = new BacktrackingStrategy();
        ImprovedBacktrackingStrategy s = new ImprovedBacktrackingStrategy();
//        MinConflictsStrategy s = new MinConflictsStrategy(100);
        Assignment sol = s.solve(compras);
        System.out.println(sol);
    }

}
