package me.lucyn.antiendermanghastgrief;

import me.lucyn.antiendermanghastgrief.listeners.EndermanListener;
import me.lucyn.antiendermanghastgrief.listeners.GhastListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiEndermanGhastGrief extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new GhastListener(), this);

        getServer().getPluginManager().registerEvents(new EndermanListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
