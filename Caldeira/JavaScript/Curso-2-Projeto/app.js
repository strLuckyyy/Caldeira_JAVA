function editarTxt(tag, txt){
    let conteudo = document.querySelector(tag);
    conteudo.innerHTML = txt;
}

function genNumAleatorio(){
    return parseInt(Math.random() * 100);
}

function cleanConsole(){
    chute = document.querySelector('input');
    chute.value = '';
}

function disabledBotton(boo = true){   
    if (boo == true) {
        document.getElementById('reiniciar').removeAttribute('disabled');
        document.getElementById('chutar').setAttribute('disabled', true);
    } else {
        document.getElementById('reiniciar').setAttribute('disabled', true);
        document.getElementById('chutar').removeAttribute('disabled');
    }
}

function inicio(){
    editarTxt('h1', 'Jogo do Nº Secreto');
    editarTxt('p', 'Escolha um número entre 1 a 100');
    genNumAleatorio();
}

//

inicio();
let tentativa = 0;
let numAleatorio = genNumAleatorio();

function verificarChute(){
    let chute = document.querySelector('input').value;
    let wordTentativa = tentativa > 1 ? 'tentativas' : 'tentativa';
    
    tentativa++;
    if(chute == numAleatorio){
        editarTxt('h1', 'Parabéns!');
        editarTxt('p', `Você descobriu o número com ${tentativa} ${wordTentativa}.`);
        disabledBotton(true);
    }

    if(chute < numAleatorio){
        editarTxt('p', `O número é maior que ${chute}.`);
    }

    if(chute > numAleatorio){
        editarTxt('p', `O número é menor que ${chute}.`);
    }
    cleanConsole();
}

function verificarNovoJogo(){
    disabledBotton(false);
    inicio();
    tentativa = 0;
}

