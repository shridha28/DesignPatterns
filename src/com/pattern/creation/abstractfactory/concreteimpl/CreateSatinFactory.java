package com.pattern.creation.abstractfactory.concreteimpl;

import com.pattern.creation.abstractfactory.bleachfacimpl.SatinClothBleach;
import com.pattern.creation.abstractfactory.clothfactoryimpl.SatinCloth;
import com.pattern.creation.abstractfactory.parentfacory.ClothFactory;
import com.pattern.creation.abstractfactory.stitchfacimpl.SatinClothStitch;
import com.pattern.creation.abstractfactory.storefacimpl.SatinClothStore;

public class CreateSatinFactory implements ClothFactory{

	@Override
	public String selectTypeOfCloth() {
		return new SatinCloth().getClothType();
	}

	@Override
	public String stitchTheCloth() {
		return new SatinClothStitch().stitchCloth();
	}

	@Override
	public String storeTheCloth() {
		return new SatinClothStore().storeCloth(); 
	}

	@Override
	public String bleachTheCloth() {
		return new SatinClothBleach().bleachCloth();

	}

	public String toString() {
		return selectTypeOfCloth() + ":"+
				stitchTheCloth()+":"+
				storeTheCloth()+":"+
				bleachTheCloth();
	}

}
