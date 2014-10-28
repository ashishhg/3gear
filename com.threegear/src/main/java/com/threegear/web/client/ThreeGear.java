package com.threegear.web.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class ThreeGear implements EntryPoint {

	public void onModuleLoad() {
		ThreeGearUI _3gearUi = new ThreeGearUI();

		RootLayoutPanel.get().add(_3gearUi);
	}
}
