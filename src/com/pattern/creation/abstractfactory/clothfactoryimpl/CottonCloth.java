package com.pattern.creation.abstractfactory.clothfactoryimpl;

import com.pattern.creation.abstractfactory.productfactory.ClothTypeAbstract;

public class CottonCloth implements ClothTypeAbstract {

	@Override
	public String getClothType() {
		return "CottonCloth";
	}
	
	
}
