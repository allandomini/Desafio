    <h1>Desafio de Desenvolvimento Angular com Spring Boot e Java</h1>

    <h2>Descrição do Projeto</h2>

    <p>A aplicação é dividida em duas partes principais: o frontend, desenvolvido em Typescript com o Angular Framework, e o backend, construído em Java com o Spring Boot.</p>

    <h3>Frontend (Angular)</h3>

    <p>O frontend da aplicação é responsável por fornecer uma interface de usuário intuitiva e semi-responsiva para interagir com o sistema. Ele consiste em:</p>

    <ul>
        <li><strong>Listagem de Prospects</strong>: A página inicial exibe uma lista de prospects, onde cada linha contém detalhes do prospect juntamente com dois botões. O primeiro botão permite editar as informações do prospect, enquanto o segundo executa a conversão do prospect em cliente.</li>
        <li><strong>Cadastro de Novos Prospects</strong>: Há um botão na tela de listagem que direciona o usuário para uma nova tela para cadastrar novos prospects. Nesta tela, o usuário pode inserir informações como nome, número de documento, data de nascimento e cidade de residência do prospect.</li>
    </ul>

    <h3>Backend (Java com Spring Boot)</h3>

    <p>O backend da aplicação é responsável por gerenciar todas as operações de CRUD (criar, ler, atualizar e excluir) relacionadas aos prospects e clientes. Além disso, é responsável pela funcionalidade de conversão de prospect em cliente. Principais pontos do backend:</p>

    <ul>
        <li><strong>Operações de CRUD</strong>: O backend fornece endpoints para realizar operações de criação, leitura, atualização e exclusão de prospects e clientes.</li>
        <li><strong>Conversão de Prospect em Cliente</strong>: Uma funcionalidade específica permite a conversão de um prospect em cliente. Isso envolve a atualização do estado do prospect para indicar que ele se tornou um cliente.</li>
        <li><strong>Banco de Dados</strong>: Foi escolhido o banco de dados SQL Postgres para armazenar os dados de prospects e clientes.</li>
    </ul>

    <h2>Tecnologias Utilizadas</h2>

    <ul>
        <li><strong>Frontend</strong>: Angular (Typescript)</li>
        <li><strong>Backend</strong>: Java com Spring Boot</li>
        <li><strong>Banco de Dados</strong>: SQL Postgres</li>
    </ul>

    <h2>Como Executar o Projeto</h2>

    <ol>
        <li><strong>Clonar o Repositório</strong>: Clone este repositório para sua máquina local.</li>
        <li><strong>Configurar o Banco de Dados</strong>: Certifique-se de ter um servidor Postgres configurado e execute os scripts de criação do banco de dados, se necessário.</li>
        <li><strong>Executar o Backend</strong>: Navegue até o diretório do backend e execute a aplicação Spring Boot.</li>
        <li><strong>Executar o Frontend</strong>: Navegue até o diretório do frontend e execute a aplicação Angular.</li>
        <li><strong>Acessar a Aplicação</strong>: Abra um navegador e acesse a URL da aplicação.</li>
    </ol>

    <h2>Conclusão</h2>

    <p>Este desafio oferece a oportunidade de aplicar conhecimentos em Angular, Spring Boot e Java para desenvolver uma aplicação web funcional que atenda às necessidades de gestão de prospects de uma empresa. Ao finalizar o desafio, o candidato terá demonstrado habilidades em desenvolvimento frontend e backend, bem como conhecimento em integração de tecnologias para construir uma solução completa.</p>
