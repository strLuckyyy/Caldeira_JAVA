// Função referente a troca dos textos 'h1' e 'p' do HTML. 
function editarTxt(tag, txt){
    let conteudo = document.querySelector(tag);
    conteudo.innerHTML = txt;
}

// Função referente a geração de um novo número aleatório.
function genNumAleatorio(){
    sorteado = parseInt(Math.random() * dificuldade + 1);
    if(listaSorteada.includes(sorteado)){
        return genNumAleatorio()
    }
    tentativaTotal++;
    listaSorteada.push(sorteado);
    console.log(listaSorteada);
    return sorteado;
}

// Função que "apaga" da caixa o número que o usuário tenha chutado.
function cleanConsole(){
    chute = document.querySelector('input');
    chute.value = '';
}

// Função que desabilita um botão e reabilita o outro. 
// boo = true para habilitar o botão de "Novo Jogo"; e
// boo = false para habilitar o botão de "Chutar".
function disabledBotton(boo = true){   
    if(boo == false){
        document.getElementById('reiniciar').setAttribute('disabled', true);
        document.getElementById('chutar').removeAttribute('disabled');
        return;
    }
    document.getElementById('reiniciar').removeAttribute('disabled');
    document.getElementById('chutar').setAttribute('disabled', true);
}

// Função que muda a tela para a de início.
function inicio(){
    editarTxt('h1', 'Jogo do Nº Secreto');
    editarTxt('p', `Escolha um número entre 1 a ${dificuldade}`);
    
    numAleatorio = genNumAleatorio();
    tentativa = 0;
}


// Parte principal do código
let dificuldade = 10
let tentativa = 0;
let tentativaTotal = 1;
let numAleatorio = 0;
let listaSorteada = [0];
inicio();


// Função chamada quando o botão "Chute" é clicado.
// Verifica se o número chutado é igual, menor ou maior que o sorteado.
function verificarChute(){
    let chute = document.querySelector('input').value;
    let wordTentativa = tentativa > 1 ? 'tentativas' : 'tentativa';


    tentativa++;
    if(chute == numAleatorio){
        disabledBotton(true);
        if(listaSorteada.length >= dificuldade){
            listaSorteada = [0];
            editarTxt('h1', `Parabéns! \nVocê chegou o fim do jogo com ${tentativaTotal} tentativas totais!`);
            editarTxt('p', 'Clique em "Novo Jogo" pra reiniciar.');
            tentativaTotal = 1;
            cleanConsole()
            return;
        }

        editarTxt('h1', 'Parabéns!');
        editarTxt('p', `Você descobriu o número com ${tentativa} ${wordTentativa}.`);
    }
    if(chute < numAleatorio){
        editarTxt('p', `O número é maior que ${chute}.`);
    }
    if(chute > numAleatorio){
        editarTxt('p', `O número é menor que ${chute}.`);
    }
    cleanConsole();
}

// Função ativada quando o botão "Novo Jogo" é apertado.
function verificarNovoJogo(){
    disabledBotton(false);
    inicio();
}

