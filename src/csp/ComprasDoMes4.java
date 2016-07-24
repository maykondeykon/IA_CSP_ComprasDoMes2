package csp;

import aima.core.search.csp.CSP;
import aima.core.search.csp.Domain;
import aima.core.search.csp.NotEqualConstraint;
import aima.core.search.csp.Variable;
import constraint.AmacianteEsquerda;
import constraint.BlusaAzul;
import constraint.ComMae;
import constraint.NamoradoPickup;
import constraint.PagarComCheque;
import constraint.PaoMae;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author maykon
 */
public final class ComprasDoMes4 extends CSP {

    public ComprasDoMes4() {
        setVariaveisEDominios();
        setNotEquals();
        setConstraints();
//        Variable v = this.getVariables().get(0);
//        String[] partes = v.toString().split("-");
//        System.out.println(partes[2]);
    }

    public static void teste() {
    }

    public void setVariaveisEDominios() {
        List<String> blusaList = new ArrayList();
        blusaList.add("amarela");
        blusaList.add("azul");
        blusaList.add("branca");
        blusaList.add("verde");
        blusaList.add("vermelha");

        List<String> nomeList = new ArrayList();
        nomeList.add("Aline");
        nomeList.add("Carol");
        nomeList.add("Fernanda");
        nomeList.add("Juliana");
        nomeList.add("Natalia");

        List<String> esqueceuList = new ArrayList();
        esqueceuList.add("Amaciante");
        esqueceuList.add("Frutas");
        esqueceuList.add("Leite");
        esqueceuList.add("Pão");
        esqueceuList.add("Presunto");

        List<String> pagamentoList = new ArrayList();
        pagamentoList.add("Cheque");
        pagamentoList.add("Crédito");
        pagamentoList.add("Débito");
        pagamentoList.add("Dinheiro");
        pagamentoList.add("Vale");

        List<String> foiComList = new ArrayList();
        foiComList.add("Filho");
        foiComList.add("Irmã");
        foiComList.add("Mãe");
        foiComList.add("Marido");
        foiComList.add("Namorado");

        List<String> carroList = new ArrayList();
        carroList.add("Crossover");
        carroList.add("Hatch");
        carroList.add("Pickup");
        carroList.add("Sedan");
        carroList.add("SUV");

        List<String> itemList = new ArrayList();
        itemList.add("blusa");
        itemList.add("nome");
        itemList.add("esqueceu");
        itemList.add("pagamento");
        itemList.add("foi_com");
        itemList.add("carro");

        HashMap<String, List> varLinha = new HashMap<>();
        varLinha.put(itemList.get(0), blusaList);
        varLinha.put(itemList.get(1), nomeList);
        varLinha.put(itemList.get(2), esqueceuList);
        varLinha.put(itemList.get(3), pagamentoList);
        varLinha.put(itemList.get(4), foiComList);
        varLinha.put(itemList.get(5), carroList);

        String v = "Caixa-";
        int nCaixas = 5;

        for (int i = 0; i < varLinha.size(); i++) {
            for (int j = 0; j < nCaixas; j++) {
                String caixa = v + (j + 1);
                String item = itemList.get(i);
                List dominio = varLinha.get(itemList.get(i));

                Variable variable = new Variable(caixa + "-" + item);
                addVariable(variable);

                Domain domain = new Domain(dominio);
                setDomain(variable, domain);
//                System.out.println(caixa + item + dominio);
            }

        }

    }

    private void setConstraints() {
        for (int i = 0; i < this.getVariables().size(); i++) {
            Variable var1 = this.getVariables().get(i);

            addConstraint(new BlusaAzul(var1));
            addConstraint(new PagarComCheque(var1));

            for (int j = this.getVariables().size() - 1; j > i; j--) {
                Variable var2 = this.getVariables().get(j);

                addConstraint(new AmacianteEsquerda(var1, var2));
                addConstraint(new NamoradoPickup(var1, var2));
                addConstraint(new PaoMae(var1, var2));
                addConstraint(new ComMae(var1, var2));

            }
        }
    }

    private void setNotEquals() {
        for (int i = 0; i < this.getVariables().size(); i++) {
            Variable var1 = this.getVariables().get(i);
            for (int j = this.getVariables().size() - 1; j > i; j--) {
                Variable var2 = this.getVariables().get(j);
                addConstraint(new NotEqualConstraint(var1, var2));
//                System.out.println("i = "+i+"; j = "+j+" -> "+var1 + " <> " + var2);

            }
        }
    }
}