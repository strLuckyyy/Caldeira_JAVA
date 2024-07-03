function alterarStatus(id){
    let clicado = document.getElementById(`game-${id}`);

    let botao_on_click = clicado.querySelector("a");
    let botao_alugar = "dashboard__item__button";
    let botao_devolver = "dashboard__item__button dashboard__item__button--return";

    let imagem_jogo = clicado.querySelector("div");
    let imagem_on = "dashboard__item__img";
    let imagem_off = "dashboard__item__img dashboard__item__img--rented";

    if(botao_on_click.innerHTML == "Devolver"){
        botao_on_click.setAttribute("class", botao_alugar);
        botao_on_click.innerHTML = "Alugar";

        imagem_jogo.setAttribute("class", imagem_on);
        return;
    }

    botao_on_click.setAttribute("class", botao_devolver);
    botao_on_click.innerHTML = "Devolver";

    imagem_jogo.setAttribute("class", imagem_off);
}
