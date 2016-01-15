package xyz.combatfrogs.simplysledgehammers.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import xyz.combatfrogs.simplysledgehammers.Reference;

import java.util.List;

/**
 * Created by CombatFrogs on 1/14/2016.
 */
public class ItemOreChunk extends Item {

    public static final int IRON_DAMAGE = 0;
    public static final int GOLD_DAMAGE = 1;
    public static final int COPPER_DAMAGE = 2;
    public static final int TIN_DAMAGE = 3;
    public static final int NICKEL_DAMAGE = 4;
    public static final int LEAD_DAMAGE = 5;
    public static final int SILVER_DAMAGE = 6;

    public static final String[] UNLOCALIZED_NAMES = {
            "_iron",
            "_gold",
            "_copper",
            "_tin",
            "_nickel",
            "_lead",
            "_silver",
    };

    public ItemOreChunk() {
        setUnlocalizedName(Reference.MODID + "_ore_chunk");
        setRegistryName("ore_chunk");
        setHasSubtypes(true);
        setCreativeTab(CreativeTabs.tabMaterials);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack) {
        if (itemStack.getItemDamage() > SILVER_DAMAGE) {
            return getUnlocalizedName() + "_unimplemented";
        }

        return getUnlocalizedName() + UNLOCALIZED_NAMES[itemStack.getItemDamage()];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(Item item, CreativeTabs creativeTabs, List<ItemStack> itemList)
    {
        for (int i = IRON_DAMAGE; i <= SILVER_DAMAGE; i++)
        {
            ItemStack itemstack = new ItemStack(this, 1, i);
            itemList.add(itemstack);
        }
    }
}
