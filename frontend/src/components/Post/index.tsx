import { arrow } from "components/icons";
interface post {
    titulo: string
    resumo: string
    Link?: string
}

function Post(props: post) {

    return (
        <div className="container">
            <div className="row justify-content-center">
                <h3>{arrow}{props.titulo}</h3>
            </div>
            <div>
                <p>{props.resumo}</p>
            </div>
            <a href="">
                <div className="row justify-content col-sm-1" style={{ display: 'flex', backgroundColor: '#00FFFF' }} >
                    ir ate o site
                </div>
            </a>
        </div>
    )
}

export default Post;