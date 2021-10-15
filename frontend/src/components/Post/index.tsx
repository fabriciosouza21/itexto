import axios from "axios";
import { arrow } from "components/icons";
import { PostType } from "types/Post";
import { BASE_URL } from "utils/request";
interface post {
    titulo: string
    resumo: string
    link?: string
    thumbnail?: string
    id: number
}


function Post(props: post) {
    let url = `post/clique/${props.id}`
    const alterInput =  () =>{
        axios.get(`${BASE_URL}/${url}`)
            .then(response => {
                const dataRequest = response.data as PostType;
                url = dataRequest.url
                window.location.href = url
            });
            
    
    }

    return (
        <div className="container">
            <div className="row justify-content-center">
                <h3>{arrow}{props.titulo}</h3>
            </div>
            <div>
                <p>{props.resumo}</p>
            </div>
            <div>
                <img src={props.thumbnail} alt="" width="40%" height="60%"  />
            </div>

            <button className="btn btn-primary " onClick={alterInput} >
                Ir Ate a Pagina!
            </button>

        </div>
    )
}

export default Post;