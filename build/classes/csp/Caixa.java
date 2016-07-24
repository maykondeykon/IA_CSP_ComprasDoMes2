package csp;

/**
 *
 * @author maykon
 */
public class Caixa {
    private String blusa;
    private String nome;
    private String esqueceu;
    private String pagamento;
    private String foiCom;
    private String carro;
    private Integer posicao;

    Caixa(int posicao) {
        this.posicao = posicao;
    }

    public String getBlusa() {
        return blusa;
    }

    public void setBlusa(String blusa) {
        this.blusa = blusa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEsqueceu() {
        return esqueceu;
    }

    public void setEsqueceu(String esqueceu) {
        this.esqueceu = esqueceu;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public String getFoiCom() {
        return foiCom;
    }

    public void setFoiCom(String foiCom) {
        this.foiCom = foiCom;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    @Override
    public String toString() {
        return "Caixa "+posicao+" {" + "blusa=" + blusa + ", nome=" + nome + ", esqueceu=" + esqueceu + ", pagamento=" + pagamento + ", foiCom=" + foiCom + ", carro=" + carro +'}';
    }
    
    
}
