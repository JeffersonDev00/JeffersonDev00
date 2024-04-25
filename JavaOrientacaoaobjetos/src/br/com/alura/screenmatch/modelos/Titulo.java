package br.com.alura.screenmatch.modelos;

public class Titulo  implements Comparable<Titulo>{
    //Declaracão das Variavel
    private String nome;
    private int anoDeLacamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;   /*Modificadores de acesso / Modificadores de Visibilidade private */
    private int totalDeAvaliacoes;      /*Modificadores de acesso / Modificadores de Visibilidade private */
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLacamento) {
        this.nome = nome;
        this.anoDeLacamento = anoDeLacamento;
    }

    //Metodo acessor get(obter valor) set(atribuir valor)
    public String getNome() {
        return nome;
    }

    public int getAnoDeLacamento() {
        return anoDeLacamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnoDeLacamento(int anoDeLacamento) {
        this.anoDeLacamento=anoDeLacamento;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    //Metodo para se chamado na Classe principal.
    public void exiberFicharTecnica() { //Void  + nome Variavel sera chamado outra class. a seguir o quer sera exibir quando a variavek for chamada.
        System.out.println("Nome do filme :" + nome);
        System.out.println("Ano de lancamento : " + anoDeLacamento);
    }

    public void avalia(double nota) {  //Void  + nome Variavel sera chamado outra class. a seguir o quer sera exibir quando a variavek for chamada.
        somaDasAvaliacoes += nota; // a variavel Soma  Das Avaliacoes =  a variavel Soma  Das Avaliacoes + nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
