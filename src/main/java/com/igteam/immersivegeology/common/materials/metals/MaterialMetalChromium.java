package com.igteam.immersivegeology.common.materials.metals;

import com.igteam.immersivegeology.ImmersiveGeology;
import com.igteam.immersivegeology.api.materials.PeriodicTableElement;
import com.igteam.immersivegeology.api.materials.PeriodicTableElement.ElementProportion;
import com.igteam.immersivegeology.api.materials.material_bases.MaterialMetalBase;
import net.minecraft.item.Rarity;

import javax.annotation.Nonnull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by JStocke12 on 27-03-2020.
 */
public class MaterialMetalChromium extends MaterialMetalBase
{
	@Override
	public String getName()
	{
		return "chromium";
	}

	@Nonnull
	@Override
	public String getModID()
	{
		return ImmersiveGeology.MODID;
	}

	@Override
	public Set<ElementProportion> getElements()
	{
		return new HashSet<>(Arrays.asList(
				new ElementProportion(PeriodicTableElement.CHROMIUM)
		));
	}

	@Override
	public Rarity getRarity()
	{
		return Rarity.RARE;
	}

	@Override
	public int getBoilingPoint()
	{
		return 2945;
	}

	@Override
	public int getMeltingPoint()
	{
		return 2180;
	}

	@Override
	public int getColor(int temperature)
	{
		return 0xc6c8c9;
	}

	//Needs to be changed in code for subtypes, such as sheetmetal
	@Override
	public float getHardness()
	{
		return 12.0F;
	}

	@Override
	public float getMiningResistance()
	{
		return 10.0F;
	}

	@Override
	public float getBlastResistance()
	{
		return 6;
	}

	//Copied from Immersive Intelligence (steel has i think 1.65, leaves 0.35)
	@Override
	public float getDensity()
	{
		return 2f;
	}

	//Stone pickaxe level
	@Override
	public int getBlockHarvestLevel()
	{
		return 2;
	}

	@Override
	public EnumMetalType getMetalType()
	{
		return EnumMetalType.METAL;
	}


	/*@Nullable
	@Override
	public IItemTier getToolTier()
	{
		return IGContent.;
	}*/
}
