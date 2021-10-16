<p align="center">
  <a href="#sobre">Sobre</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#desafio">Desafio</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#resolucao">Resolução</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#execucao">Execução</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#desenvolvedor"></a>
</p>

<p align="center">
  <img src="https://img.shields.io/static/v1?label=PRs&message=welcome&color=49AA26&labelColor=000000" alt="PRs welcome!" />
</p>

# Itexto desafio tecnico

<h2 id="sobre">Sobre os Desafios</h2> 
<div align="justify">
  existem dois desafios um é criar uma api backend o outro é criar uma aplicação frontend para consumir os dados publicos api devall.
  <br>
  <br>
  
  **Backend:**
  - GET /post – responsável por retornar os últimos posts do dev/All caso não seja fornecido um
parâmetro de busca ou para buscar posts usando o parâmetro “search” ou “blog”, no caso da
listagem de posts pertencentes a um blog. No seu caso a busca será feita apenas por texto, ou seja,
pelo parâmetro “search”.

  - GET post/clique/{id} – os posts retornados pelo endpoint anterior não contém a URL para a qual
você deverá direcionar seus usuários. Isto por que precisamos registrar quantas vezes o link foi
acessado. Este endpoint executa duas ações: registra o clique do usuário e, dentre os valores
retornados (atributo URL), está o endereço do post para o qual você deverá direcionar o usuário do
seu cliente.

  **Frontend**
  - Utilizar Os end Points do backend acima
  - No momento em que a página for carregada, os últimos posts cadastrados no dev/All
deverão ser expostos.
  - Deve ser possível realizar a busca por posts no dev/All por assunto, tal como na interface
padrão do site. Sendo assim, deve existir um formulário de pesquisa no seu cliente web.
Neste formulário o usuário digitará um texto que será usado na busca por posts.
  - Na listagem dos posts apresentados deve haver um botão ou link que, uma vez clicado,
direcione o usuário para o site representado.
  
<h2 id="resolucao">Resolução</h2> 
<div >
  <h2 align="center"> Backend </h2> 
    <h3> Database </h3>

   <img src="https://raw.github.com/fabriciosouza21/itexto/main/assets/mysql.PNG" width="500px"/>

  <h3>🚧 implementação </h3>
  Iniciei criando a estrutura basica de pacotes entities, repositories, services e controllers, baseados na implementação do banco de dados, utilizando o padrão em camadas para estrutura o projeto.
  <br>
  <br>
  <img src="https://raw.github.com/fabriciosouza21/itexto/main/assets/modelo.PNG" width="500px"/>

  <h3>🚧 End point GET /post </h3>
    - A busca textual pesquisa por similaridade (like) posts cujos campos titulo ou resumo correspondam ao valor fornecido.
    - Sobre o autor, não devem ser retornados os campos “avatar” e “miniBiografia”, até por que os mesmos não se encontram presentes no banco de dados que lhe foi fornecido.
    - Sobre a ordenação dos posts, estes devem vir ordenados pela data de publicação em ordemdescendente.
    - O campo “url” do post não deve retornar preenchido. Ele será retornado na implementação do seu outro endpoint.
  <br>
  <br>
  <div>
    <img src="https://raw.github.com/fabriciosouza21/itexto/main/assets/response-api.png" width="500" />
  </div>

  <h3>🚧 End point GET post/clique/{id}</h3>
    - Registra o clique no link.
    - Retorna a URL que representa o link para, aí sim, ser acessada diretamente.
        
  <br>
  <br>
  <div>
    <img src="https://raw.github.com/fabriciosouza21/itexto/main/assets/clique.png" width="500"/>
  </div>

<div align="justify" >
  
   <h2 align="center"> Frontend </h2> 
</div>
<h2 id="resolucao">Desafio</h2> 
<div align="justify">
    Implemente um cliente do dev/All web usando as tecnologias que quiser que sejam baseadas nos
padrões HTML 5.


  <h3>🚧 implementação </h3>
    Cliente – que pode ser implementado em qualquer tecnologia que permita acessar serviços
disponibilizados através de padrões REST, utilizando a api do devall.
  <br>
  <br>
  <a href="https://docs.itexto.com.br/devall/">API do /dev/All</a>
      
  <h3>🚧 Organização de pastas do projeto </h3>
    - Na listagem dos posts apresentados deve haver um botão ou link que, uma vez clicado,direcione o usuário para o site representado.
        
  <br>
  <br>
  <div>
    <img src="https://raw.github.com/fabriciosouza21/itexto/main/assets/api-frontend-03.JPG" width="500"/>
  </div>

  <h3>🚧 Home  </h3>
    - No momento em que a página for carregada, os últimos posts cadastrados no dev/All
deverão ser expostos.
  <br>
  <br>
  <div>
    <img src="https://raw.github.com/fabriciosouza21/itexto/main/assets/api-frontend-01.JPG" width="800"/>
  </div>

  <h3>🚧 realizar busca</h3>
    - Deve ser possível realizar a busca por posts no dev/All por assunto, com um botão com o link do post
        
  <br>
  <br>
  <div>
    <img src="https://raw.github.com/fabriciosouza21/itexto/main/assets/api-frontend-02.JPG" width="800"/>
  </div>





<h2 id="tecnologias">🚀 Tecnologias</h2> 

- Java 11
- Spring Boot
- JPA
- Maven
- Mysql
- Javascript
- React js
- Docker
- bootstrap
- css
- html


<h2 id="execucao">🕹 Execução</h2> 

Pré-requisitos backend-java maven: **Java 11 e Postman (ou a API Client que preferir)**

```bash
# Clonar repositório
git clone https://github.com/fabio21777/itexto
# Entrar na pasta abaixo
cd itexto-backend
# Executar o projeto
./mvnw spring-boot:run

```
Pré-requisitos frontend yarn: **Node versão recentes**
```bash
# Clonar repositório
git clone https://github.com/fabio21777/itexto
# Entrar na pasta abaixo
cd itexto-frontend
# Instalar yarn
npm install --global yarn
# Baixar dependências do projeto
yarn install
# Executar o projeto
 yarn start
```  
Pré-requisitos backend-java docker: **Docker e Postman (ou a API Client que preferir)**

```bash
#Executar docker
docker run -d -p 8080:8080 --rm fabricio21777/itextospring
```
Pré-requisitos frontend-node docker: **Docker**

```bash
#Executar docker
docker run -d -p 3000:3000 --rm fabio21777/itextoreact
```




