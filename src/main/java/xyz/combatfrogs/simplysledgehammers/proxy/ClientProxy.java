package xyz.combatfrogs.simplysledgehammers.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.combatfrogs.simplysledgehammers.ModRendering;

/**
 * Created by CombatFrogs on 1/13/2016.
 */
public class ClientProxy extends ServerProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        ModRendering.init();
    }
}
