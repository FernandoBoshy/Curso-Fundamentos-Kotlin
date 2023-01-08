package Projeto_campo_minado

import java.awt.Color
import java.awt.Font
import javax.swing.BorderFactory
import javax.swing.JButton
import javax.swing.SwingUtilities

private val COR_BG_NORMAL = Color(184, 184, 184)
private val COR_BG_MARCACAO = Color(8, 179, 247)
private val COR_BG_EXPLOSAO = Color(189, 66, 68)
private val COR_TXT = Color(0, 100, 0)

class BotaoCampo(private val campo: Campo): JButton() {

    init {
        font = font.deriveFont(Font.BOLD)
        background = COR_BG_NORMAL
        isOpaque = true
        border = BorderFactory.createBevelBorder(0)
        addMouseListener(MouseClickListener(campo, {it.abrir()}, {it.alterar_marcacao()}))

        campo.on_evento(this::aplicar_estilo)
    }
    private fun aplicar_estilo(campo: Campo, evento: CampoEvento) {
        when(evento) {
            CampoEvento.EXPLOSAO -> aplicar_estilo_explodido()
            CampoEvento.ABERTURA -> aplicar_estilo_aberto()
            CampoEvento.MARCACAO -> aplicar_estilo_marcado()
            else -> aplicar_estilo_padrao()
        }

        SwingUtilities.invokeLater {
            repaint()
            validate()
        }
    }
    private fun aplicar_estilo_explodido() {
        background = COR_BG_EXPLOSAO
        text = "X"
    }
    private fun aplicar_estilo_aberto() {
        background = COR_BG_NORMAL
        border = BorderFactory.createLineBorder(Color.GRAY)
        foreground = when(campo.qt_vizinhos) {
            1 -> COR_TXT
            2 -> Color.BLUE
            3 -> Color.YELLOW
            4, 5, 6 -> Color.RED
            else -> Color.PINK
        }
        text = if(campo.qt_vizinhos > 0) campo.qt_vizinhos.toString() else ""
    }
    private fun aplicar_estilo_marcado() {
        background = COR_BG_MARCACAO
        foreground = Color.BLACK
        text = "M"
    }
    private fun aplicar_estilo_padrao() {
        background = COR_BG_NORMAL
        border = BorderFactory.createBevelBorder(0)
        text = ""
    }

}