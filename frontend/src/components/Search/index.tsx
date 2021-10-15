import axios from "axios";
import Post from "components/Post";
import { SetStateAction, useEffect, useState } from "react";
import { PostType } from "types/Post";
import { BASE_URL } from "utils/request";

class InfPost{
    titulo: string;
    resumo: string;
    id: number;
    thumbnail: string;
    constructor (titulo: string ,resumo: string ,id: number, thumbnail: string){
      this.titulo = titulo;
      this.resumo = resumo;
      this.id = id;
      this.thumbnail = thumbnail;
    }
    fabricaObjetos(){
      this.titulo = "";
      this.resumo = "";
      this.id = 0;
      return this
    }
    
  
  }
  
    
  type Postinf = {
    post:InfPost[];
  }
  

function Seach() {
    const  [data, setData] = useState<Postinf>({post:[]});
    
    const [value,setvalue]= useState("")

    let url = ""
    if(value.length === 0){
        url = "post"
    }
    else{
        encodeURIComponent(value)
        url = `post?search=${value}`
    }

    const alterInput =  () =>{setvalue(value)
        let lista = [new InfPost("teste","teste",1,"teste")]
        axios.get(`${BASE_URL}/${url}`)
            .then(response => {
                const dataRequest = response.data as PostType[];
                const mytitulos = dataRequest.map(x => x.titulo);
                const myresumos = dataRequest.map(x => x.resumo);
                const myids = dataRequest.map(x => x.id);
                const mythumbnail = dataRequest.map(x => x.thumbnail);
                for (let i = 0; i < myids.length; i++){
                    lista.push(new InfPost(mytitulos[i],myresumos[i],myids[i],mythumbnail[i]))
                }
                lista.shift()
                setData({post:lista})
            });
        }
        
    const change = (e: { target: { value: SetStateAction<string>; }; }) => setvalue(e.target.value)
    useEffect(()=>{
    let lista = [new InfPost("teste","teste",1,"teste")]
    axios.get(`${BASE_URL}/${url}`)
        .then(response => {
            const dataRequest = response.data as PostType[];
            const myTitulos = dataRequest.map(x => x.titulo);
            const myResumos = dataRequest.map(x => x.resumo);
            const myIds = dataRequest.map(x => x.id);
            const myThumbnail = dataRequest.map(x => x.thumbnail);
            
            for (let i = 0; i < myIds.length; i++){
              lista.push(new InfPost(myTitulos[i],myResumos[i],myIds[i],myThumbnail[i]))
            }
            lista.shift()
            setData({post:lista})
        });
    }, [url]);
    return (
        <>
        <div className = "row d-flex justify-content-center">
            <div className="col col-lg-4 ">
                <div className="input-group mb-3">
                    <input type="text" className="form-control" placeholder="Buscar...." aria-label="Buscar...." aria-describedby="button-addon2" 
                    value = {value}  onChange = {change} maxLength = {50} />
                    <button className ="btn btn-success " type ="button" id="button-addon2" onClick={alterInput}>Buscar</button>
                </div>
            </div>
        </div>
        <div>
             {data.post?.map(item => (
                <Post titulo = {item.titulo} resumo = {item.resumo} thumbnail = {item.thumbnail} id = {item.id}/>
                ))}
        </div>
    </>
    )
}

export default Seach;