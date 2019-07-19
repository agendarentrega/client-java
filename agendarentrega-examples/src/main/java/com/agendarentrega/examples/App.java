package com.agendarentrega.examples;

import com.agendarentrega.clients.Client;
import com.agendarentrega.clients.pedido.invoker.ApiException;
import com.agendarentrega.clients.pedido.service.PedidoServiceApi;
import com.agendarentrega.clients.pedido.models.*;

/**
 * Exemplos: Importação de pedido
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String apiKey = "[api key]";
        Client client = new Client(apiKey);
        PedidoServiceApi pedido = client.pedido().pedido();

        try {
            PedidoImportarPedidoRequest request = new PedidoImportarPedidoRequest()
                .codigo("PEDIDO-1")
                .comprador(new ImportarPedidoRequestComprador()
                    .email("comprador@teste.com")
                    .nome("Nome")
                    .sobrenome("Sobrenome"))
                .fornecedor(new ImportarPedidoRequestEmpresa()
                    .cnpj("00000000000100"))
                .emitente(new ImportarPedidoRequestEmpresa()
                    .cnpj("11111111000100"))
                .destinatario(new ImportarPedidoRequestEmpresa()
                    .cnpj("11111111000200"))
                .entrega(new PedidoEntrega()
                    .data("2019-06-01")
                    .horaInicio("08:00"))
                .dataEmissao("2019-06-05 08:08")
                .observacoes("Observações gerais existentes no pedido")
                .status(PedidoStatusPedido.PEDIDO_EM_ABERTO);

            PedidoImportarPedidoResponse response = pedido.importarPedido(request);
            System.out.printf("Pedido inserido: %s", response.getPedido().getUuid());

            pedido.alterarStatusPedido(
                "11111111000100", "PEDIDO-1",
                new PedidoAlterarStatusPedidoRequest().status(PedidoStatusPedido.PEDIDO_CONCLUIDO));
        } catch (ApiException ex) {
            System.out.println(ex.getResponseBody());
        }
    }
}
