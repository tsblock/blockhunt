package dev.tsblock.BlockHunt;

import me.libraryaddict.disguise.DisguiseAPI;
import me.libraryaddict.disguise.disguisetypes.DisguiseType;
import me.libraryaddict.disguise.disguisetypes.MiscDisguise;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class DisguiseManager {
    public static void setDisguiseBlock(Player player, Material material) {
        MiscDisguise disguiseBlock = new MiscDisguise(DisguiseType.FALLING_BLOCK, material, 0);
        DisguiseAPI.disguiseEntity(player, disguiseBlock);
    }

    public static void removeDisguiseBlock(Player player) {
        if (DisguiseAPI.isDisguised(player)) {
            DisguiseAPI.undisguiseToAll(player);
        }
    }
}
