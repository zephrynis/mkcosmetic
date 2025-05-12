package me.zephrynis.mkcosmetic.cosmetics;

import me.zephrynis.mkcosmetic.Mkcosmetic;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitTask;

public class MyFirstCosmetic extends Cosmetic {

    BukkitTask task;

    public MyFirstCosmetic(Player player) {
        super(player);
    }


    @Override
    public void start() {
        task = Bukkit.getServer().getScheduler().runTaskTimerAsynchronously(
                Mkcosmetic.getInstance(),
                () -> {
                    player.getWorld().spawnParticle(Particle.HEART, player.getLocation(), 10);
                },
                20L,
                0L
        );

        Location location = player.getLocation()
                .add(0, 2, 0);

        player.getWorld().spawnParticle(org.bukkit.Particle.HEART, location, 10);
    }

    @Override
    public void destroy() {
        task.cancel();
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Rank getRequiredRank() {
        return null;
    }

    @Override
    public Material getIcon() {
        return null;
    }
}
