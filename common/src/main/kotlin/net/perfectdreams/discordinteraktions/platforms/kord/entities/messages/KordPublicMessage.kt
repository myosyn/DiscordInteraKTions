package net.perfectdreams.discordinteraktions.platforms.kord.entities.messages

import dev.kord.common.entity.DiscordMessage
import dev.kord.core.Kord

public open class KordPublicMessage(kord: Kord, data: DiscordMessage) : KordMessage(kord, data)