// variaveis globais
let valor_total_no_carrinho = 0;
let quantidade_celular = 0;
let quantidade_fone = 0;
let quantidade_oculus = 0;
let quantidade_total_produtos_carrinho = 0;

// variável de mensagem
let nada_no_carrinho = `<section class="carrinho__produtos__produto"><span class="texto-azul"> Não há </span> produtos no carrinho </section>`;

// interface
let carrinho_lista = document.getElementById("lista-produtos");
let total_carrinho = document.getElementById("valor-total");
let quantidade_input = document.getElementById("quantidade");

carrinho_lista.innerHTML = nada_no_carrinho;
total_carrinho.innerHTML = `R$0`;


function adicionar(){
    // função para facilitar o output dos produtos
    function algoNoCarrinho(quantidade, nome_produto, valor_total_produto){
        let algo_no_carrinho = `<section class="carrinho__produtos__produto"><span class="texto-azul">${quantidade}x</span> ${nome_produto} <span class="texto-azul">R$${valor_total_produto}</span></section>`;
        
        if(quantidade > 0){
            if(carrinho_lista.innerHTML == nada_no_carrinho){
                carrinho_lista.innerHTML = algo_no_carrinho;
                return;
            }
            carrinho_lista.innerHTML += algo_no_carrinho;
        }
    }


    // acessando tags html
    let produto = document.getElementById("produto").value;
    let quantidade = parseInt(document.getElementById("quantidade").value);
    quantidade = quantidade > 1 ? quantidade : 1;

    // definindo o tipo do produto
    let produto_nome = produto.split(" -")[0];
    let produto_valor = produto.split("R$")[1];
    let valor_total_do_pedido = produto_valor * quantidade;

    // adicionando no carrinho
    switch(produto_nome){
        case "Celular":
            quantidade_celular += quantidade;
            break;
        case "Fone de ouvido":
            quantidade_fone += quantidade;
            break;
        case "Oculus VR":
            quantidade_oculus += quantidade;
            break;
    }

    quantidade_total_produtos_carrinho = quantidade_celular + quantidade_fone + quantidade_oculus;

    // calcular valor total do carrinho
    valor_total_no_carrinho += valor_total_do_pedido;
    total_carrinho.innerHTML = valor_total_no_carrinho;
    
    // mudando interface
    algoNoCarrinho(quantidade, produto_nome, valor_total_do_pedido);
}

function limpar(){
    // limpar carrinho
    valor_total_no_carrinho = 0;    
    quantidade_celular = 0;
    quantidade_fone = 0;
    quantidade_oculus = 0;
    quantidade_total_produtos_carrinho = 0;

    // mudar interface
    carrinho_lista.innerHTML = nada_no_carrinho;
    total_carrinho.innerHTML = `R$0`;
}

