package me.tsblock.BlockHunt;

import me.tsblock.BlockHunt.Arena.ArenaConfig;
import me.tsblock.BlockHunt.Commands.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockHuntPlugin extends JavaPlugin {
    private static BlockHuntPlugin instance;
    @Override
    public void onEnable() {
        ArenaConfig.setup();
        new CommandManager(this);
        setInstance(this);
    }

    @Override
    public void onDisable() {
        ArenaConfig.save();
    }

    public static BlockHuntPlugin getInstance() {
        return instance;
    }

    private static void setInstance(BlockHuntPlugin instance) {
        BlockHuntPlugin.instance = instance;
    }

    private void registerListeners() {

    }
}
