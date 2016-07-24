
import aima.core.search.csp.Assignment;
import aima.core.search.csp.BacktrackingStrategy;
import aima.core.search.csp.CSP;
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
        
        BacktrackingStrategy s1 = new BacktrackingStrategy();
        ImprovedBacktrackingStrategy s2 = new ImprovedBacktrackingStrategy();
        MinConflictsStrategy s3 = new MinConflictsStrategy(100);

        executaCSP(s2, compras);
    }

    static void executaCSP(SolutionStrategy strategy, CSP problema) {
        Assignment sol = strategy.solve(problema);
        System.out.println(sol);
    }

}
