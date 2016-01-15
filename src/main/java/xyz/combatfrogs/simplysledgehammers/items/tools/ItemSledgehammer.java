package xyz.combatfrogs.simplysledgehammers.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;
import xyz.combatfrogs.simplysledgehammers.Reference;

/**
 * Created by CombatFrogs on 1/12/2016.
 */
public final class ItemSledgehammer extends ItemPickaxe {
    public ItemSledgehammer(ToolMaterial material) {
        super(material);
        setUnlocalizedName(Reference.MODID + "_hammer_" + toolMaterial.name().toLowerCase());
        setRegistryName("hammer_" + toolMaterial.name().toLowerCase());
        setCreativeTab(CreativeTabs.tabTools);
    }
}
