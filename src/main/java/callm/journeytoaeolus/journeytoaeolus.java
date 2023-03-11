package callm.journeytoaeolus;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class journeytoaeolus implements ModInitializer {

	public static final String MOD_ID = "journey-to-aeolus";

	public static final Logger LOGGER = LoggerFactory.getLogger("journey-to-aeolus");

	@Override
	public void onInitialize() {


		LOGGER.info("Hello Fabric world!");
	}
}