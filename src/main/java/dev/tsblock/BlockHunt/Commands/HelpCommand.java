package dev.tsblock.BlockHunt.Commands;

import org.bukkit.command.CommandExecutor;

public class HelpCommand extends BaseCommand {
    public HelpCommand(String name, String description, String usage, boolean opOnly) {
        super("help", "Show a list of commands", "[command]", false);
    }

    @Override
    public void onExecute(CommandExecutor commandExecutor, String[] args) {

    }
}
