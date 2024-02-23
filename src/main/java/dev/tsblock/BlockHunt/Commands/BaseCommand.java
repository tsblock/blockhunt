package dev.tsblock.BlockHunt.Commands;

import org.bukkit.command.CommandExecutor;

public abstract class BaseCommand {
    private static BaseCommand instance;
    public final String name;
    public final String description;
    public final String usage;
    public final boolean opOnly;

    public BaseCommand(String name, String description, String usage, boolean opOnly) {
        this.name = name;
        this.description = description;
        this.usage = usage;
        this.opOnly = opOnly;
    }

    public static BaseCommand getInstance() {
        return instance;
    }

    private static void setInstance(BaseCommand instance) {
        BaseCommand.instance = instance;
    }

    public abstract void onExecute(final CommandExecutor commandExecutor, final String[] args);
}
