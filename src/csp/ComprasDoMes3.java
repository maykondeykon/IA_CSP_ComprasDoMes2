package csp;

import aima.core.search.csp.CSP;
import aima.core.search.csp.Domain;
import aima.core.search.csp.Variable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maykon
 */
public class ComprasDoMes3 extends CSP{
    public static final Variable caixa1 = new Variable("caixas");
    public static final Variable blusa = new Variable("blusa");
    public static final Variable nome = new Variable("nome");
    public static final Variable esqueceu = new Variable("esqueceu");
    public static final Variable pagamento = new Variable("pagamento");
    public static final Variable foiCom = new Variable("foiCom");
    public static final Variable carro = new Variable("carro");
    
    private void collectVariables() {
//        addVariable(blusa);
//        addVariable(nome);
//        addVariable(esqueceu);
//        addVariable(pagamento);
//        addVariable(foiCom);
//        addVariable(carro);
        addVariable(caixa1);

    }
    
    private void setDomains(){
        List<Caixa> caixaList = new ArrayList();
        caixaList.add(new Caixa(1));
//        caixaList.add(new Caixa(2));
//        caixaList.add(new Caixa(3));
//        caixaList.add(new Caixa(4));
//        caixaList.add(new Caixa(5));
        
        Domain caixaDomain = new Domain(caixaList);
        setDomain(caixa1, caixaDomain);
        
//        List<String> blusaList = new ArrayList();
//        blusaList.add("amarela");
//        blusaList.add("azul");
//        blusaList.add("branca");
//        blusaList.add("verde");
//        blusaList.add("vermelha");
//
//
//        Domain blusaDomain = new Domain(blusaList);
//        setDomain(blusa, blusaDomain);
//
//        List<String> nomeList = new ArrayList();
//        nomeList.add("Aline");
//        nomeList.add("Carol");
//        nomeList.add("Fernanda");
//        nomeList.add("Juliana");
//        nomeList.add("Natalia");
//
//        Domain nomeDomain = new Domain(nomeList);
//        setDomain(nome, nomeDomain);
//
//        List<String> esqueceuList = new ArrayList();
//        esqueceuList.add("Amaciante");
//        esqueceuList.add("Frutas");
//        esqueceuList.add("Leite");
//        esqueceuList.add("Pão");
//        esqueceuList.add("Presunto");
//
//        Domain esqueceuDomain = new Domain(esqueceuList);
//        setDomain(esqueceu, esqueceuDomain);
//
//        List<String> pagamentoList = new ArrayList();
//        pagamentoList.add("Cheque");
//        pagamentoList.add("Crédito");
//        pagamentoList.add("Débito");
//        pagamentoList.add("Dinheiro");
//        pagamentoList.add("Vale");
//
//        Domain pagamentoDomain = new Domain(pagamentoList);
//        setDomain(pagamento, pagamentoDomain);
//
//        List<String> foiComList = new ArrayList();
//        foiComList.add("Filho");
//        foiComList.add("Irmã");
//        foiComList.add("Mãe");
//        foiComList.add("Marido");
//        foiComList.add("Namorado");
//
//        Domain acompanhanteDomain = new Domain(foiComList);
//        setDomain(foiCom, acompanhanteDomain);
//
//        List<String> carroList = new ArrayList();
//        carroList.add("Crossover");
//        carroList.add("Hatch");
//        carroList.add("Pickup");
//        carroList.add("Sedan");
//        carroList.add("SUV");
//
//        Domain carroDomain = new Domain(carroList);
//        setDomain(carro, carroDomain);
    }
    
    public ComprasDoMes3(){
        collectVariables();
        setDomains();
    }
    
}
