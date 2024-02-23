package dev.tsblock.BlockHunt;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.util.HashMap;

public class LocationYaml {
    public static HashMap<Object, Object> fromLocation(Location location) {
        String world = location.getWorld().getName();
        double x = location.getBlockX();
        double z = location.getBlockY();
        double y = location.getBlockZ();
        HashMap<Object, Object> map = new HashMap<>();
        map.put("world", world);
        map.put("x", x);
        map.put("y", y);
        map.put("z", z);
        return map;
    }

    public static Location fromMap(HashMap<Object, Object> map) {
        return new Location(
                Bukkit.getWorld((String) map.get("world")),
                (double) map.get("x"),
                (double) map.get("y"),
                (double) map.get("z")
        );
    }
}
