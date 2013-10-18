package net.rymate.bTimer;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;

/**
 * Created with IntelliJ IDEA.
 * User: Ryan
 * Date: 18/10/13
 * Time: 22:21
 * To change this template use File | Settings | File Templates.
 */
public class CommandTimer implements CommandExecutor, Listener {

    private final bTimer plugin;

    public CommandTimer(bTimer bTimer) {
        this.plugin = bTimer;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] arguments) {
        if (command.getName().equalsIgnoreCase("timer")) {
            if (!commandSender.hasPermission("bTimer.timer")) {
                commandSender.sendMessage(ChatColor.RED + "You haven't got the bTimer.timer permission!");
                return false;
            }
            if (arguments.length != 4) {
                commandSender.sendMessage(ChatColor.RED + "You appear to have used the command incorrectly!");
                commandSender.sendMessage(ChatColor.RED + "Remember, you must specify a timeframe, a player, and what you want to happen.");
                return false;
            }
        }
        return false;
    }
}
