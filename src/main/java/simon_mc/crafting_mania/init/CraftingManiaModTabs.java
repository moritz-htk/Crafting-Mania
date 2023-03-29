
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package simon_mc.crafting_mania.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class CraftingManiaModTabs {
	public static CreativeModeTab TAB_CRAFTING_MANIA_CREATIVE_TAB;

	public static void load() {
		TAB_CRAFTING_MANIA_CREATIVE_TAB = new CreativeModeTab("tabcrafting_mania_creative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(CraftingManiaModItems.FAILED_NETHER_STAR.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
