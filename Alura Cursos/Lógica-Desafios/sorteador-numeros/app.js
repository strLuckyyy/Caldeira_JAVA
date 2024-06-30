function editar_txt(id, txt){
    let conteudo = document.getElementById(id);
    conteudo.innerHTML = txt;
}

function clear_input(){
    document.getElementById("quantidade").value = "";
    document.getElementById("de").value = "";
    document.getElementById("ate").value = "";
}

function sorteando_numero(limite){
    return parseInt(Math.random() * limite);
}

function disable_button(){
    let botaoReiniciar = document.getElementById("btn-reiniciar");
    let botaoSortear = document.getElementById("btn-sortear");
    let desabilitarBotao = "container__botao-desabilitado";
    let habilitarBotao = "container__botao";

    if(botaoReiniciar.classList.contains(desabilitarBotao)){
        botaoReiniciar.setAttribute("class", habilitarBotao);
        botaoReiniciar.removeAttribute("disabled");

        botaoSortear.setAttribute("class", desabilitarBotao);
        botaoSortear.setAttribute("disabled", "true");
        return;
    }
    botaoReiniciar.setAttribute("class", desabilitarBotao);
    botaoReiniciar.setAttribute("disabled", "true");

    botaoSortear.setAttribute("class", habilitarBotao);
    botaoSortear.removeAttribute("disabled");
}

function sortear(){
    let quantidadeDeNumeros = parseInt(document.getElementById("quantidade").value);
    let menorNumero = parseInt(document.getElementById("de").value);
    let maiorNumero = parseInt(document.getElementById("ate").value);
    let numerosSorteados = [];

    while(quantidadeDeNumeros > 0){
        let nSorteado = sorteando_numero(maiorNumero);

        if(numerosSorteados.includes(nSorteado)){
            return sortear();
        }
        if(nSorteado < menorNumero){
            return sortear();
        }

        numerosSorteados.push(nSorteado);
        quantidadeDeNumeros--;
    }

    editar_txt("resultado", `<label class="texto__paragrafo">Números sorteados: ${numerosSorteados}</label>`);
    disable_button();
    return numerosSorteados;
}


function reiniciar(){
    disable_button();
    clear_input();
    editar_txt("resultado", `<label class="texto__paragrafo">Números sorteados:  nenhum até agora</label>`);
}
