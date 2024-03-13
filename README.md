# Bootcamp Java AI Powered

## Iniciando o curso

Primeiramente vamos estudar **arquitetura REST**

- **API (Application Programing Inteface)**

    É um programa que funciona como um contrato para definir como dois clientes se comunicam, sendo um client e um Server;
    usa os metodos HTTP (GET, POST, PUT, DELETE);
    Usa request (requisições) com Head e Body e aguarda uma resonse (Resposta);
    Pode ser escrita com JSON ou XML;

    ### Tipos de arquiteturas de API

    1. **SOAP (Simple Object Access Protocol)**
        Cliente e servidor trocam mensagens usando XML. Esta API é menos flexível.

        Pelo Chat GPT temos a seguinte definição:

            É um protocolo de comunicação baseado em XML (Extensible Markup Language) utilizado para troca de informações estruturadas entre sistemas distribuídos na internet. Ele fornece uma maneira padronizada para que diferentes aplicações possam se comunicar e trocar dados de maneira independente de plataforma ou linguagem de programação.

            O SOAP define um formato de mensagem XML que inclui um envelope XML para encapsular a mensagem, cabeçalhos opcionais para definir parâmetros e informações de autenticação, bem como um corpo que contém os dados a serem transmitidos. Essas mensagens SOAP são geralmente transmitidas via HTTP (Hypertext Transfer Protocol), embora outros protocolos de transporte também possam ser utilizados.

            Uma das características principais do SOAP é sua extensibilidade, permitindo a adição de diferentes funcionalidades e recursos, como segurança, transações e roteamento de mensagens, através do uso de extensões e padrões complementares.

            O SOAP é frequentemente utilizado em serviços web (Web Services) para permitir a integração e comunicação entre sistemas heterogêneos em uma arquitetura orientada a serviços (SOA). Apesar de ter sido uma das principais tecnologias para serviços web, seu uso tem diminuído em favor de abordagens mais leves e simplificadas, como REST (Representational State Transfer), especialmente em ambientes onde a simplicidade e a performance são prioritárias.

    2. **RPC (Remote Procedure Call)**
        O cliente conclui uma função (ou um procedimento) no servidor e o servidor envia uma saída de volta ao cliente.

        Pelo Chat GPT temos a seguinte definição:

            
            RPC (Remote Procedure Call) é um modelo de comunicação que permite que um programa solicite a execução de um procedimento ou função em um computador remoto, como se estivesse chamando uma função localmente. Ele facilita a comunicação entre processos em sistemas distribuídos, permitindo que programas em diferentes computadores compartilhem recursos e realizem operações cooperativas.

            No RPC, um cliente faz uma chamada a um procedimento remoto, especificando os parâmetros necessários para a execução da função e aguarda pela resposta do servidor. O servidor recebe a solicitação, executa o procedimento solicitado com os parâmetros fornecidos e retorna o resultado ao cliente. Essa comunicação é transparente para o cliente, que não precisa se preocupar com os detalhes de implementação da comunicação entre sistemas.

            O RPC é implementado através de uma camada de software que lida com a serialização dos parâmetros da função, a transmissão dos dados pela rede, a invocação do procedimento remoto no servidor, e a desserialização do resultado de volta para o cliente. Existem várias tecnologias e frameworks que oferecem suporte ao RPC, incluindo RPC nativo do sistema operacional, RPC sobre HTTP, como é o caso do SOAP, e frameworks de RPC mais modernos, como gRPC.

            O RPC foi uma das primeiras abordagens para comunicação em sistemas distribuídos e continua a ser utilizado em muitos contextos, especialmente em ambientes corporativos e em sistemas legados. No entanto, em alguns casos, foi substituído por abordagens mais leves e flexíveis, como serviços web baseados em REST, que são mais adequados para ambientes web e dispositivos móveis.

    3. **WebSocket**
        O servidor pode enviar mensagens de retorno de chamada a clientes conectados, tornando-o mais eficiente que a API REST.

        Pelo Chat GPT temos a seguinte definição:

            WebSocket é um protocolo de comunicação bidirecional, full-duplex e baseado em TCP (Transmission Control Protocol), projetado para possibilitar uma comunicação interativa em tempo real entre um cliente e um servidor web. Ele oferece uma maneira eficiente e de baixa latência para estabelecer uma conexão persistente entre um navegador web e um servidor, permitindo a troca de mensagens em ambas as direções sem a necessidade de solicitações HTTP adicionais.

            Ao contrário do HTTP tradicional, onde o cliente faz uma solicitação e o servidor responde, o WebSocket permite que ambos, cliente e servidor, enviem e recebam dados simultaneamente, proporcionando uma comunicação mais eficiente e responsiva.

            O protocolo WebSocket é iniciado por meio de um handshake HTTP entre o cliente e o servidor, onde o cliente solicita uma atualização da conexão para WebSocket. Se o servidor aceitar a solicitação, a conexão é atualizada e mantida aberta, permitindo a troca de mensagens em tempo real. Uma vez estabelecida, a conexão WebSocket permanece ativa até que seja explicitamente fechada por uma das partes.

            WebSocket é frequentemente utilizado em aplicações web que requerem atualizações em tempo real, como chats, jogos online, transmissões ao vivo, colaboração em tempo real e monitoramento remoto. Ele oferece uma alternativa eficiente e de baixa latência em comparação com outras técnicas de comunicação, como polling (consulta periódica) ou long polling (consulta prolongada), que podem ser mais custosas em termos de recursos de rede e processamento do servidor.

    4. **REST (Representational State Transfer)**
        O cliente envia solicitações ao servidor como dados. O servidor usa essa entrada do cliente para iniciar funções internas e retorna os dados de saída para o cliente.

        Pelo Chat GPT temos a seguinte definição:

            REST (Representational State Transfer) é um estilo arquitetural utilizado na concepção de sistemas de software distribuídos, especialmente na construção de serviços web. Ele é baseado em princípios simples e fundamentais que promovem a interoperabilidade, escalabilidade e simplicidade na comunicação entre sistemas distribuídos na web.

            As características principais do REST incluem:

            Recursos: Na arquitetura REST, tudo é considerado um recurso, que pode ser qualquer entidade identificável, como um documento, uma imagem, um serviço, etc. Cada recurso é único e pode ser acessado por meio de uma URI (Uniform Resource Identifier).

            Operações sobre recursos utilizando métodos HTTP: As operações sobre os recursos são realizadas utilizando os métodos HTTP padrão, como GET (obter), POST (criar), PUT (atualizar) e DELETE (excluir). Esses métodos HTTP definem as ações que podem ser realizadas sobre um recurso específico.

            Representações de recursos: Os recursos em um sistema REST são representados em diferentes formatos, como JSON (JavaScript Object Notation) ou XML (eXtensible Markup Language). As representações de recursos são transferidas entre cliente e servidor como parte das requisições e respostas HTTP.

            Estado de sessão: O REST é um estilo de arquitetura stateless, o que significa que cada requisição do cliente para o servidor contém toda a informação necessária para entender e processar a requisição. Isso simplifica a implementação e escala bem em ambientes distribuídos.

            Interface uniforme: O REST promove uma interface uniforme entre clientes e servidores, o que facilita a evolução e o gerenciamento de sistemas distribuídos. Isso inclui a padronização dos métodos HTTP, a utilização de URIs para identificar recursos e o uso de formatos de representação comuns.

            O REST é amplamente utilizado na construção de serviços web e APIs (Application Programming Interfaces), devido à sua simplicidade, flexibilidade e facilidade de uso. Ele se tornou um padrão de facto para a criação de sistemas distribuídos na web, sendo adotado por grandes empresas e organizações em todo o mundo.

