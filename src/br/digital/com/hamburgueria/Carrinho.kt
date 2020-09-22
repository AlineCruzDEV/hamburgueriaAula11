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
        listaProdutos.forEach {
            total += it.preco
            println("produto ${it.nome} de preço ${it.preco} valor total $total")
        }
        return total
    }

}