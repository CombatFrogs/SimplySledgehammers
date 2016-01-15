package xyz.combatfrogs.simplysledgehammers;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
import xyz.combatfrogs.simplysledgehammers.events.ItemSledgehammerEvents;
import xyz.combatfrogs.simplysledgehammers.proxy.ServerProxy;

/**
 * Created by CombatFrogs on 1/13/2016.
 */
@Mod(modid = Reference.MODID, name = Reference.MODNAME, dependencies = "required-after:Forge@[11.15.0.1671,)", useMetadata = true)
public class SimplySledgehammersMod {

    // SimplySledgehammersMod.ClientProxy
    @SidedProxy(
            clientSide="xyz.combatfrogs.simplysledgehammers.proxy.ClientProxy",
            serverSide="xyz.combatfrogs.simplysledgehammers.proxy.ServerProxy")
    public static ServerProxy proxy;

    @Mod.Instance
    public static SimplySledgehammersMod instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
        MinecraftForge.EVENT_BUS.register(new ItemSledgehammerEvents());
    }


}