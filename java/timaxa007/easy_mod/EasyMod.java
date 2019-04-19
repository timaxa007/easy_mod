package timaxa007.easy_mod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import timaxa007.easy_mod.block.BlockOreEnd;
import timaxa007.easy_mod.block.BlockOreNether1;
import timaxa007.easy_mod.block.BlockOreNether2;
import timaxa007.easy_mod.block.BlockOreOverworld1;
import timaxa007.easy_mod.block.BlockOreOverworld2;
import timaxa007.easy_mod.item.ItemChunkOreEnd;
import timaxa007.easy_mod.item.ItemChunkOreNether;
import timaxa007.easy_mod.item.ItemChunkOreOverworld;

@Mod(modid = EasyMod.MODID, name = EasyMod.NAME, version = EasyMod.VERSION)
public class EasyMod {

	public static final String
	MODID = "easy_mod",
	NAME = "Easy Mod",
	VERSION = "1.1";

	@Mod.Instance(MODID)
	public static EasyMod instance;

	@SidedProxy(modId = MODID,
			serverSide = "timaxa007.easy_mod.ProxyCommon",
			clientSide = "timaxa007.easy_mod.client.ProxyClient")
	public static ProxyCommon proxy;

	public static final CreativeTabs tabEasyMod = new CreativeTabs("tab_easy_mod") {
		@Override public Item getTabIconItem() {
			return item_chunk_ore_overworld;
		}
	};

	public static Block
	block_ore_overworld_1,
	block_ore_overworld_2,
	block_ore_nether_1,
	block_ore_nether_2,
	block_ore_end;

	public static Item
	item_chunk_ore_overworld,
	item_chunk_ore_nether,
	item_chunk_ore_end;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		block_ore_overworld_1 = new BlockOreOverworld1();
		GameRegistry.registerBlock(block_ore_overworld_1, "block_ore_overworld_1");

		block_ore_overworld_2 = new BlockOreOverworld2();
		GameRegistry.registerBlock(block_ore_overworld_2, "block_ore_overworld_2");

		block_ore_nether_1 = new BlockOreNether1();
		GameRegistry.registerBlock(block_ore_nether_1, "block_ore_nether_1");

		block_ore_nether_2 = new BlockOreNether2();
		GameRegistry.registerBlock(block_ore_nether_2, "block_ore_nether_2");

		block_ore_end = new BlockOreEnd();
		GameRegistry.registerBlock(block_ore_end, "block_ore_end");


		item_chunk_ore_overworld = new ItemChunkOreOverworld()
				.setUnlocalizedName(MODID + ".ore_overworld").setTextureName(MODID + ":chunk_ore_overworld")
				.setCreativeTab(tabEasyMod);
		GameRegistry.registerItem(item_chunk_ore_overworld, "item_chunk_ore_overworld");

		item_chunk_ore_nether = new ItemChunkOreNether()
				.setUnlocalizedName(MODID + ".chunk_ore_nether").setTextureName(MODID + ":chunk_ore_nether")
				.setCreativeTab(tabEasyMod);
		GameRegistry.registerItem(item_chunk_ore_nether, "item_chunk_ore_nether");

		item_chunk_ore_end = new ItemChunkOreEnd()
				.setUnlocalizedName(MODID + ".chunk_ore_end").setTextureName(MODID + ":chunk_ore_end")
				.setCreativeTab(tabEasyMod);
		GameRegistry.registerItem(item_chunk_ore_end, "item_chunk_ore_end");


		GameRegistry.registerWorldGenerator(new WorldGenerator(), 0);


		proxy.preInit(event);
	}

}
