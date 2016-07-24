package constraint;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Constraint;
import aima.core.search.csp.Variable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maykon
 */
public class BlusaAzul implements Constraint{
    private final Variable var1;
    private final List<Variable> escopo;

    public BlusaAzul(Variable var1) {
        this.var1 = var1;
        
        escopo = new ArrayList<>();
        escopo.add(var1);
    }
    
    

    @Override
    public List<Variable> getScope() {
        return this.escopo;
    }

    @Override
    public boolean isSatisfiedWith(Assignment a) {
        String v1 = (String) a.getAssignment(var1);
        if ((v1 == null)) {
            return true;
        }
        
        if (v1.compareToIgnoreCase("azul") == 0) {
            return true;
        }else{
            return false;
        }
    }
    
}
