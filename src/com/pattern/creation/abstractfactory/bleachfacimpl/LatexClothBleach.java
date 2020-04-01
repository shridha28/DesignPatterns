package com.pattern.creation.abstractfactory.bleachfacimpl;

import com.pattern.creation.abstractfactory.productfactory.BleachCloth;

public class LatexClothBleach implements BleachCloth{

	@Override
	public String bleachCloth() {
		return "shinebleach";
	}

	

}
