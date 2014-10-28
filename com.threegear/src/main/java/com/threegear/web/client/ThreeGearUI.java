package com.threegear.web.client;

import org.gwtbootstrap3.client.ui.AnchorListItem;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.threegear.web.client.ui.datasource.ConfigureDataSource;

public class ThreeGearUI extends Composite {

	private static ThreeGearUIUiBinder uiBinder = GWT.create(ThreeGearUIUiBinder.class);

	interface ThreeGearUIUiBinder extends UiBinder<Widget, ThreeGearUI> {
	}

	public ThreeGearUI() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	AnchorListItem configDataSource;

	@UiField
	AnchorListItem configTables;
	
	@UiField
	HTMLPanel contentPanel;

	@UiHandler("configDataSource")
	void loadDBConfigurationScreen(ClickEvent clickEvent) {
		contentPanel.clear();
		ConfigureDataSource configureDataSource = new ConfigureDataSource();
		contentPanel.add(configureDataSource);
	}
}
