package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.setDuracaoEmMinutos(180);

        //Instanciação de objetos
        System.out.println(meuFilme.getNome());
        meuFilme.exiberFicharTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliações: "+meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost",2000);
        lost.exiberFicharTecnica();
        lost.setMinutosPorEpisódios(10);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisódios(50);
        System.out.println("Duração para maratonar Lost :"+lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2020);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());


        FiltroRecomendacao fitro = new FiltroRecomendacao();
        fitro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalDeVisualizacoes(300);
        fitro.filtra(episodio);

        var FilmesPaulo = new Filme("Dogville", 1970);
        FilmesPaulo.setDuracaoEmMinutos(200);
        FilmesPaulo.setAnoDeLacamento(2023);
        FilmesPaulo.avalia(10);

        //arry list
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(FilmesPaulo);

        System.out.println("Nome do Primeiro filmes :"+listaDeFilmes.get(0).getNome());
        System.out.println("Lista de filmes : "+ listaDeFilmes.size());
        System.out.println(listaDeFilmes);

    }
}
