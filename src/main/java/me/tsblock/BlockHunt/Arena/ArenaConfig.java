package me.tsblock.BlockHunt.Arena;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class ArenaConfig {
    private static File file;
    private static FileConfiguration arenaConfig;

    public static void setup() {
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("BlockHunt").getDataFolder(), "arenas.yml");

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        arenaConfig = YamlConfiguration.loadConfiguration(file);
    }

    public static FileConfiguration getInstance() {
        return arenaConfig;
    }

    public static void save() {
        try {
            arenaConfig.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void reload() {
        arenaConfig = YamlConfiguration.loadConfiguration(file);
    }
}
