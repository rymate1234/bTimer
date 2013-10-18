package net.rymate.bTimer;

import me.tommycake50.countdownlib.Countdown;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Look, a main class!
 *
 * @author Ryan
 */
public class bTimer extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        CommandTimer ct;
        getCommand("timer").setExecutor(ct = new CommandTimer(this));
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}
