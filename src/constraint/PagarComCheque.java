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
public class PagarComCheque implements Constraint {

    private final Variable var1;
    private final List<Variable> escopo;

    /**
     * No caixa da quarta posição está a mulher que vai pagar com Cheque.
     *
     * @param var1
     */
    public PagarComCheque(Variable var1) {
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
        String[] var1Partes = var1.toString().split("-");
        if ((v1 == null)) {
            return true;
        }

        if ("pagamento".equals(var1Partes[2])) {
            if (v1.compareToIgnoreCase("cheque") == 0) {
                return (parseInt(var1Partes[1])) == 4;
            }
        }
        return true;
    }
}
