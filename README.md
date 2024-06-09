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

    ### Pequena explicação de portas padrões

    1. Telnet:

        Porta Padrão: 23
        Explicação: O Telnet é um protocolo utilizado para acesso remoto a dispositivos e servidores. A porta 23 é a porta padrão para conexões Telnet, onde os clientes se conectam aos servidores para interagir com eles via linha de comando.
    2. SMTPS (SMTP Secure):
        Porta Padrão: 465
        Explicação: O SMTPS é uma versão segura do protocolo SMTP, que utiliza SSL/TLS para criptografar a comunicação entre o cliente e o servidor de e-mail. A porta 465 é usada para comunicações SMTPS criptografadas.
    3. IMAP (Internet Message Access Protocol):
        Porta Padrão: 143
        Explicação: O IMAP é um protocolo utilizado por clientes de e-mail para acessar e-mails armazenados em servidores de e-mail remotos. A porta 143 é a porta padrão para comunicações IMAP não criptografadas.
    4. IMAPS (IMAP Secure):
        Porta Padrão: 993
        Explicação: O IMAPS é a versão segura do protocolo IMAP, que utiliza SSL/TLS para criptografar a comunicação entre o cliente e o servidor de e-mail. A porta 993 é usada para comunicações IMAPS criptografadas.
    5. LDAP (Lightweight Directory Access Protocol):
        Porta Padrão: 389
        Explicação: O LDAP é um protocolo utilizado para acessar e gerenciar diretórios de informações, como diretórios de usuários e grupos. A porta 389 é a porta padrão para comunicações LDAP não criptografadas.
    6. LDAPS (LDAP Secure):
        Porta Padrão: 636
        Explicação: O LDAPS é a versão segura do protocolo LDAP, que utiliza SSL/TLS para criptografar a comunicação entre o cliente e o servidor LDAP. A porta 636 é usada para comunicações LDAPS criptografadas.
    7. DNS sobre HTTPS (DoH):
        Porta Padrão: 443
        Explicação: O DNS sobre HTTPS é um protocolo que permite que as consultas DNS sejam feitas através do protocolo HTTPS, garantindo assim maior privacidade e segurança. Ele utiliza a porta 443 para comunicações DoH.
    7. DNS sobre TLS (DoT):
        Porta Padrão: 853
        Explicação: O DNS sobre TLS é um protocolo que permite que as consultas DNS sejam feitas através do protocolo TLS (Transport Layer Security), garantindo assim maior privacidade e segurança. Ele utiliza a porta 853 para comunicações DoT.
    8. HTTP (Hypertext Transfer Protocol):
        Porta Padrão: 80
        Explicação: O HTTP é o protocolo padrão utilizado para transferência de dados na web. A porta 80 é reservada para comunicações HTTP não criptografadas. Porém, em muitos casos, as aplicações web modernas preferem usar a porta 443 para HTTPS (HTTP Secure) para garantir a segurança da comunicação.
    9. HTTPS (HTTP Secure):
        Porta Padrão: 443
        Explicação: O HTTPS é a versão segura do protocolo HTTP, que utiliza criptografia SSL/TLS para proteger a comunicação entre o cliente e o servidor. A porta 443 é utilizada para comunicações HTTPS criptografadas.
    10. FTP (File Transfer Protocol):
        Porta Padrão: 21
        Explicação: O FTP é um protocolo utilizado para transferência de arquivos entre um cliente e um servidor. A porta 21 é a porta padrão para controle de conexão, onde os comandos de controle são trocados entre o cliente e o servidor.
    11. SSH (Secure Shell):
        Porta Padrão: 22
        Explicação: O SSH é um protocolo de rede utilizado para acessar e gerenciar remotamente servidores e dispositivos de rede de forma segura. A porta 22 é a porta padrão para conexões SSH.
    12. SMTP (Simple Mail Transfer Protocol):
        Porta Padrão: 25
        Explicação: O SMTP é um protocolo utilizado para envio de e-mails. A porta 25 é a porta padrão para comunicação entre servidores de e-mail para transferência de mensagens de e-mail.
    13. DNS (Domain Name System):
        Porta Padrão: 53
        Explicação: O DNS é um sistema utilizado para tradução de nomes de domínio em endereços IP e vice-versa. A porta 53 é a porta padrão para comunicação entre clientes DNS e servidores DNS.
    14. MySQL:
        Porta Padrão: 3306
        Explicação: O MySQL é um sistema de gerenciamento de banco de dados relacional. A porta 3306 é a porta padrão para comunicação com servidores MySQL.
    15. PostgreSQL:
        Porta Padrão: 5432
        Explicação: O PostgreSQL é outro sistema de gerenciamento de banco de dados relacional. A porta 5432 é a porta padrão para comunicação com servidores PostgreSQL.

    Essas são apenas algumas das portas padrão mais comuns. É importante observar que essas portas podem ser alteradas nas configurações dos aplicativos para atender às necessidades específicas de cada ambiente.

    ### Metodos HTTP

    1. GET: Usado para solicitar dados de um recurso específico no servidor. É um método seguro e não deve alterar o estado do servidor. Normalmente utilizado para buscar informações.

    2. POST: Utilizado para enviar dados ao servidor para serem processados. É frequentemente utilizado para criar novos recursos no servidor.

    3. PUT: Utilizado para atualizar um recurso específico no servidor com os dados fornecidos na requisição. Geralmente, é utilizado para realizar atualizações completas de um recurso.

    4. PATCH: Similar ao PUT, mas utilizado para realizar atualizações parciais em um recurso, fornecendo apenas os campos que devem ser atualizados.

    5. DELETE: Utilizado para remover um recurso específico no servidor. Indica que o cliente deseja excluir o recurso especificado.

    6. HEAD: Similar ao GET, mas utilizado para obter apenas os cabeçalhos de resposta da requisição, sem o corpo da resposta. É útil para verificar informações sobre o recurso sem recuperar todo o conteúdo.

    7. OPTIONS: Utilizado para obter informações sobre os métodos HTTP suportados pelo servidor para um recurso específico. Também pode ser utilizado para verificar as opções de comunicação disponíveis.

    Esses são alguns dos métodos HTTP mais comuns e amplamente utilizados na comunicação entre cliente e servidor na web. Cada método possui um propósito específico e deve ser utilizado de acordo com as necessidades da aplicação e os padrões de design RESTful.

    ### Status Code

    Os códigos de status HTTP são retornados pelo servidor para indicar o resultado da solicitação feita pelo cliente. Eles fornecem informações sobre o sucesso ou falha da solicitação e são divididos em cinco categorias principais, cada uma representando uma classe de resposta:

    - 1xx - Informacional: Esses códigos indicam que a solicitação foi recebida e está sendo processada. Eles geralmente informam ao cliente que mais ações são necessárias antes que a solicitação possa ser concluída.

    - 2xx - Sucesso: Esses códigos indicam que a solicitação foi recebida, entendida e aceita com sucesso pelo servidor. Eles geralmente indicam que a operação foi bem-sucedida.

    - 3xx - Redirecionamento: Esses códigos indicam que a solicitação foi recebida, mas o cliente deve realizar uma ação adicional para completar a solicitação. Geralmente são utilizados para redirecionar o cliente para outra URL.

    - 4xx - Erro do Cliente: Esses códigos indicam que ocorreu um erro por parte do cliente, como uma solicitação inválida, ausência de autorização ou recurso não encontrado. Eles geralmente requerem ação por parte do cliente para corrigir o problema.

    - 5xx - Erro do Servidor: Esses códigos indicam que ocorreu um erro por parte do servidor ao processar a solicitação. Isso pode acontecer devido a um erro interno do servidor, sobrecarga ou falha temporária. Geralmente, não requerem ação por parte do cliente e podem ser corrigidos pelo administrador do servidor.

    *Alguns exemplos comuns de códigos de status HTTP incluem:*

    200 OK: Indica que a solicitação foi bem-sucedida.

    404 Not Found: Indica que o recurso solicitado não foi encontrado no servidor.

    500 Internal Server Error: Indica que ocorreu um erro interno no servidor ao processar a solicitação.
    
    Esses códigos de status são uma parte importante da comunicação entre cliente e servidor na web, fornecendo informações úteis sobre o resultado das solicitações e ajudando os desenvolvedores a diagnosticar e corrigir problemas em suas aplicações.

## Imersão no Spring Framework com Spring Boot

Neste primeiro momento passamos por uma explicação sobre os Startes mais famosos do Spring Boot.

O Starters é um descritor de dependência, acredito que seja o que vem escrito no POM do projeto.

OS benefícios dos starters são:

    coesão
    versão compativél
    otimização do tempo
    configuração simples
    Foco no negócio

OS Starters mais usados:

    data-jpa: Integração ao banco de dados via JPA - Hibernate 
    data-mongodb: Interação com o banco de dados MongoDB
    web: Inclusão do container Tomcat para aplicações REST
    web-services: WebServices baseados na arquitetura SOAP
    batch: Implementação de JOBs de processos
    openfeing: Cliente HTTP baseado em interfaces 
    actuator: Gerenciador de monitoramento da aplicação

aqui alguns links para saber mais :

https://www.fusion-reactor.com/blog/the-difference-between-spring-framework-vs-spring-boot/

https://dev.to/eduwyre/settling-spring-vs-spring-boot-debate-8ek 

https://www.reply.com/solidsoft-reply/en/content/webservices-soap-and-rest-a-simple-introduction 

https://www.geeksforgeeks.org/difference-between-spring-and-spring-boot/ 

### Primeiros Passos

Aqui criamos um projeto Demo e outro projeto "primeiros-passos" utilizando o springinitialz sem nenhum starter e foi mostrado o uso do autowired para não instanciar a classe calculadora de forma que se mantenha a injeção de dependências.

### Bean VS Component

Podemos dizer para simplificar que @bean é quando queremos construir ou implementar códigos externos à nossa aplicação e @Component quanto é um conjunto de código que temos acesso e faz parte do nosso código.

### Scope

Singleton e prototype

"Quantos irei precisar?" 

Sem daclarar o scope o tipo será singleton ou seja, será instanciado apenas uma vez o objeto sem levar em conta a necessidade da aplicação.

Ao usar o @Scope("prototype") declaramos que a partir do escaneamento da aplicação será construido quantos objetos forem necessários do mesmo, modificando o comportamento da aplicação com base na necessidade.

Para este será necessário mais estudo e aprofundamento.

### Proprieties Value

"Nem tudo é = (igual)"

Nem todas as necessidades da aplicação precisam estar explicitamente declarada dentro da aplicação. Essas informações são centralizadas dentro da "application.proprieties". Isso quer dizer que ao declarar dentro das propriedades da aplicação garantimos que a informação lá contida não será modificada durante a utilização da aplicação pelo usuário.

@value: Podemos declarar valores padrões salvos no proprieties e utilizar de forma interativa.

No exemplo declaramos 3 valores padrões: nome, email e telefone;

Podemos delcarar como uma propriedade da seguinte forma: 

@Value(${nome}) para buscar o valor de nome do proprieties ou podemos também passar valores padrões caso não seja possível encontrar, como por exemplo: @Value(${name:<algum valor padrão>})

### Configuretion proprieties

aplication.proprieties
@ConfigurationProprieties (prefix = <nome>)

com essa injeção podemos definir valores padrões também assim como o value porém de forma que não precisamos declarar diretamente dentro da aplicação e sim definindo um objeto de "configuração" para tratar estes valores.

### Conceito de ORM e JPA

    ORM: Object-Relacional Mapping, em português, mapeamento objeto relacional, é um recurso para aproximar o paradigma da orientação a objetos ao contexto de banco de dados relacional.

    O uso de ORM é realizado através do mapeamento de objeto para uma tabela por uma biblioteca ou framework

    geralmente era feito o mapeamento via XML.


    JPA: É uma especificação baseada em interfaces, que através de um framework realiza operações de persistência de objetos Java.

Os mapeamentos em JPA são:

    Identificação
    Definição
    Relacionamento
    Herança
    Persistência






