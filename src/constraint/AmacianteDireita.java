package constraint;

import aima.core.search.csp.Assignment;
import aima.core.search.csp.Constraint;
import aima.core.search.csp.Variable;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maykon
 */
public class AmacianteDireita implements Constraint {

    private final Variable var1;
    private final Variable var2;
    private final List<Variable> escopo;

    /**
     * Carol está exatamente à direita da mulher que esqueceu o Amaciante.
     *
     * @param v1
     * @param v2
     */
    public AmacianteDireita(Variable v1, Variable v2) {
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
        String[] var1Partes = var1.toString().split("-");
        String v2 = (String) a.getAssignment(var2);
        String[] var2Partes = var2.toString().split("-");

        if ((v1 == null)) {
            return true;
        }
        if ((v2 == null)) {
            return true;
        }

        if ("nome".equals(var1Partes[2])) {
            if (v1.compareToIgnoreCase("carol") == 0) {
                if ((parseInt(var1Partes[1]) - 1) == parseInt(var2Partes[1])) {
                    if ("equeceu".equals(var2Partes[2])) {
                        return v2.compareToIgnoreCase("amaciante") == 0;
                    }

                }

            }
        }
        return true;

    }

}
