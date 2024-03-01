package net.perfectdreams.discordinteraktions.platforms.kord.entities.messages

import dev.kord.common.entity.DiscordMessage
import dev.kord.common.entity.Snowflake
import dev.kord.core.Kord
import net.perfectdreams.discordinteraktions.common.builder.message.modify.InteractionOrFollowupMessageModifyBuilder
import net.perfectdreams.discordinteraktions.common.entities.messages.EditableMessage

public class KordEditedOriginalInteractionPublicMessage(
    kord: Kord,
    private val applicationId: Snowflake,
    private val interactionToken: String,
    data: DiscordMessage
) : KordPublicMessage(kord, data), EditableMessage {
    override suspend fun editMessage(message: InteractionOrFollowupMessageModifyBuilder): EditableMessage {
        val newMessage = kord.rest.interaction.modifyFollowupMessage(
            applicationId,
            interactionToken,
            this.data.id,
            message.toFollowupMessageModifyBuilder().toRequest()
        )

        return KordEditedOriginalInteractionPublicMessage(
            kord,
            applicationId,
            interactionToken,
            newMessage
        )
    }
}