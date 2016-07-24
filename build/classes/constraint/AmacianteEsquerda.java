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
public class AmacianteEsquerda implements Constraint{
    private final Variable var1;
    private final Variable var2;
    private final List<Variable> escopo;

    public AmacianteEsquerda(Variable v1, Variable v2) {
        this.var1 = v1;
        this.var2 = v2;
        
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

//        if (v1.compareToIgnoreCase("amaciante") == 0) {
//            if ((a.hasAssignmentFor(var2)) && (v2.compareToIgnoreCase("sedan") == 0)) {
//            System.out.println("amaciante e sedan ");   
//                return true;
//            }else{
//                return false;
//            }
//        }
//System.out.println(a+"<--");
        
        if (v2.compareToIgnoreCase("sedan") == 0) {
            return true;
        }else{
            return false;
        }
        
        
        //System.out.println(a.getVariables()+"<--");
        
//        return true;
    }
    
}
