<p align="center">
  <a href="#sobre">TDD</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#desafio">Desafio</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#resolucao">Resolução</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#tecnologias">Tecnologias</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#execucao">Execução</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#desenvolvedor"></a>
</p>

<p align="center">
  <img src="https://img.shields.io/static/v1?label=PRs&message=welcome&color=49AA26&labelColor=000000" alt="PRs welcome!" />
</p>

# Test - Itexto desafio tecnico

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
  
</div>

<h2 id="desafio">Desafio</h2> 
<div align="justify">
  Backend<br>
</div>
<h2 id="resolucao">Resolução</h2> 
<div align="justify">
    Listagem e busca de posts - Endpoint GET 

    <h3>🚧 Banco de dados mysql </h3>

  <h3>🚧 implementação </h3>
  Iniciei criando a estrutura basica de pacotes entities, repositories, services e controllers, baseados na implementação do banco de dados, utilizando o padrão em camadas para estrutura o projeto.
  <br>
  <br>
  <img src="https://user-images.githubusercontent.com/83084256/134752571-774a1518-c6a7-4ac6-876e-bddf19429b0b.png" width="250" height="200" />

  <h3>🚧 Endpoint GET /post </h3>
    - A busca textual pesquisa por similaridade (like) posts cujos campos titulo ou resumo correspondam ao valor fornecido.
    - Sobre o autor, não devem ser retornados os campos “avatar” e “miniBiografia”, até por que os mesmos não se encontram presentes no banco de dados que lhe foi fornecido.
    - Sobre a ordenação dos posts, estes devem vir ordenados pela data de publicação em ordemdescendente.
    - O campo “url” do post não deve retornar preenchido. Ele será retornado na implementação do seu outro endpoint.
  <br>
  <br>
  <div>
    <img src="https://user-images.githubusercontent.com/83084256/134749186-de793542-3c50-4466-89f8-a80f4d71e282.png" width="250" height="200" />
  </div>

  <h3>🚧 Endpoint GET post/clique/{id}</h3>
    - Registra o clique no link.
    - Retorna a URL que representa o link para, aí sim, ser acessada diretamente.
        
  <br>
  <br>
  <div>
    <img src="https://user-images.githubusercontent.com/83084256/134749408-9f491e77-bbfe-4705-9c01-3f0eac00afcf.png" width="250" height="200"/>
  </div>



<h2 id="desafio">Desafio</h2> 
  <br>
  <br>

<div align="justify">
  Frontend<br>
</div>
<h2 id="resolucao">Resolução</h2> 
<div align="justify">
    Implemente um cliente do dev/All web usando as tecnologias que quiser que sejam baseadas nos
padrões HTML 5.


  <h3>🚧 implementação </h3>
    Cliente – que pode ser implementado em qualquer tecnologia que permita acessar serviços
disponibilizados através de padrões REST.
  <br>
  <br>
  <img src="https://user-images.githubusercontent.com/83084256/134752571-774a1518-c6a7-4ac6-876e-bddf19429b0b.png" width="250" height="200" />

  <h3>🚧 Home  </h3>
    - No momento em que a página for carregada, os últimos posts cadastrados no dev/All
deverão ser expostos.
  <br>
  <br>
  <div>
    <img src="https://user-images.githubusercontent.com/83084256/134749186-de793542-3c50-4466-89f8-a80f4d71e282.png" width="250" height="200" />
  </div>

  <h3>🚧 realizar busca</h3>
    - Deve ser possível realizar a busca por posts no dev/All por assunto
        
  <br>
  <br>
  <div>
    <img src="https://user-images.githubusercontent.com/83084256/134749408-9f491e77-bbfe-4705-9c01-3f0eac00afcf.png" width="250" height="200"/>
  </div>

    <h3>🚧 botão ou link </h3>
    - Deve ser possível realizar a busca por posts no dev/All por assunto
        
  <br>
  <br>
  <div>
    <img src="https://user-images.githubusercontent.com/83084256/134749408-9f491e77-bbfe-4705-9c01-3f0eac00afcf.png" width="250" height="200"/>
  </div>



<h2 id="tecnologias">🚀 Tecnologias</h2> 

- Java 11
- React js
- Spring Boot
- JPA
- Maven
- Mysql
- Docker


<h2 id="execucao">🕹 Execução</h2> 

Pré-requisitos java maven: **Java 11 e Postman (ou a API Client que preferir)**

```bash
# Clonar repositório
git clone https://github.com/fabriciosouza21/itexto
# Entrar na pasta abaixo
cd itexto-backend
# Executar o projeto
./mvnw spring-boot:run

```
Pré-requisitos java docker: **Docker e Postman (ou a API Client que preferir)**

```bash
#Executar docker
docker run fabricio21777/itextospring
```

<h2 id="licenca">📃 Licença</h2> 

Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](https://github.com/lilianmartinsfritzen/TDD-challenge/blob/main/LICENSE) para mais detalhes.

<h2 id="desenvolvedor">Desenvolvedor</h2> 
  <img style="border-radius: 50%" border="50%" src="https://user-images.githubusercontent.com/83084256/134750093-acf555ae-b1b0-4a4e-a22c-421bf98f15a0.png" width="100" height="100" /> <br>
<a href="https://www.linkedin.com/in/lilian-martins-fritzen/">
  <img src="https://img.shields.io/static/v1?label=Linkedin&message=lilianmartinsfritzen&color=0A66C2&style=for-the-badge&logo=linkedin" />
</a>
