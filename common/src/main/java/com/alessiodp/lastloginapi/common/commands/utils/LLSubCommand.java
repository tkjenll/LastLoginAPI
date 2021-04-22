package com.alessiodp.lastloginapi.common.commands.utils;

import com.alessiodp.core.common.ADPPlugin;
import com.alessiodp.core.common.commands.list.ADPCommand;
import com.alessiodp.core.common.commands.utils.ADPMainCommand;
import com.alessiodp.core.common.commands.utils.ADPPermission;
import com.alessiodp.core.common.commands.utils.ADPSubCommand;
import com.alessiodp.core.common.user.User;
import com.alessiodp.lastloginapi.common.players.objects.LLPlayerImpl;
import lombok.NonNull;

public abstract class LLSubCommand extends ADPSubCommand  {
	public LLSubCommand(@NonNull ADPPlugin plugin, @NonNull ADPMainCommand mainCommand, @NonNull ADPCommand command, @NonNull ADPPermission permission, @NonNull String commandName, boolean executableByConsole) {
		super(plugin, mainCommand, command, permission, commandName, executableByConsole);
	}
	
	public void sendMessage(User receiver, LLPlayerImpl playerReceiver, String message) {
		if (receiver.isPlayer())
			playerReceiver.sendMessage(message);
		else
			receiver.sendMessage(message, true);
	}
}
