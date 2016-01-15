package xyz.combatfrogs.simplysledgehammers.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import xyz.combatfrogs.simplysledgehammers.ModCrafting;
import xyz.combatfrogs.simplysledgehammers.ModItems;

/**
 * Created by CombatFrogs on 1/13/2016.
 */
public class ServerProxy  {
    public void preInit(FMLPreInitializationEvent e) {
        ModItems.init();
        ModCrafting.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
