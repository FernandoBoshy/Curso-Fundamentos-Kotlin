package Projeto_campo_minado

import javax.swing.JFrame
import javax.swing.JOptionPane
import javax.swing.SwingUtilities

fun main(args: Array<String>){
    TelaPrincipal()
}

class TelaPrincipal : JFrame() {
    private val tabuleiro = Tabuleiro(qt_linhas = 16, qt_colunas = 30, qt_minas = 89)
    private val painel_tabuleiro = PainelTabuleiro(tabuleiro)

    init {
        tabuleiro.onEvento(this::mostrarResultado )
        add(painel_tabuleiro)

        setSize(690, 438)
        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE
        title = "CAMPO MINADO"
        isVisible = true

    }
    private fun mostrarResultado(evento: TabuleiroEvento) {
        SwingUtilities.invokeLater {
            val msg = when(evento) {
                TabuleiroEvento.VITORIA -> "Você Venceu!!!"
                TabuleiroEvento.DERROTA -> "Você Perdeu..."
            }
            JOptionPane.showMessageDialog(this, msg)
            tabuleiro.reinicializar()
            painel_tabuleiro.repaint()
            painel_tabuleiro.validate()
        }
    }
}