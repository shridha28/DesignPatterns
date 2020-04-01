package com.pattern.creation.abstractfactory.storefacimpl;

import com.pattern.creation.abstractfactory.productfactory.BleachCloth;
import com.pattern.creation.abstractfactory.productfactory.ClothTypeAbstract;
import com.pattern.creation.abstractfactory.productfactory.StoreCloth;

public class CottonClothStore implements StoreCloth  {

	

	@Override
	public String storeCloth() {
		return "CottonStore,Sangli-416415 using Train";
	}
	
	
}
