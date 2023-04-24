package net.origamiking.mcmods.bettertrailsandtailsupdate;

import net.fabricmc.api.ModInitializer;
import net.origamiking.mcmods.bettertrailsandtailsupdate.items.ModItems;
import net.origamiking.mcmods.oapi.commands.CommandsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterTrailsandTailsUpdateMain implements ModInitializer {
	public static final String MOD_ID = "bettertrailsandtailsupdate";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final String VERSION = "0.0.1-1.20";
	public static final String NAME = "Better Trails and Tails Update " + VERSION;


	@Override
	public void onInitialize() {
		BetterTrailsandTailsUpdateMain.LOGGER.info("Starting " + NAME);
		ModItems.register();
		CommandsUtil.makeVersionCommand(MOD_ID, VERSION);
	}
}