package br.com.alura.screenmatch.calculo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;
public class CalculadoraDeTempo{
    private  int tempoTotal=0;
    public int getTempoTotal() {
        return tempoTotal;
    }
    /* Desing de classe
    public void inclui(Filme f) {
        this.tempoTotal += f.getDuracaoEmMinutos();
    }
     public void inclui(Serie S){
        this.tempoTotal+= S.getDuracaoEmMinutos();
    }*/
    public void inclui(Titulo titulo){
        System.out.println("Soma em minutos doso os titulos : "+titulo);
            this.tempoTotal+= titulo.getDuracaoEmMinutos();
    }
}
