package Projeto_campo_minado

import java.util.Random

enum class TabuleiroEvento{VITORIA, DERROTA}

class Tabuleiro(val qt_minas: Int, val qt_linhas: Int, val qt_colunas: Int) {
    private val campos = ArrayList<ArrayList<Campo>>()
    private val callbacks = ArrayList<(TabuleiroEvento) -> Unit>()

    init {
        gerar_campos()
        associar_vizinhos()
        sortear_minas()
    }
    private fun gerar_campos(){
        for (linha in 0 until qt_linhas) {
            campos.add(ArrayList())
            for (coluna in 0 until qt_colunas){
                val novo_campo = Campo(linha, coluna)
                novo_campo.on_evento(this::verificar_derrota_ou_vitoria)
                campos[linha].add(novo_campo)
            }
        }
    }
    private fun associar_vizinhos(){
        for_each_campo { associar_vizinhos(it) }
    }
    private fun associar_vizinhos(campo: Campo){
        val (linha, coluna) = campo
        val linhas = arrayOf(linha -1, linha, linha + 1)
        val colunas = arrayOf(coluna -1, coluna, coluna +1)

        linhas.forEach { l->
            colunas.forEach { c->
                val atual = campos.getOrNull(l)?.getOrNull(c)
                atual?.takeIf {campo != it}?.let {campo.add_vizinho(it)}
            }
        }
    }
    private fun sortear_minas(){
        val gerador = Random()

        var linha_sorteada = -1
        var coluna_sorteada = -1
        var qt_de_minas_atual = 0

        while(qt_de_minas_atual < this.qt_minas) {
            linha_sorteada = gerador.nextInt(qt_linhas)
            coluna_sorteada = gerador.nextInt(qt_colunas)

            val campo_sorteado = campos[linha_sorteada][coluna_sorteada]
            if (campo_sorteado.seguro) {
                campo_sorteado.minar()
                qt_de_minas_atual++
            }
        }

    }
    private fun objetivo_alcancado(): Boolean {
        var jogador_ganhou: Boolean = true
        for_each_campo { if(!it.objetivo_alcancado) jogador_ganhou = false }
        return jogador_ganhou
    }
    fun verificar_derrota_ou_vitoria(campo: Campo, evento: CampoEvento){
        if (evento == CampoEvento.EXPLOSAO) {
            callbacks.forEach { it(TabuleiroEvento.DERROTA) }
        } else if (objetivo_alcancado()) {
            callbacks.forEach { it(TabuleiroEvento.VITORIA) }
        }
    }

    fun for_each_campo(callback: (Campo) -> Unit){
        campos.forEach { linha -> linha.forEach(callback) }
    }
    fun onEvento(callback: (TabuleiroEvento) -> Unit){
        callbacks.add(callback)
    }
    fun reinicializar() {
        for_each_campo { it.reinicializar() }
        sortear_minas()
    }
}