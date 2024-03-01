package net.perfectdreams.discordinteraktions.common.modals.components

public data class ComponentReference<T>(
    val components: ModalComponents,
    val customId: String,
    val required: Boolean
)