package net.perfectdreams.discordinteraktions.common.components

import dev.kord.common.entity.DiscordInteraction
import dev.kord.common.entity.Snowflake
import dev.kord.core.entity.Member
import dev.kord.core.entity.User
import net.perfectdreams.discordinteraktions.common.requests.RequestBridge
import net.perfectdreams.discordinteraktions.common.entities.messages.Message
import net.perfectdreams.discordinteraktions.common.interactions.InteractionData

open class GuildComponentContext(
    bridge: RequestBridge,
    sender: User,
    channelId: Snowflake,
    declaration: ComponentExecutorDeclaration,
    message: Message,
    dataOrNull: String?,
    interactionData: InteractionData,
    discordInteractionData: DiscordInteraction,
    val guildId: Snowflake,
    val member: Member
) : ComponentContext(bridge, sender, channelId, declaration, message, dataOrNull, interactionData, discordInteractionData) {
    val appPermissions = discordInteractionData.appPermissions.value ?: error("App Permissions field is null on a Guild Interaction! Bug?")
}