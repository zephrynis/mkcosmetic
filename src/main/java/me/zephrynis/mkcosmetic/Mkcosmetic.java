package me.zephrynis.mkcosmetic;

import org.bukkit.plugin.java.JavaPlugin;

public final class Mkcosmetic extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
