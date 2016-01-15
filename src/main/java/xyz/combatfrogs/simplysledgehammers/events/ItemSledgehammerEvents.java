package xyz.combatfrogs.simplysledgehammers.events;

import net.minecraft.block.Block;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;
import xyz.combatfrogs.simplysledgehammers.ModItems;
import xyz.combatfrogs.simplysledgehammers.items.tools.ItemSledgehammer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Created by CombatFrogs on 1/12/2016.
 */
public class ItemSledgehammerEvents {
    private final Map<String, ItemStack> sledgingMap;

    private static final Random randGen = new Random();
    private static final int COBBLESTONE_DROP_QUANTITY = 5;

    public ItemSledgehammerEvents() {
        sledgingMap = new HashMap<String, ItemStack>() {{
            put("oreIron", ModItems.ironOreChunk);
            put("oreGold", ModItems.goldOreChunk);
            put("oreCopper", ModItems.copperOreChunk);
            put("oreTin", ModItems.tinOreChunk);
            put("oreNickel", ModItems.nickelOreChunk);
            put("oreLead", ModItems.leadOreChunk);
            put("oreSilver", ModItems.silverOreChunk);
        }};
    }

    @SubscribeEvent
    public void onHarvestBlocks(BlockEvent.HarvestDropsEvent event)
    {
        EntityPlayer player = event.harvester;

        if (player == null) {
            return;
        }

        ItemStack heldItem = player.inventory.getCurrentItem();
        if (heldItem == null) {
            return;
        }

        Block block = event.state.getBlock();
        ItemStack blockStack = new ItemStack(block, 1, block.damageDropped(event.state));

        int fortuneLevel = EnchantmentHelper.getFortuneModifier(player);

        if (heldItem.getItem() instanceof ItemSledgehammer) {
            ItemStack droppedChunk = null;
            for (Map.Entry<String, ItemStack> sledgingEntry : sledgingMap.entrySet()) {
                List<ItemStack> ores = OreDictionary.getOres(sledgingEntry.getKey());
                for (ItemStack oreStack : ores) {
                    if (oreStack != null && oreStack.isItemEqual(blockStack)) {
                        droppedChunk = sledgingEntry.getValue();
                        break;
                    }
                }

                if (droppedChunk != null)
                    break;
            }

            if (droppedChunk == null)
                return;

            int minQuantity, maxQuantity;
            switch(fortuneLevel) {
                case 0:
                    minQuantity = 7;
                    maxQuantity = 9;
                    break;
                case 1:
                    minQuantity = 8;
                    maxQuantity = 9;
                    break;
                default:
                    minQuantity = 6 + (fortuneLevel * 2);
                    maxQuantity = minQuantity + 2;
                    break;
            }

            event.drops.clear();
            event.drops.add(
                    new ItemStack(
                            droppedChunk.getItem(),
                            randGen.nextInt(maxQuantity - minQuantity) + minQuantity,
                            droppedChunk.getItemDamage()));
            event.drops.add(new ItemStack(ModItems.cobblestones, COBBLESTONE_DROP_QUANTITY));
            event.dropChance = 1.0f;
        }
    }
}
