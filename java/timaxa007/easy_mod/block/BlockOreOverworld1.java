package timaxa007.easy_mod.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import timaxa007.easy_mod.EasyMod;

public class BlockOreOverworld1 extends Block {

	public BlockOreOverworld1() {
		super(Material.rock);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 2);
		setHardness(2.5F);
		setBlockName(EasyMod.MODID + ".ore_overworld_1");
		setBlockTextureName(EasyMod.MODID + ":ore_overworld_1");
		setCreativeTab(EasyMod.tabEasyMod);
	}

	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return EasyMod.item_chunk_ore_overworld;
	}

}
