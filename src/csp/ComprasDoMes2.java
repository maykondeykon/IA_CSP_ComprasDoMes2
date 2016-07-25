package csp;

import aima.core.search.csp.CSP;
import aima.core.search.csp.Domain;
import aima.core.search.csp.NotEqualConstraint;
import aima.core.search.csp.Variable;
import constraint.AmacianteDireita;
import constraint.AmacianteEsquerda;
import constraint.AoLadoFilho;
import constraint.AoLadoFrutas;
import constraint.AoLadoPresunto;
import constraint.AoLadoSedan;
import constraint.BlusaAzul;
import constraint.ComDinheiro;
import constraint.ComFilho;
import constraint.ComMae;
import constraint.ComMarido;
import constraint.CrossoverDireita;
import constraint.DebitoEsquerdaVale;
import constraint.NamoradoPickup;
import constraint.PagarComCheque;
import constraint.PaoMae;
import constraint.PaoSUV;
import constraint.PresuntoDebito;
import constraint.SedanEsquerdaSUV;
import constraint.VerdeEsquerdaVermelha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author maykon
 */
public final class ComprasDoMes2 extends CSP {

    public ComprasDoMes2() {
        setVariaveisEDominios();
        setNotEquals();
        setConstraints();
    }

    public void setVariaveisEDominios() {
        System.out.println("Setando variáveis e domínios...");
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
            }

        }

    }

    private void setConstraints() {
        System.out.println("Adicionando constraints...");
        for (int i = 0; i < this.getVariables().size(); i++) {
            Variable var1 = this.getVariables().get(i);

            addConstraint(new ComMarido(var1));
            addConstraint(new PagarComCheque(var1));
            addConstraint(new ComDinheiro(var1));
            addConstraint(new BlusaAzul(var1));

            for (int j = this.getVariables().size() - 1; j > i; j--) {
                Variable var2 = this.getVariables().get(j);

                addConstraint(new AmacianteEsquerda(var1, var2));
                addConstraint(new CrossoverDireita(var1, var2));//TODO melhorar
                addConstraint(new NamoradoPickup(var1, var2));
                addConstraint(new SedanEsquerdaSUV(var1, var2));
                addConstraint(new PaoMae(var1, var2));
                addConstraint(new AoLadoFilho(var1, var2));
                addConstraint(new DebitoEsquerdaVale(var1, var2));//TODO melhorar
                addConstraint(new ComMae(var1, var2));
                addConstraint(new PresuntoDebito(var1, var2));
                addConstraint(new AoLadoFrutas(var1, var2));
                addConstraint(new PaoSUV(var1, var2));
                addConstraint(new ComFilho(var1, var2));
                addConstraint(new AmacianteDireita(var1, var2));//TODO melhorar
                addConstraint(new VerdeEsquerdaVermelha(var1, var2));
                addConstraint(new AoLadoPresunto(var1, var2));
                addConstraint(new AoLadoSedan(var1, var2));
            }
        }
    }

    private void setNotEquals() {
        System.out.println("Adicionando constraint todas diferêntes...");
        for (int i = 0; i < this.getVariables().size(); i++) {
            Variable var1 = this.getVariables().get(i);
            for (int j = this.getVariables().size() - 1; j > i; j--) {
                Variable var2 = this.getVariables().get(j);
                addConstraint(new NotEqualConstraint(var1, var2));
            }
        }
    }
}
