package Projeto_campo_minado

import java.awt.event.MouseEvent
import java.awt.event.MouseListener

class MouseClickListener(
    private val campo: Campo,
    private val on_botao_esquerdo: (Campo) -> Unit,
    private val on_botao_direito: (Campo) -> Unit
) : MouseListener {

    override fun mousePressed(e: MouseEvent?) {
        when (e?.button) {
            MouseEvent.BUTTON1 -> on_botao_esquerdo(campo)
            MouseEvent.BUTTON3 -> on_botao_direito(campo)
        }
    }

    override fun mouseClicked(e: MouseEvent?) {}
    override fun mouseExited(e: MouseEvent?) {}
    override fun mouseEntered(e: MouseEvent?) {}
    override fun mouseReleased(e: MouseEvent?) {}
}