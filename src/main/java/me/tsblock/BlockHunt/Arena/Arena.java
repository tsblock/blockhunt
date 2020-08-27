package me.tsblock.BlockHunt.Arena;

import lombok.Getter;
import lombok.Setter;
import me.tsblock.BlockHunt.GameState;
import me.tsblock.BlockHunt.PlayerData;
import org.bukkit.Location;
import org.bukkit.Material;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Arena {
    @Getter
    private final String name;
    @Getter @Setter
    private boolean enabled;
    @Getter @Setter
    private HashMap<UUID, PlayerData> players;
    @Getter
    private final Location hidersSpawn;
    @Getter
    private final Location huntersSpawn;
    @Getter
    private final Location lobby;
    @Getter @Setter
    private GameState gameState;
    @Getter @Setter
    private int timeUntilStart;
    @Getter @Setter
    private List<Material> allowedBlocks;

    public Arena(String name, boolean enabled, HashMap<UUID, PlayerData> players, Location hidersSpawn, Location huntersSpawn, Location lobby, GameState gameState, int timeUntilStart, List<Material> allowedBlocks) {
        this.name = name;
        this.enabled = enabled;
        this.players = players;
        this.hidersSpawn = hidersSpawn;
        this.huntersSpawn = huntersSpawn;
        this.lobby = lobby;
        this.gameState = gameState;
        this.timeUntilStart = timeUntilStart;
        this.allowedBlocks = allowedBlocks;
    }
}
