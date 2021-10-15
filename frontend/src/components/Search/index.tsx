
function Seach() {
    return (
        <div className = "row d-flex justify-content-center">
            <div className="col col-lg-4 ">
                <div className="input-group mb-3">
                    <input type="text" className="form-control" placeholder="Busca...." aria-label="Busca...." aria-describedby="button-addon2"/>
                    <button className ="btn btn-success " type ="button" id="button-addon2">Buscar</button>
                </div>
            </div>
        </div>
    )
}

export default Seach;