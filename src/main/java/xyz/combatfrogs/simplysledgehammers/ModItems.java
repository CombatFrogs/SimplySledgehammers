package xyz.combatfrogs.simplysledgehammers;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import xyz.combatfrogs.simplysledgehammers.items.ItemOreChunk;
import xyz.combatfrogs.simplysledgehammers.items.ItemUnsmeltedIngot;
import xyz.combatfrogs.simplysledgehammers.items.tools.ItemSledgehammer;

/**
 * Created by CombatFrogs on 1/10/2016.
 */
public final class ModItems {

    private ModItems() { }

    public static ItemSledgehammer woodSledgehammer;
    public static ItemSledgehammer stoneSledgehammer;
    public static ItemSledgehammer ironSledgehammer;
    public static ItemSledgehammer goldSledgehammer;
    public static ItemSledgehammer diamondSledgehammer;

    // CRAFTING MATERIALS
    public static Item cobblestones;

    public static ItemUnsmeltedIngot unsmeltedIngot;
    public static ItemStack unsmeltedIronIngot;
    public static ItemStack unsmeltedGoldIngot;
    public static ItemStack unsmeltedCopperIngot;
    public static ItemStack unsmeltedTinIngot;
    public static ItemStack unsmeltedNickelIngot;
    public static ItemStack unsmeltedLeadIngot;
    public static ItemStack unsmeltedSilverIngot;


    public static ItemOreChunk oreChunk;
    public static ItemStack ironOreChunk;
    public static ItemStack goldOreChunk;
    public static ItemStack copperOreChunk;
    public static ItemStack tinOreChunk;
    public static ItemStack nickelOreChunk;
    public static ItemStack leadOreChunk;
    public static ItemStack silverOreChunk;

    public static void init() {
        initHammers();
        initOreChunks();
        initUnsmeltedIngots();
        initMisc();
    }

    private static void initHammers() {
        woodSledgehammer = new ItemSledgehammer(Item.ToolMaterial.WOOD);
        GameRegistry.registerItem(woodSledgehammer);
        stoneSledgehammer = new ItemSledgehammer(Item.ToolMaterial.STONE);
        GameRegistry.registerItem(stoneSledgehammer);
        ironSledgehammer = new ItemSledgehammer(Item.ToolMaterial.IRON);
        GameRegistry.registerItem(ironSledgehammer);
        goldSledgehammer = new ItemSledgehammer(Item.ToolMaterial.GOLD);
        GameRegistry.registerItem(goldSledgehammer);
        diamondSledgehammer = new ItemSledgehammer(Item.ToolMaterial.EMERALD);
        GameRegistry.registerItem(diamondSledgehammer);
    }

    private static void initOreChunks() {
        oreChunk = new ItemOreChunk();
        GameRegistry.registerItem(oreChunk);

        ironOreChunk = new ItemStack(oreChunk, 1, ItemOreChunk.IRON_DAMAGE);
        goldOreChunk = new ItemStack(oreChunk, 1, ItemOreChunk.GOLD_DAMAGE);
        copperOreChunk = new ItemStack(oreChunk, 1, ItemOreChunk.COPPER_DAMAGE);
        tinOreChunk = new ItemStack(oreChunk, 1, ItemOreChunk.TIN_DAMAGE);
        nickelOreChunk = new ItemStack(oreChunk, 1, ItemOreChunk.NICKEL_DAMAGE);
        leadOreChunk = new ItemStack(oreChunk, 1, ItemOreChunk.LEAD_DAMAGE);
        silverOreChunk = new ItemStack(oreChunk, 1, ItemOreChunk.SILVER_DAMAGE);
    }

    private static void initUnsmeltedIngots() {
        unsmeltedIngot = new ItemUnsmeltedIngot();
        GameRegistry.registerItem(unsmeltedIngot);

        unsmeltedIronIngot = new ItemStack(unsmeltedIngot, 1, ItemUnsmeltedIngot.IRON_DAMAGE);
        unsmeltedGoldIngot = new ItemStack(unsmeltedIngot, 1, ItemUnsmeltedIngot.GOLD_DAMAGE);
        unsmeltedCopperIngot = new ItemStack(unsmeltedIngot, 1, ItemUnsmeltedIngot.COPPER_DAMAGE);
        unsmeltedTinIngot = new ItemStack(unsmeltedIngot, 1, ItemUnsmeltedIngot.TIN_DAMAGE);
        unsmeltedNickelIngot = new ItemStack(unsmeltedIngot, 1, ItemUnsmeltedIngot.NICKEL_DAMAGE);
        unsmeltedLeadIngot = new ItemStack(unsmeltedIngot, 1, ItemUnsmeltedIngot.LEAD_DAMAGE);
        unsmeltedSilverIngot = new ItemStack(unsmeltedIngot, 1, ItemUnsmeltedIngot.SILVER_DAMAGE);
    }

    private static void initMisc() {
        cobblestones = new Item()
                .setUnlocalizedName(Reference.MODID + "_cobblestones")
                .setRegistryName("cobblestones")
                .setCreativeTab(CreativeTabs.tabMaterials);
        GameRegistry.registerItem(cobblestones);
    }
}