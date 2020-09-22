package br.digital.com.hamburgueria

class Carrinho() {
    val listaProdutos = mutableListOf<Produto>()
    var total: Double = 0.0

    //adiciona produtos no carrinho
    fun adicionarProduto(vararg produtos: Produto){
        listaProdutos.addAll(produtos)
    }

    fun mostraCarrinho(){
        listaProdutos.forEach { println("Produto ${it.nome} - R$ ${it.preco} Adicionado ao carrinho")}
    }

    //calcula valor total do carrinho
    fun valorTotal(): Double{
        total = 0.0
        listaProdutos.forEach {
            total += it.preco
        }
        return total
    }

}