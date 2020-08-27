package me.tsblock.BlockHunt.Arena;

import me.tsblock.BlockHunt.LocationYaml;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArenaManager {
    public HashMap<String, Arena> arenas = new HashMap<>();

    private static void loadArenas() {
        FileConfiguration config = ArenaConfig.getInstance();
        Set<String> keys = config.getKeys(false);

    }

    private static void saveArenaToConfig(Arena arena) {
        FileConfiguration config = ArenaConfig.getInstance();
        String prefix = arena.getName() + ".";
        Location hidersSpawn = arena.getHidersSpawn();
        Location huntersSpawn = arena.getHuntersSpawn();
        Location lobby = arena.getLobby();
        List<Material> allowedBlocks = arena.getAllowedBlocks();
        config.set(prefix + "name", arena.getName());
        config.set(prefix + "hidersSpawn", LocationYaml.fromLocation(hidersSpawn));
        config.set(prefix + "huntersSpawn", LocationYaml.fromLocation(huntersSpawn));
        config.set(prefix + "lobby", LocationYaml.fromLocation(lobby));
        // Allowed blocks
        config.set(prefix + "allowedblocks", allowedBlocks);
        ArenaConfig.save();
    }
}
