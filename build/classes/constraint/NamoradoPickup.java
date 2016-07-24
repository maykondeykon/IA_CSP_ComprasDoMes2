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
public class NamoradoPickup implements Constraint{
    private final Variable var1;
    private final Variable var2;
    private final List<Variable> escopo;

    public NamoradoPickup(Variable var1, Variable var2) {
        this.var1 = var1;
        this.var2 = var2;
        
        escopo = new ArrayList<>();
        escopo.add(var1);
        escopo.add(var2);
    }
    

    @Override
    public List<Variable> getScope() {
        return this.escopo;
    }

    @Override
    public boolean isSatisfiedWith(Assignment a) {
        String v1 = (String) a.getAssignment(var1);
        String v2 = (String) a.getAssignment(var2);
        
        if ((v1 == null)) {
            return true;
        }
        if ((v2 == null)) {
            return true;
        }
        
        if ((v1.compareToIgnoreCase("namorado") == 0) && (v2.compareToIgnoreCase("pickup") == 0)) {
            return true;
        }else{
            return false;
        }
    }
    
}
