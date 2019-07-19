package com.agendarentrega.clients;

public class Client {
    private String basePath;
    private String apiKey;

    // services
    private Pedido pedido;

    public Client(String apiKey) {
        this(apiKey, "https://api.agendarentrega.com");
    }

    public Client(String apiKey, String basePath) {
        this.apiKey = apiKey;
        this.basePath = basePath;
    }

    protected String getBasePath(String servicePath) {
        return this.basePath + servicePath;
    }

    protected String getApiKey() {
        return this.apiKey;
    }

    public Pedido pedido() {
        if (this.pedido == null) {
            this.pedido = new Pedido(this);
        }
        return this.pedido;
    }
}