package com.pattern.creation.abstractfactory.bleachfacimpl;

import com.pattern.creation.abstractfactory.productfactory.BleachCloth;
import com.pattern.creation.abstractfactory.productfactory.ClothTypeAbstract;

public class CottonClothBleach implements BleachCloth  {

	@Override
	public String bleachCloth() {
		return "whitebleach";
	}
	
	
}
