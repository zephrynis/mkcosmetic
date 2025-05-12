package me.zephrynis.mkcosmetic;

import me.zephrynis.mkcosmetic.cosmetics.MyFirstCosmetic;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashMap;
import java.util.Map;

public class JoinListener implements Listener {
    private final Map<Player, MyFirstCosmetic> activeCosmetics = new HashMap<>();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        MyFirstCosmetic cosmetic = new MyFirstCosmetic(player);
        cosmetic.start();
        activeCosmetics.put(player, cosmetic);
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        MyFirstCosmetic cosmetic = activeCosmetics.remove(player);
        if (cosmetic != null) {
            cosmetic.destroy();
        }
    }
}
