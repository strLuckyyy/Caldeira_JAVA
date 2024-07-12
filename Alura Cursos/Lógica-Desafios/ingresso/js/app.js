function comprar(){
    function verificando_disponibilidade(varAreaDisponivel){
        // verificando se já não possui mais ingressos
        if(varAreaDisponivel.innerHTML == 0){
            alert("Não há mais esse tipo de ingresso diponível.");
            return;
        }
        let quantidadeSobra = varAreaDisponivel.innerHTML;

        varAreaDisponivel.innerHTML -= quantidade;
      
        if(varAreaDisponivel.innerHTML < 0){
            varAreaDisponivel.innerHTML = 0;
            alert(`Você comprou somente ${quantidadeSobra} ingressos. Não há mais disponibilidade desse tipo de ingresso.`);
        }
    }

    // acessando tags html
    let areaCinema = document.getElementById("tipo-ingresso").value;
    let quantidade = parseInt(document.getElementById("qtd").value);

    let quantidadeDisponivelPista = document.getElementById("qtd-pista");
    let quantidadeDisponivelInferior = document.getElementById("qtd-inferior");
    let quantidadeDisponivelSuperior = document.getElementById("qtd-superior");

    quantidade = quantidade > 0 ? quantidade : 1;

    // mudando a quantidade disponivel
    switch(areaCinema){
        case "pista":
            verificando_disponibilidade(quantidadeDisponivelPista);
            break;
        case "inferior":
            verificando_disponibilidade(quantidadeDisponivelInferior);
            break;
        case "superior":
            verificando_disponibilidade(quantidadeDisponivelSuperior);
            break;
    }
}
