package com.agendarentrega.clients;

import com.agendarentrega.core.invoker.ApiClient;
import com.agendarentrega.clients.pedido.service.*;

public class Pedido {
    private ApiClient client;
    private EntidadeServiceApi entidade;
    private PedidoServiceApi pedido;

    protected Pedido(Client client) {
        this.client = new ApiClient();
        this.client.setBasePath(client.getBasePath("/pedido"));
        this.client.setApiKey(client.getApiKey());
    }

    public EntidadeServiceApi entidade() {
        if (this.entidade == null) {
            this.entidade = new EntidadeServiceApi(this.client);
        }
        return entidade;
    }

    public PedidoServiceApi pedido() {
        if (this.pedido == null) {
            this.pedido = new PedidoServiceApi(this.client);
        }
        return pedido;
    }
}
