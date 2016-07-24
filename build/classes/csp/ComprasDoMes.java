package csp;

import aima.core.search.csp.CSP;
import aima.core.search.csp.Domain;
import aima.core.search.csp.NotEqualConstraint;
import aima.core.search.csp.Variable;
import constraint.AmacianteEsquerda;
import constraint.BlusaAzul;
import constraint.NamoradoPickup;
import constraint.NamoradoPickup2;
import constraint.PagarComCheque;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maykon
 */
public class ComprasDoMes extends CSP{
    public static final Variable Caixa1Blusa = new Variable("Caixa1-blusa");
    public static final Variable Caixa1Nome = new Variable("Caixa1-nome");
    public static final Variable Caixa1Esqueceu = new Variable("Caixa1-esqueceu");
    public static final Variable Caixa1Pagamento = new Variable("Caixa1-pagamento");
    public static final Variable Caixa1FoiCom = new Variable("Caixa1-foi com");
    public static final Variable Caixa1Carro = new Variable("Caixa1-carro");
    
    public static final Variable Caixa2Blusa = new Variable("Caixa2-blusa");
    public static final Variable Caixa2Nome = new Variable("Caixa2-nome");
    public static final Variable Caixa2Esqueceu = new Variable("Caixa2-esqueceu");
    public static final Variable Caixa2Pagamento = new Variable("Caixa2-pagamento");
    public static final Variable Caixa2FoiCom = new Variable("Caixa2-foi com");
    public static final Variable Caixa2Carro = new Variable("Caixa2-carro");
    
    public static final Variable Caixa3Blusa = new Variable("Caixa3-blusa");
    public static final Variable Caixa3Nome = new Variable("Caixa3-nome");
    public static final Variable Caixa3Esqueceu = new Variable("Caixa3-esqueceu");
    public static final Variable Caixa3Pagamento = new Variable("Caixa3-pagamento");
    public static final Variable Caixa3FoiCom = new Variable("Caixa3-foi com");
    public static final Variable Caixa3Carro = new Variable("Caixa3-carro");
    
    public static final Variable Caixa4Blusa = new Variable("Caixa4-blusa");
    public static final Variable Caixa4Nome = new Variable("Caixa4-nome");
    public static final Variable Caixa4Esqueceu = new Variable("Caixa4-esqueceu");
    public static final Variable Caixa4Pagamento = new Variable("Caixa4-pagamento");
    public static final Variable Caixa4FoiCom = new Variable("Caixa4-foi com");
    public static final Variable Caixa4Carro = new Variable("Caixa4-carro");
    
    public static final Variable Caixa5Blusa = new Variable("Caixa5-blusa");
    public static final Variable Caixa5Nome = new Variable("Caixa5-nome");
    public static final Variable Caixa5Esqueceu = new Variable("Caixa5-esqueceu");
    public static final Variable Caixa5Pagamento = new Variable("Caixa5-pagamento");
    public static final Variable Caixa5FoiCom = new Variable("Caixa5-foi com");
    public static final Variable Caixa5Carro = new Variable("Caixa5-carro");
    
    private void collectVariables() {
        addVariable(Caixa1Blusa);
        addVariable(Caixa1Nome);
        addVariable(Caixa1Esqueceu);
        addVariable(Caixa1Pagamento);
        addVariable(Caixa1FoiCom);
        addVariable(Caixa1Carro);
        
        addVariable(Caixa2Blusa);
        addVariable(Caixa2Nome);
        addVariable(Caixa2Esqueceu);
        addVariable(Caixa2Pagamento);
        addVariable(Caixa2FoiCom);
        addVariable(Caixa2Carro);
        
        addVariable(Caixa3Blusa);
        addVariable(Caixa3Nome);
        addVariable(Caixa3Esqueceu);
        addVariable(Caixa3Pagamento);
        addVariable(Caixa3FoiCom);
        addVariable(Caixa3Carro);
        
        addVariable(Caixa4Blusa);
        addVariable(Caixa4Nome);
        addVariable(Caixa4Esqueceu);
        addVariable(Caixa4Pagamento);
        addVariable(Caixa4FoiCom);
        addVariable(Caixa4Carro);
        
        addVariable(Caixa5Blusa);
        addVariable(Caixa5Nome);
        addVariable(Caixa5Esqueceu);
        addVariable(Caixa5Pagamento);
        addVariable(Caixa5FoiCom);
        addVariable(Caixa5Carro);
        

    }
    
    private void setDomains(){
        List<String> blusaList = new ArrayList();
        blusaList.add("amarela");
        blusaList.add("azul");
        blusaList.add("branca");
        blusaList.add("verde");
        blusaList.add("vermelha");
        
        Domain blusaDomain = new Domain(blusaList);
        setDomain(Caixa1Blusa, blusaDomain);
        setDomain(Caixa2Blusa, blusaDomain);
        setDomain(Caixa3Blusa, blusaDomain);
        setDomain(Caixa4Blusa, blusaDomain);
        setDomain(Caixa5Blusa, blusaDomain);
        
        List<String> nomeList = new ArrayList();
        nomeList.add("Aline");
        nomeList.add("Carol");
        nomeList.add("Fernanda");
        nomeList.add("Juliana");
        nomeList.add("Natalia");
        
        Domain nomeDomain = new Domain(nomeList);
        setDomain(Caixa1Nome, nomeDomain);
        setDomain(Caixa2Nome, nomeDomain);
        setDomain(Caixa3Nome, nomeDomain);
        setDomain(Caixa4Nome, nomeDomain);
        setDomain(Caixa5Nome, nomeDomain);
        
        List<String> esqueceuList = new ArrayList();
        esqueceuList.add("Amaciante");
        esqueceuList.add("Frutas");
        esqueceuList.add("Leite");
        esqueceuList.add("Pão");
        esqueceuList.add("Presunto");

        Domain esqueceuDomain = new Domain(esqueceuList);
        setDomain(Caixa1Esqueceu, esqueceuDomain);
        setDomain(Caixa2Esqueceu, esqueceuDomain);
        setDomain(Caixa3Esqueceu, esqueceuDomain);
        setDomain(Caixa4Esqueceu, esqueceuDomain);
        setDomain(Caixa5Esqueceu, esqueceuDomain);
        
        List<String> pagamentoList = new ArrayList();
        pagamentoList.add("Cheque");
        pagamentoList.add("Crédito");
        pagamentoList.add("Débito");
        pagamentoList.add("Dinheiro");
        pagamentoList.add("Vale");

        Domain pagamentoDomain = new Domain(pagamentoList);
        setDomain(Caixa1Pagamento, pagamentoDomain);
        setDomain(Caixa2Pagamento, pagamentoDomain);
        setDomain(Caixa3Pagamento, pagamentoDomain);
        setDomain(Caixa4Pagamento, pagamentoDomain);
        setDomain(Caixa5Pagamento, pagamentoDomain);
        
        List<String> foiComList = new ArrayList();
        foiComList.add("Filho");
        foiComList.add("Irmã");
        foiComList.add("Mãe");
        foiComList.add("Marido");
        foiComList.add("Namorado");

        Domain acompanhanteDomain = new Domain(foiComList);
        setDomain(Caixa1FoiCom, acompanhanteDomain);
        setDomain(Caixa2FoiCom, acompanhanteDomain);
        setDomain(Caixa3FoiCom, acompanhanteDomain);
        setDomain(Caixa4FoiCom, acompanhanteDomain);
        setDomain(Caixa5FoiCom, acompanhanteDomain);
        
        List<String> carroList = new ArrayList();
        carroList.add("Crossover");
        carroList.add("Hatch");
        carroList.add("Pickup");
        carroList.add("Sedan");
        carroList.add("SUV");

        Domain carroDomain = new Domain(carroList);
        setDomain(Caixa1Carro, carroDomain);
        setDomain(Caixa2Carro, carroDomain);
        setDomain(Caixa3Carro, carroDomain);
        setDomain(Caixa4Carro, carroDomain);
        setDomain(Caixa5Carro, carroDomain);
        
    }
    
    private void setConstraints(){
//        addConstraint(new AmacianteEsquerda(Caixa1Esqueceu, Caixa2Carro));
//        addConstraint(new AmacianteEsquerda(Caixa2Esqueceu, Caixa3Carro));
//        addConstraint(new AmacianteEsquerda(Caixa3Esqueceu, Caixa4Carro));
//        addConstraint(new AmacianteEsquerda(Caixa4Esqueceu, Caixa5Carro));
//        addConstraint(new PagarComCheque(Caixa4Pagamento));
//        addConstraint(new BlusaAzul(Caixa4Blusa));
//        addConstraint(new NamoradoPickup(Caixa1FoiCom, Caixa1Carro));
//        addConstraint(new NamoradoPickup(Caixa2FoiCom, Caixa2Carro));
//        addConstraint(new NamoradoPickup(Caixa3FoiCom, Caixa3Carro));
//        addConstraint(new NamoradoPickup(Caixa4FoiCom, Caixa4Carro));
//        addConstraint(new NamoradoPickup(Caixa5FoiCom, Caixa5Carro));
        List<Variable> foiList = new ArrayList<>();
        foiList.add(Caixa1FoiCom);
        foiList.add(Caixa2FoiCom);
        foiList.add(Caixa3FoiCom);
        foiList.add(Caixa4FoiCom);
        foiList.add(Caixa5FoiCom);
        
        List<Variable> carroList = new ArrayList<>();
        carroList.add(Caixa1Carro);
        carroList.add(Caixa2Carro);
        carroList.add(Caixa3Carro);
        carroList.add(Caixa4Carro);
        carroList.add(Caixa5Carro);
        
        addConstraint(new NamoradoPickup2(foiList, carroList));
        
        setNotEquals();
        
        
    }
    
    private void setNotEquals(){
        addConstraint(new NotEqualConstraint(Caixa1Nome, Caixa2Nome));
        addConstraint(new NotEqualConstraint(Caixa1Nome, Caixa3Nome));
        addConstraint(new NotEqualConstraint(Caixa1Nome, Caixa4Nome));
        addConstraint(new NotEqualConstraint(Caixa1Nome, Caixa5Nome));
        
        addConstraint(new NotEqualConstraint(Caixa2Nome, Caixa3Nome));
        addConstraint(new NotEqualConstraint(Caixa2Nome, Caixa4Nome));
        addConstraint(new NotEqualConstraint(Caixa2Nome, Caixa5Nome));
        
        addConstraint(new NotEqualConstraint(Caixa3Nome, Caixa4Nome));
        addConstraint(new NotEqualConstraint(Caixa3Nome, Caixa5Nome));
        
        addConstraint(new NotEqualConstraint(Caixa4Nome, Caixa5Nome));
        
        addConstraint(new NotEqualConstraint(Caixa1Blusa, Caixa2Blusa));
        addConstraint(new NotEqualConstraint(Caixa1Blusa, Caixa3Blusa));
        addConstraint(new NotEqualConstraint(Caixa1Blusa, Caixa4Blusa));
        addConstraint(new NotEqualConstraint(Caixa1Blusa, Caixa5Blusa));
        
        addConstraint(new NotEqualConstraint(Caixa2Blusa, Caixa3Blusa));
        addConstraint(new NotEqualConstraint(Caixa2Blusa, Caixa3Blusa));
        addConstraint(new NotEqualConstraint(Caixa2Blusa, Caixa5Blusa));
        
        addConstraint(new NotEqualConstraint(Caixa3Blusa, Caixa4Blusa));
        addConstraint(new NotEqualConstraint(Caixa3Blusa, Caixa5Blusa));
        
        addConstraint(new NotEqualConstraint(Caixa4Blusa, Caixa5Blusa));
        
        addConstraint(new NotEqualConstraint(Caixa1Carro, Caixa2Carro));
        addConstraint(new NotEqualConstraint(Caixa1Carro, Caixa3Carro));
        addConstraint(new NotEqualConstraint(Caixa1Carro, Caixa4Carro));
        addConstraint(new NotEqualConstraint(Caixa1Carro, Caixa5Carro));
        
        addConstraint(new NotEqualConstraint(Caixa2Carro, Caixa3Carro));
        addConstraint(new NotEqualConstraint(Caixa2Carro, Caixa4Carro));
        addConstraint(new NotEqualConstraint(Caixa2Carro, Caixa5Carro));
        
        addConstraint(new NotEqualConstraint(Caixa3Carro, Caixa4Carro));
        addConstraint(new NotEqualConstraint(Caixa3Carro, Caixa5Carro));
        
        addConstraint(new NotEqualConstraint(Caixa4Carro, Caixa5Carro));
        
        addConstraint(new NotEqualConstraint(Caixa1Esqueceu, Caixa2Esqueceu));
        addConstraint(new NotEqualConstraint(Caixa1Esqueceu, Caixa3Esqueceu));
        addConstraint(new NotEqualConstraint(Caixa1Esqueceu, Caixa4Esqueceu));
        addConstraint(new NotEqualConstraint(Caixa1Esqueceu, Caixa5Esqueceu));
        
        addConstraint(new NotEqualConstraint(Caixa2Esqueceu, Caixa3Esqueceu));
        addConstraint(new NotEqualConstraint(Caixa2Esqueceu, Caixa4Esqueceu));
        addConstraint(new NotEqualConstraint(Caixa2Esqueceu, Caixa5Esqueceu));
        
        addConstraint(new NotEqualConstraint(Caixa3Esqueceu, Caixa4Esqueceu));
        addConstraint(new NotEqualConstraint(Caixa3Esqueceu, Caixa5Esqueceu));
        
        addConstraint(new NotEqualConstraint(Caixa4Esqueceu, Caixa5Esqueceu));
        
        addConstraint(new NotEqualConstraint(Caixa1FoiCom, Caixa2FoiCom));
        addConstraint(new NotEqualConstraint(Caixa1FoiCom, Caixa3FoiCom));
        addConstraint(new NotEqualConstraint(Caixa1FoiCom, Caixa4FoiCom));
        addConstraint(new NotEqualConstraint(Caixa1FoiCom, Caixa5FoiCom));
        
        addConstraint(new NotEqualConstraint(Caixa2FoiCom, Caixa3FoiCom));
        addConstraint(new NotEqualConstraint(Caixa2FoiCom, Caixa4FoiCom));
        addConstraint(new NotEqualConstraint(Caixa2FoiCom, Caixa5FoiCom));
        
        addConstraint(new NotEqualConstraint(Caixa3FoiCom, Caixa4FoiCom));
        addConstraint(new NotEqualConstraint(Caixa3FoiCom, Caixa4FoiCom));
        
        addConstraint(new NotEqualConstraint(Caixa4FoiCom, Caixa5FoiCom));
        
        addConstraint(new NotEqualConstraint(Caixa1Pagamento, Caixa2Pagamento));
        addConstraint(new NotEqualConstraint(Caixa1Pagamento, Caixa3Pagamento));
        addConstraint(new NotEqualConstraint(Caixa1Pagamento, Caixa4Pagamento));
        addConstraint(new NotEqualConstraint(Caixa1Pagamento, Caixa5Pagamento));
        
        addConstraint(new NotEqualConstraint(Caixa2Pagamento, Caixa3Pagamento));
        addConstraint(new NotEqualConstraint(Caixa2Pagamento, Caixa4Pagamento));
        addConstraint(new NotEqualConstraint(Caixa2Pagamento, Caixa5Pagamento));
        
        addConstraint(new NotEqualConstraint(Caixa3Pagamento, Caixa4Pagamento));
        addConstraint(new NotEqualConstraint(Caixa3Pagamento, Caixa5Pagamento));
        
        addConstraint(new NotEqualConstraint(Caixa4Pagamento, Caixa5Pagamento));
    }
    
    public ComprasDoMes(){
        collectVariables();
        setDomains();
        setConstraints();
    }
    
}
