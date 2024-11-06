public class Fatura {
    private String numero;
    private String descricao;
    private int quantidadeItem;
    private double precoItem;
    private double precoTotal;

    public Fatura() {

    }

    public double getTotalFatura() {
        precoTotal = precoItem * quantidadeItem;
        return precoTotal;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setIntem(double precoItem) {
        this.precoItem = precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
}



