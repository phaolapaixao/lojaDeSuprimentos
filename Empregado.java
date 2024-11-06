public class Empregado {
    private String nome;
    private String sobrenome;
    private double salariomensal;
    private double aumento;

    public Empregado() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalariomensal() {
        return salariomensal;
    }

    public void setSalariomensal(double salariomensal) {
        this.salariomensal = salariomensal;
    }
    public double getSalarioAnual(){
        salariomensal = (salariomensal*12);
        return salariomensal;
    }
    public double getAumento(){
        aumento = getSalarioAnual() * 0.1;
        aumento = (aumento + getSalariomensal());
        return aumento;
    }
}
