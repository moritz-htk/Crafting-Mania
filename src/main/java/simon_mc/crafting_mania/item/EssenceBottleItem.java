
package simon_mc.crafting_mania.item;

import simon_mc.crafting_mania.init.CraftingManiaModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EssenceBottleItem extends Item {
	public EssenceBottleItem() {
		super(new Item.Properties().tab(CraftingManiaModTabs.TAB_CRAFTING_MANIA_CREATIVE_TAB).stacksTo(64).rarity(Rarity.COMMON));
	}
}
