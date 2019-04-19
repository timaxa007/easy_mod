package timaxa007.easy_mod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import timaxa007.easy_mod.EasyMod;

public class BlockOreOverworld2 extends Block {

	public BlockOreOverworld2() {
		super(Material.rock);
		setStepSound(soundTypeStone);
		setHarvestLevel("pickaxe", 1);
		setHardness(1F);
		setBlockName(EasyMod.MODID + ".ore_overworld_2");
		setBlockTextureName(EasyMod.MODID + ":ore_overworld_2");
		setCreativeTab(EasyMod.tabEasyMod);
	}

}
