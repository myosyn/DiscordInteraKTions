package net.perfectdreams.discordinteraktions.common.modals

import net.perfectdreams.discordinteraktions.common.modals.components.ModalArguments

interface ModalSubmitExecutor {
    suspend fun onModalSubmit(context: ModalSubmitContext, modalArguments: ModalArguments)

    /**
     * Used by the [net.perfectdreams.discordinteraktions.common.modals.ModalSubmitExecutorDeclaration] to match declarations to executors.
     *
     * By default the class of the executor is used, but this may cause issues when using anonymous classes!
     *
     * To avoid this issue, you can replace the signature with another unique identifier
     */
    open fun signature(): Any = this::class
}