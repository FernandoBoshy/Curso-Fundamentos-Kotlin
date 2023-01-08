package Projeto_campo_minado

import java.awt.GridLayout
import javax.swing.JPanel

class PainelTabuleiro (tabuleiro: Tabuleiro) : JPanel() {
    init {
        layout = GridLayout(tabuleiro.qt_linhas, tabuleiro.qt_colunas)
        tabuleiro.for_each_campo { campo ->
            val botao = BotaoCampo(campo)
            add(botao)
        }
    }
}