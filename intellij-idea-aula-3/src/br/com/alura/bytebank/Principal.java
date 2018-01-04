package br.com.alura.bytebank;

import br.com.alura.bytebank.io.LeitorCSV;
import br.com.alura.bytebank.model.Pagamento;
import br.com.alura.bytebank.visualizador.OpcoesPagamento;

import java.io.IOException;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {

//        new OpcoesPagamento().mensagemDeBoasVindas();

        LeitorCSV leitorCSV = new LeitorCSV();
//
//        List<Pagamento> pagamentos = leitorCSV.ler(3);
//
//        for (Pagamento pagamento : pagamentos) {
//            System.out.println(pagamento);
//        }

        leitorCSV.ler(1).stream()
                .map(Principal::applyAcrescimo)
                .forEach(System.out::println);
    }


    private static Pagamento applyAcrescimo(Pagamento p) {
        if (p.getValor() > 100) {
            double valorBruto = p.getValor();
            double valorComAcrescimo = valorBruto * 1.1;
            p.setValor(valorComAcrescimo);
        }
        return p;
    }
}
