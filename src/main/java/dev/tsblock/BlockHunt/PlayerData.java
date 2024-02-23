package dev.tsblock.BlockHunt;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Material;

public class PlayerData {
    @Getter @Setter
    private int timeUntilSolid;
    @Getter @Setter
    private boolean solid;
    @Getter @Setter
    private Material disguiseBlock;
    @Getter @Setter
    private Team team;

    public PlayerData(int timeUntilSolid, boolean solid, Material disguiseBlock, Team team) {
        this.timeUntilSolid = timeUntilSolid;
        this.solid = solid;
        this.disguiseBlock = disguiseBlock;
        this.team = team;
    }
}
