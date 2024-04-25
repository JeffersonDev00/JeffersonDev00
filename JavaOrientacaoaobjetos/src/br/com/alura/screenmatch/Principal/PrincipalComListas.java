package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
import com.sun.source.tree.NewArrayTree;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar", 2020);
        outroFilme.avalia(50);
        var FilmesPaulo = new Filme("Dogville", 1970);
        FilmesPaulo.avalia(20);
        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(FilmesPaulo);
        lista.add(lost);
       // lista.forEach(nome -> System.out.println(nome)); Lista os itemda lista otilizado o codigo array list foi adicionador no java 8.
        for (Titulo item :lista){
            System.out.println(item.getNome());
            if (item instanceof  Filme filme && filme.getClassificacao() >2){
            //Filme filme = (Filme) item;
            System.out.println("Classifição"+filme.getClassificacao());
        }
        }
        List<String>buscaPorArtista =new LinkedList<>();
        buscaPorArtista.add("Adam Sanlder");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("Ordenação");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de Titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLacamento));
        System.out.println("Ordenado por ano de lancamento");
        System.out.println(lista);
    }
}
