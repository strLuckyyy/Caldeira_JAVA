function game(numSecreto){
    alert('BOAS VINDAS AO JOGO DO NUMERO SECRETO');

    let tentativas = 0;
    let loop = true;

    while(loop){
        let palpite = prompt('Qual o numero? ');
        tentativas++;
        
        if(palpite == numSecreto){
            break;
        }
        if(palpite > numSecreto){
            alert('O numero secreto é menor que este');
        }
        if(palpite < numSecreto){
            alert('O numero secreto é maior que este');
        }
    }

    let wordTentaiva = tentativas > 1 ? 'tentativas' : 'tentativa';
    alert(`Parabéns, você acertou com ${tentativas} ${wordTentaiva}! A resposta é o número ${numeroSecreto}`);

}


let numeroSecreto = parseInt(Math.random(0, 100) * 100);
game(numeroSecreto)

let decisao = prompt('Deseja jogar novamente? S/N')

if(decisao == 'S'){
    game(numeroSecreto)
}
