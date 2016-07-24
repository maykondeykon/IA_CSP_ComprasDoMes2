package csp;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Constraint;
import aima.core.search.csp.Variable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maykon
 */
public class EsquerdaConstraint implements Constraint{
    private final Variable var1;
    private final Variable var2;
    private final Variable var3;
    private final List<Variable> escopo;

    public EsquerdaConstraint(Variable v1, Variable v2, Variable v3) {
        this.var1 = v1;
        this.var2 = v2;
        this.var3 = v3;
        
        escopo = new ArrayList<>();
        escopo.add(var1);
        escopo.add(var2);
        escopo.add(var3);
    }
    

    @Override
    public List<Variable> getScope() {
        return this.escopo;
    }

    @Override
    public boolean isSatisfiedWith(Assignment a) {
        String v1 = (String) a.getAssignment(var1);
        String v2 = (String) a.getAssignment(var2);
        Integer v3 = (Integer) a.getAssignment(var3);
        
        System.out.println(v1+"");
        
        return false;
    }
    
}
