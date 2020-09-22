package br.digital.com.hamburgueria

fun main() {
    val carrinho = Carrinho()
    val produto1 = Produto("coca 350ml", 4.50)
    val produto2 = Produto("coca 600ml", 7.0)
    val produto3 = Produto("the force", 18.50)
    val produto4 = Produto("sor Davos", 22.50)
    val produto5 = Produto("hidromel", 6.0)

    println("\n\tBem vindo a HAMBURGUERIA\n")

    carrinho.adicionarProduto(produto3, produto1, produto5)

    carrinho.mostraCarrinho()
    println("\nVAlor Total da compra: ${carrinho.valorTotal()}\n\n")

    println("----------------------------\n")

    val comboStarWar = ComboSimples("Combo Star Wars", 0.0)
    comboStarWar.adicionarItem(produto3,produto2)

    val comboGot = ComboSimples("Combo GOT", 0.0)
    comboGot.adicionarItem(produto4,produto1)

    carrinho.adicionarProduto(comboStarWar, comboGot)

    carrinho.mostraCarrinho()
    println("\nVAlor Total da compra: ${carrinho.valorTotal()}\n\n")

    println("----------------------------\n")

    val comboFamilia = ComboFamiliar("Combo Familia", 0.0)
    comboFamilia.adicionarCombo(comboGot, comboStarWar)

    carrinho.adicionarProduto(comboFamilia)

    carrinho.mostraCarrinho()
    println("\nVAlor Total da compra: ${carrinho.valorTotal()}\n\n")

    println("----------------------------")

}