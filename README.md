# client-java
Cliente Java para serviços relacionados ao AgendarEntrega.com

## Instalação (utilizando maven)

Edite o seu arquivo pom.xml e adicione a seguinte configuração:

```xml
  <!--
    É necessário adicionar o jitpack, repositório de pacotes baseado em projetos git.
    Com ele será possível realizar a utilização do pacote diretamente dos releases gerados no github
  -->
  <repositories>
    <repository>
      <id>jitpack.io</id>
      <url>https://jitpack.io</url>
    </repository>
  </repositories>

  <dependencies>
    <dependency>
      <groupId>com.github.agendarentrega.client-java</groupId>
      <artifactId>agendarentrega-clients</artifactId>
      <version>v0.2.0</version>
    </dependency>
  </dependencies>
```

Para instalação utilizando outros gerenciadores de pacotes, favor verificar [aqui](https://jitpack.io/#agendarentrega/client-java/v0.2.0) os modelos de instalação

## Exemplo de utilização

```java
package com.example;

import com.agendarentrega.clients.Client;
import com.agendarentrega.clients.pedido.service.PedidoServiceApi;
import com.agendarentrega.clients.pedido.models.*;
import com.agendarentrega.core.invoker.ApiException;

public class App
{
    public static void main(String[] args)
    {
        Client c = new Client("[chave da api]");
        // Em caso de utilização do ambiente de demonstração, utilizar o modelo abaixo:
        // Client c = new Client("[chave da api]", "https://demo.agendarentrega.com/api");
        PedidoServiceApi pedido = c.pedido().pedido();

        try {
            pedido.alterarStatusPedido(
                "[cnpj emissor pedido]", "[codigo pedido]",
                new PedidoAlterarStatusPedidoRequest().status(PedidoStatusPedido.PEDIDO_CONCLUIDO));
            System.out.println("Pedido alterado com sucesso!");
        } catch (ApiException ex) {
            System.out.println(ex.getResponseBody());
        }
    }
}
```

Para consultar mais exemplos acesse o pacote [agendarentrega-examples](agendarentrega-examples/src/main/java/com/agendarentrega/examples/App.java)
