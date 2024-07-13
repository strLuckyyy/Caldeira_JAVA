// variáveis globais
let listaNomes = [];

// acessar tags html
let nomeAdicionado = document.getElementById("nome-amigo");
let listaAmigosHTML = document.getElementById("lista-amigos");
let listaSorteadosHTML = document.getElementById("lista-sorteio");

function adicionar(){    
    // verificando se foi escrito um nome
    if(nomeAdicionado.value == ""){
        alert("Digite um nome.")
        return;
    }

    // adicionando a lista
    listaNomes.push(nomeAdicionado.value);

    // mostrando o nome adicionado na lista de amigos
    listaAmigosHTML.innerHTML = listaNomes.join([", "]);    

    // deixando o campo limpo
    nomeAdicionado.value = "";

    console.log(listaNomes)
}

function sortear(){
    // função interna para facilitar o sorteio
    function sortear_indice(){
        let indice = parseInt(Math.random() * 10);

        if(indice > listaPessoasSorteadas.length - 1){
            return sortear_indice();
        }
        return indice;
    }


    // variáveis internas
    let pessoasSorteadas = "";
    let listaPessoasSorteadas = listaNomes.slice();
    let i = 0;


    // inicializando o bloco "sorteados"
    listaSorteadosHTML.innerHTML = "";

    // verificando se há mais de 1 pessoa na lista de amigos
    if(listaNomes.length < 2){
        alert("Não foi possivel sortear, número de participantes menor que 2.");
        return;
    }

    // verificando se a quantidade de pessoas na lista é impar
    if(listaNomes.length % 2 != 0){
        alert("O número de participantes precisa ser par!");
        return;
    }


    // sortear duplas sem repetir os indices
    for(i; i < listaPessoasSorteadas.length; i++){
        // sorteando os indices
        let sorteado1 = sortear_indice();
        let sorteado2 = sortear_indice();

        // caso sejam iguais, adicione +1 ou -1 ao segundo indice sorteado
        if(sorteado1 == sorteado2){
            if(sorteado2 == listaPessoasSorteadas.length - 1){
                sorteado2 -= 1;
            }
            sorteado2 += 1;
        }

        // montando a string
        pessoasSorteadas = `${listaPessoasSorteadas[sorteado1]} --> ${listaPessoasSorteadas[sorteado2]}`;

        // colocando na lista de sorteados
        listaSorteadosHTML.innerHTML += `${pessoasSorteadas}\n <br>`;

        // apagando da lista auxiliar. Isso para poder usar os indices novamente
        listaPessoasSorteadas.splice(sorteado1, 1);
        if(sorteado2 < sorteado1){
            listaPessoasSorteadas.splice(sorteado2, 1);
        } else {
            listaPessoasSorteadas.splice(sorteado2 - 1, 1);
        }
    }
    // retornando o valor para permitir vários sorteios com a mesma lista de pessoas
    listaPessoasSorteadas = listaNomes;
}

function reiniciar(){
    // zerando todos as variáveis
    listaNomes = [];
    listaAmigosString = "";
    listaAmigosHTML.innerHTML = "";
    listaSorteadosHTML.innerHTML = "";
}