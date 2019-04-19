package timaxa007.easy_mod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import timaxa007.easy_mod.EasyMod;

public class BlockOreNether2 extends Block {

	public BlockOreNether2() {
		super(Material.rock);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 1);
		setHardness(0.75F);
		setBlockName(EasyMod.MODID + ".ore_nether_2");
		setBlockTextureName(EasyMod.MODID + ":ore_nether_2");
		setCreativeTab(EasyMod.tabEasyMod);
	}

}
