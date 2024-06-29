package me.lucyn.antiendermanghastgrief.listeners;

import org.bukkit.entity.Fireball;
import org.bukkit.entity.Ghast;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class GhastListener implements Listener {

    @EventHandler
    public void onProjectileLaunch(org.bukkit.event.entity.ProjectileLaunchEvent event) {
        if (event.getEntity().getShooter() instanceof Ghast && event.getEntity() instanceof Fireball) {

            Fireball fireball = (Fireball) event.getEntity();
            fireball.setYield(0);
        }
    }


}
