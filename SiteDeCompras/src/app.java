import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Cartao  cartao = new Cartao();
        Scanner dado = new Scanner(System.in);
        int opcoes=0;
        while (opcoes!=2){
            if (opcoes ==0){
                System.out.println(" Digite o limite do cartão:");
                cartao.setLimiteDocartao(dado.nextDouble());
                System.out.println("Digite a Descrição da compra:");
                cartao.setNome(dado.next());
                System.out.println("Digite o valor da compra:");
                cartao.setValor(dado.nextDouble());
                if (cartao.getLimiteDocartao()>=cartao.getValor()){
                    System.out.println("Compra Realizada com seucesso!!");
                }
                else {
                    System.out.println("Saldo insuficiente!");
                    System.out.println("Saldo Do cartão: "+ cartao.getLimiteDocartao());
                }

            }
        }
    }
