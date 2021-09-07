package fr.torvald.manHunt.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class PutBlockEvent implements Listener {
    @EventHandler
    public void onBlockPut(BlockPlaceEvent event) {
        event.setCancelled(true);
    }
}
