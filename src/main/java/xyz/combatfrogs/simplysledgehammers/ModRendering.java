package xyz.combatfrogs.simplysledgehammers;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import xyz.combatfrogs.simplysledgehammers.items.ItemOreChunk;
import xyz.combatfrogs.simplysledgehammers.items.ItemUnsmeltedIngot;

/**
 * Created by CombatFrogs on 1/14/2016.
 */
public final class ModRendering {

    private ModRendering() { }

    public static void init() {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        initHammers(renderItem);
        initOreChunks(renderItem);
        initUnsmeltedIngots(renderItem);
        initMisc(renderItem);

    }

    private static void initHammers(RenderItem renderItem) {
        renderItem.getItemModelMesher().register(ModItems.woodSledgehammer, 0,
                new ModelResourceLocation(Reference.MODID + ":hammer_wood", "inventory"));
        renderItem.getItemModelMesher().register(ModItems.stoneSledgehammer, 0,
                new ModelResourceLocation(Reference.MODID + ":hammer_stone", "inventory"));
        renderItem.getItemModelMesher().register(ModItems.ironSledgehammer, 0,
                new ModelResourceLocation(Reference.MODID + ":hammer_iron", "inventory"));
        renderItem.getItemModelMesher().register(ModItems.goldSledgehammer, 0,
                new ModelResourceLocation(Reference.MODID + ":hammer_gold", "inventory"));
        renderItem.getItemModelMesher().register(ModItems.diamondSledgehammer, 0,
                new ModelResourceLocation(Reference.MODID + ":hammer_emerald", "inventory"));
    }

    private static void initOreChunks(RenderItem renderItem) {
        ModelBakery.registerItemVariants(
                ModItems.oreChunk,
                new ResourceLocation(Reference.MODID + ":ore_chunk_iron"),
                new ResourceLocation(Reference.MODID + ":ore_chunk_gold"),
                new ResourceLocation(Reference.MODID + ":ore_chunk_copper"),
                new ResourceLocation(Reference.MODID + ":ore_chunk_tin"),
                new ResourceLocation(Reference.MODID + ":ore_chunk_nickel"),
                new ResourceLocation(Reference.MODID + ":ore_chunk_lead"),
                new ResourceLocation(Reference.MODID + ":ore_chunk_silver"));

        renderItem.getItemModelMesher().register(
                ModItems.oreChunk,
                ItemOreChunk.IRON_DAMAGE,
                new ModelResourceLocation(Reference.MODID + ":ore_chunk_iron", "inventory"));
        renderItem.getItemModelMesher().register(
                ModItems.oreChunk,
                ItemOreChunk.GOLD_DAMAGE,
                new ModelResourceLocation(Reference.MODID + ":ore_chunk_gold", "inventory"));
        renderItem.getItemModelMesher().register(
                ModItems.oreChunk,
                ItemOreChunk.COPPER_DAMAGE,
                new ModelResourceLocation(Reference.MODID + ":ore_chunk_copper", "inventory"));
        renderItem.getItemModelMesher().register(
                ModItems.oreChunk,
                ItemOreChunk.TIN_DAMAGE,
                new ModelResourceLocation(Reference.MODID + ":ore_chunk_tin", "inventory"));
        renderItem.getItemModelMesher().register(
                ModItems.oreChunk,
                ItemOreChunk.NICKEL_DAMAGE,
                new ModelResourceLocation(Reference.MODID + ":ore_chunk_nickel", "inventory"));
        renderItem.getItemModelMesher().register(
                ModItems.oreChunk,
                ItemOreChunk.LEAD_DAMAGE,
                new ModelResourceLocation(Reference.MODID + ":ore_chunk_lead", "inventory"));
        renderItem.getItemModelMesher().register(
                ModItems.oreChunk,
                ItemOreChunk.SILVER_DAMAGE,
                new ModelResourceLocation(Reference.MODID + ":ore_chunk_silver", "inventory"));
    }

    private static void initUnsmeltedIngots(RenderItem renderItem) {
        ModelBakery.registerItemVariants(
                ModItems.unsmeltedIngot,
                new ResourceLocation(Reference.MODID + ":unsmelted_ingot_iron"),
                new ResourceLocation(Reference.MODID + ":unsmelted_ingot_gold"),
                new ResourceLocation(Reference.MODID + ":unsmelted_ingot_copper"),
                new ResourceLocation(Reference.MODID + ":unsmelted_ingot_tin"),
                new ResourceLocation(Reference.MODID + ":unsmelted_ingot_nickel"),
                new ResourceLocation(Reference.MODID + ":unsmelted_ingot_lead"),
                new ResourceLocation(Reference.MODID + ":unsmelted_ingot_silver"));
        renderItem.getItemModelMesher().register(
                ModItems.unsmeltedIngot,
                ItemUnsmeltedIngot.IRON_DAMAGE,
                new ModelResourceLocation(Reference.MODID + ":unsmelted_ingot_iron", "inventory"));
        renderItem.getItemModelMesher().register(
                ModItems.unsmeltedIngot,
                ItemUnsmeltedIngot.GOLD_DAMAGE,
                new ModelResourceLocation(Reference.MODID + ":unsmelted_ingot_gold", "inventory"));
        renderItem.getItemModelMesher().register(
                ModItems.unsmeltedIngot,
                ItemUnsmeltedIngot.COPPER_DAMAGE,
                new ModelResourceLocation(Reference.MODID + ":unsmelted_ingot_copper", "inventory"));
        renderItem.getItemModelMesher().register(
                ModItems.unsmeltedIngot,
                ItemUnsmeltedIngot.TIN_DAMAGE,
                new ModelResourceLocation(Reference.MODID + ":unsmelted_ingot_tin", "inventory"));
        renderItem.getItemModelMesher().register(
                ModItems.unsmeltedIngot,
                ItemUnsmeltedIngot.NICKEL_DAMAGE,
                new ModelResourceLocation(Reference.MODID + ":unsmelted_ingot_nickel", "inventory"));
        renderItem.getItemModelMesher().register(
                ModItems.unsmeltedIngot,
                ItemUnsmeltedIngot.LEAD_DAMAGE,
                new ModelResourceLocation(Reference.MODID + ":unsmelted_ingot_lead", "inventory"));
        renderItem.getItemModelMesher().register(
                ModItems.unsmeltedIngot,
                ItemUnsmeltedIngot.SILVER_DAMAGE,
                new ModelResourceLocation(Reference.MODID + ":unsmelted_ingot_silver", "inventory"));
    }

    private static void initMisc(RenderItem renderItem) {
        renderItem.getItemModelMesher().register(ModItems.cobblestones, 0,
                new ModelResourceLocation(Reference.MODID + ":cobblestones", "inventory"));
    }
}
