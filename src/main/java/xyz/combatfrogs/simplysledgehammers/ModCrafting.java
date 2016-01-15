package xyz.combatfrogs.simplysledgehammers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

/**
 * Created by CombatFrogs on 1/10/2016.
 */
public final class ModCrafting {

    private ModCrafting() { }

    public static void init() {
        initHammers();
        initChunksToIngots();
        initSmelting();
        initMisc();
    }

    private static void initHammers() {
        ItemStack stickStack = new ItemStack(Items.stick, 1);

        // SLEDGEHAMMERS
        GameRegistry.addRecipe(new ItemStack(ModItems.woodSledgehammer, 1),
                "xxx",
                "xyx",
                " y ",
                'x', new ItemStack(Blocks.planks, 1),
                'y', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.stoneSledgehammer, 1),
                "xxx",
                "xyx",
                " y ",
                'x', new ItemStack(Blocks.cobblestone, 1),
                'y', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.ironSledgehammer, 1),
                "xxx",
                "xyx",
                " y ",
                'x', new ItemStack(Items.iron_ingot, 1),
                'y', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.goldSledgehammer, 1),
                "xxx",
                "xyx",
                " y ",
                'x', new ItemStack(Items.gold_ingot, 1),
                'y', stickStack);
        GameRegistry.addRecipe(new ItemStack(ModItems.diamondSledgehammer, 1),
                "xxx",
                "xyx",
                " y ",
                'x', new ItemStack(Items.diamond, 1),
                'y', stickStack);
    }

    private static void initChunksToIngots() {
        ItemStack[][] craftingTuples = {
                {ModItems.unsmeltedIronIngot, ModItems.ironOreChunk},
                {ModItems.unsmeltedGoldIngot, ModItems.goldOreChunk},
                {ModItems.unsmeltedCopperIngot, ModItems.copperOreChunk},
                {ModItems.unsmeltedTinIngot, ModItems.tinOreChunk},
                {ModItems.unsmeltedNickelIngot, ModItems.nickelOreChunk},
                {ModItems.unsmeltedLeadIngot, ModItems.leadOreChunk},
                {ModItems.unsmeltedSilverIngot, ModItems.silverOreChunk},
        };

        for (ItemStack[] craftingTuple : craftingTuples) {
            GameRegistry.addShapelessRecipe(craftingTuple[0],
                    craftingTuple[1],
                    craftingTuple[1],
                    craftingTuple[1],
                    craftingTuple[1]);
        }
    }

    private static void initSmelting() {
        @SuppressWarnings("unchecked")
        Pair<String, ItemStack>[] smeltingList = new Pair[]{
                new ImmutablePair<String, ItemStack>("ingotIron", ModItems.unsmeltedIronIngot),
                new ImmutablePair<String, ItemStack>("ingotGold", ModItems.unsmeltedGoldIngot),
                new ImmutablePair<String, ItemStack>("ingotCopper", ModItems.unsmeltedCopperIngot),
                new ImmutablePair<String, ItemStack>("ingotTin", ModItems.unsmeltedTinIngot),
                new ImmutablePair<String, ItemStack>("ingotNickel", ModItems.unsmeltedNickelIngot),
                new ImmutablePair<String, ItemStack>("ingotLead", ModItems.unsmeltedLeadIngot),
                new ImmutablePair<String, ItemStack>("ingotSilver", ModItems.unsmeltedSilverIngot),
        };

        for (Pair<String, ItemStack> smeltingPair : smeltingList) {
            List<ItemStack> matchingIngots;
            if (!(matchingIngots = OreDictionary.getOres(smeltingPair.getLeft())).isEmpty()) {
                GameRegistry.addSmelting(smeltingPair.getRight(), matchingIngots.get(0), 0.0f);
            }
        }
    }

    private static void initMisc() {
        ItemStack cobblestonesStack = new ItemStack(ModItems.cobblestones, 1);
        GameRegistry.addRecipe(new ItemStack(Blocks.cobblestone, 1),
                "xxx",
                "xxx",
                "xxx",
                'x', cobblestonesStack);
    }
}
