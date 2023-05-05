const formulario = document.querySelector("form");
const inome = document.querySelector(".nome");
const iemail = document.querySelector(".email");
const isenha = document.querySelector(".senha");
const itel = document.querySelector(".tel");


function cadastrar() {
    fetch("http://localhost:8080/usuarios",
        {
            Headers: {
                'Accept': 'aplication/json',
                'Content-type': 'aplication/json',
            },
            method: "POST",
            body: JSON.stringify({
                nome: inome.Value,
                email: iemail.Value,
                senha: isenha.Value,
                telefone: itel.Value
            })
        })
        .then(function (res) { console.log(res) })
        .catch(function (res) { console.log(res) })
};

function limpar() {

    inome.Value = "";
    iemail.Value = "";
    isenha.Value = "";
    itel.Value = "";


}

formulario.addEventListener('submit', function (event) {
    event.preventDefault();

    cadastrar();
    limpar();

});