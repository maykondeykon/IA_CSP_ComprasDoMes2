package csp;

import aima.core.search.csp.CSP;
import aima.core.search.csp.Domain;
import aima.core.search.csp.Variable;
import constraint.AmacianteEsquerda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maykon
 */
public class ComprasDoMes2 extends CSP{
    public static final Variable blusa = new Variable("blusa");
    public static final Variable nome = new Variable("nome");
    public static final Variable esqueceu = new Variable("esqueceu");
    public static final Variable pagamento = new Variable("pagamento");
    public static final Variable foiCom = new Variable("foiCom");
    public static final Variable carro = new Variable("carro");
    public static final Variable caixa = new Variable("caixa");

    public Variable[] blusas = new Variable[5];
    public Variable[] nomes = new Variable[5];
    public Variable[] esquecidos = new Variable[5];
    public Variable[] pagamentos = new Variable[5];
    public Variable[] acompanhantes = new Variable[5];
    public Variable[] carros = new Variable[5];


    private void collectVariables() {
        addVariable(blusa);
        addVariable(nome);
        addVariable(esqueceu);
        addVariable(pagamento);
        addVariable(foiCom);
        addVariable(carro);
        addVariable(caixa);

    }

    private void setDomains(){
        List<String> blusaList = new ArrayList();
        blusaList.add("amarela");
        blusaList.add("azul");
        blusaList.add("branca");
        blusaList.add("verde");
        blusaList.add("vermelha");


        Domain blusaDomain = new Domain(blusaList);
        setDomain(blusa, blusaDomain);

        List<String> nomeList = new ArrayList();
        nomeList.add("Aline");
        nomeList.add("Carol");
        nomeList.add("Fernanda");
        nomeList.add("Juliana");
        nomeList.add("Natalia");

        Domain nomeDomain = new Domain(nomeList);
        setDomain(nome, nomeDomain);

        List<String> esqueceuList = new ArrayList();
        esqueceuList.add("Amaciante");
        esqueceuList.add("Frutas");
        esqueceuList.add("Leite");
        esqueceuList.add("Pão");
        esqueceuList.add("Presunto");

        Domain esqueceuDomain = new Domain(esqueceuList);
        setDomain(esqueceu, esqueceuDomain);

        List<String> pagamentoList = new ArrayList();
        pagamentoList.add("Cheque");
        pagamentoList.add("Crédito");
        pagamentoList.add("Débito");
        pagamentoList.add("Dinheiro");
        pagamentoList.add("Vale");

        Domain pagamentoDomain = new Domain(pagamentoList);
        setDomain(pagamento, pagamentoDomain);

        List<String> foiComList = new ArrayList();
        foiComList.add("Filho");
        foiComList.add("Irmã");
        foiComList.add("Mãe");
        foiComList.add("Marido");
        foiComList.add("Namorado");

        Domain acompanhanteDomain = new Domain(foiComList);
        setDomain(foiCom, acompanhanteDomain);

        List<String> carroList = new ArrayList();
        carroList.add("Crossover");
        carroList.add("Hatch");
        carroList.add("Pickup");
        carroList.add("Sedan");
        carroList.add("SUV");

        Domain carroDomain = new Domain(carroList);
        setDomain(carro, carroDomain);
        
        List<Integer> caixaList = new ArrayList();
        caixaList.add(1);
        caixaList.add(2);
        caixaList.add(3);
        caixaList.add(4);
        caixaList.add(5);
        

        Domain caixaDomain = new Domain(caixaList);
        setDomain(caixa, caixaDomain);
    }

    private void setConstraints(){
//        addConstraint(new AmacianteEsquerda(esqueceu,carro, caixa));

        //System.out.println(getDomain(carro)+"");
    }

    public ComprasDoMes2() {
        collectVariables();
        setDomains();
        setConstraints();
    }

}
