package me.lucyn.antiendermanghastgrief.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class EndermanListener implements Listener {

    @EventHandler
    public void onBlockChange(org.bukkit.event.entity.EntityChangeBlockEvent event) {

        if (event.getEntity() instanceof org.bukkit.entity.Enderman) {
            event.setCancelled(true);
        }
    }

}
