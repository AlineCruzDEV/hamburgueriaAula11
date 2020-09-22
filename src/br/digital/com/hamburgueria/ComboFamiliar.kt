package br.digital.com.hamburgueria

class ComboFamiliar (nome: String, preco: Double) : Produto(nome, preco) {
    val listaCombos = mutableListOf<ComboSimples>()
    override var preco: Double = 0.0

    fun adicionarCombo(vararg combos: ComboSimples){
        listaCombos.addAll(combos)
        listaCombos.forEach {
            //println("Combo ${it.nome} - R$ ${it.preco} Adicionado ao Combo $nome")
            preco += it.preco
        }
    }
}