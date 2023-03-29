
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package simon_mc.crafting_mania.init;

import simon_mc.crafting_mania.item.UltimateEggItem;
import simon_mc.crafting_mania.item.TurtleEssenceBottleItem;
import simon_mc.crafting_mania.item.FailedNetherStarItem;
import simon_mc.crafting_mania.item.FailedDragonEggItem;
import simon_mc.crafting_mania.item.EssenceBottleItem;
import simon_mc.crafting_mania.item.CreeperEssenceBottleItem;
import simon_mc.crafting_mania.item.BeeEssenceBottleItem;
import simon_mc.crafting_mania.CraftingManiaMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

public class CraftingManiaModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CraftingManiaMod.MODID);
	public static final RegistryObject<Item> FAILED_DRAGON_EGG = REGISTRY.register("failed_dragon_egg", () -> new FailedDragonEggItem());
	public static final RegistryObject<Item> ULTIMATE_EGG = REGISTRY.register("ultimate_egg", () -> new UltimateEggItem());
	public static final RegistryObject<Item> FAILED_NETHER_STAR = REGISTRY.register("failed_nether_star", () -> new FailedNetherStarItem());
	public static final RegistryObject<Item> ESSENCE_BOTTLE = REGISTRY.register("essence_bottle", () -> new EssenceBottleItem());
	public static final RegistryObject<Item> CREEPER_ESSENCE_BOTTLE = REGISTRY.register("creeper_essence_bottle", () -> new CreeperEssenceBottleItem());
	public static final RegistryObject<Item> BEE_ESSENCE_BOTTLE = REGISTRY.register("bee_essence_bottle", () -> new BeeEssenceBottleItem());
	public static final RegistryObject<Item> TURTLE_ESSENCE_BOTTLE = REGISTRY.register("turtle_essence_bottle", () -> new TurtleEssenceBottleItem());
}
