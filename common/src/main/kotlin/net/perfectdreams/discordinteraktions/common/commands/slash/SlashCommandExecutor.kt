package net.perfectdreams.discordinteraktions.common.commands.slash

import net.perfectdreams.discordinteraktions.common.commands.application.ApplicationCommandExecutor
import net.perfectdreams.discordinteraktions.common.commands.interaction.InteractionCommandExecutor
import net.perfectdreams.discordinteraktions.common.context.commands.ChatCommandArguments
import net.perfectdreams.discordinteraktions.common.context.commands.ApplicationCommandContext

/**
 * This is the class that should be inherited if you
 * want to create an Slash Command.
 */
abstract class SlashCommandExecutor : InteractionCommandExecutor() {
    abstract suspend fun execute(context: ApplicationCommandContext, args: ChatCommandArguments)
}