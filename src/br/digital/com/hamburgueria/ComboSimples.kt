package br.digital.com.hamburgueria

class ComboSimples (nome: String, preco: Double) : Produto(nome, preco){
    override var preco: Double = 0.0
    var desconto = 0.1
    val listaProd = mutableListOf<Produto>()

    fun adicionarItem(vararg produto: Produto){
        listaProd.addAll(produto)
        listaProd.forEach {
           // println("Produto ${it.nome} - R$ ${it.preco} Adicionado ao combo $nome")
            preco += (it.preco - (it.preco * desconto))
        }
    }
}
