import logo from 'assets/images/itexto.png'
function Footer() {
    return (
        <footer className="footer mt-auto py-3 bg-dark">
            <div className="container">
                <img src={logo}  alt="logo" width="120" />
            </div>
        </footer>
    );
}

export default Footer;