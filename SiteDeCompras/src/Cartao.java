public class Cartao {
    private double limiteDocartao;
    private double valor;
    private double SaldoFinal;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLimiteDocartao() {
        return limiteDocartao;
    }

    public void setLimiteDocartao(double limiteDocartao) {
        this.limiteDocartao = limiteDocartao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldoFinal() {
        return SaldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        SaldoFinal = saldoFinal;
    }
}