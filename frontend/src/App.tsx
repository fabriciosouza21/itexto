import Footer from "components/Footer";
import NavBar from "components/NavBar";
import Post from "components/Post";
import Seach from "components/Search";

function App() {

  return (
    <>
      <NavBar/>
      <Seach/>
      <Post titulo = "Amazônia" resumo = "A floresta tropical amazônica, que cobre boa parte do noroeste do Brasil e se estende até a Colômbia, o Peru e outros países da América do Sul, é a maior floresta tropical do mundo, famosa por sua biodiversidade. Ela é atravessada por milhares de rios, entre eles o grandioso rio Amazonas. Entre as cidades ribeirinhas, com arquitetura do século XIX que data do início da exploração de borracha, destacam-se Manaus e Belém, no Brasil, e Iquitos e Puerto Maldonado, no Peru. "  />
      <Footer/>
    </>
  );
}

export default App;
