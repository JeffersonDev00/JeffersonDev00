package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

public class Filme  extends Titulo implements Classificavel {
    private  String diretor ;

    public Filme(String nome, int anodeLacamento) {
        super(nome,anodeLacamento);
    }

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)pegaMedia()/2;
    }

    @Override
    public String toString() {
        return  "Filmes :("+this.getNome()+")"+"("+this.getAnoDeLacamento()+")";
    }
}
//Setters incluir um valor
//Getters Buscar um valor