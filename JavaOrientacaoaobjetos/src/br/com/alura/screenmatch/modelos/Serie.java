package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private  boolean ativa;
    private int  episodiosPorTemporada;
    private int minutosPorEpisódios;

    public Serie(String nome, int anoDeLancamento){
        super(nome,anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisódios() {
        return minutosPorEpisódios;
    }

    public void setMinutosPorEpisódios(int minutosPorEpisódios) {
        this.minutosPorEpisódios = minutosPorEpisódios;
    }



    @Override  //@Overrride Possibilita a sobrescrita de um métedo
    public int getDuracaoEmMinutos() {
        return temporadas*episodiosPorTemporada*minutosPorEpisódios;
    }

    @Override
    public String toString() {
        return "Serie : "+ this.getNome()+"("+ this.getAnoDeLacamento()+")";
    }
}
