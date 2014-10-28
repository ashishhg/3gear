package com.threegear.web.client.ui.datasource;

import org.gwtbootstrap3.client.ui.Alert;
import org.gwtbootstrap3.client.ui.Button;
import org.gwtbootstrap3.client.ui.Input;
import org.gwtbootstrap3.client.ui.TextBox;
import org.gwtbootstrap3.client.ui.constants.AlertType;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ConfigureDataSource extends Composite {

	private static ConfigureDataSourceUiBinder uiBinder = GWT.create(ConfigureDataSourceUiBinder.class);

	interface ConfigureDataSourceUiBinder extends UiBinder<Widget, ConfigureDataSource> {
	}

	public ConfigureDataSource() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	Alert message;

	@UiField
	TextBox dbUrl;

	@UiField
	TextBox dbUserName;

	@UiField
	Input dbPassword;

	@UiField
	Button testConnection;

	@UiField
	Button save;

	@UiHandler("testConnection")
	void testDataSourceConnection(ClickEvent clickEvent) {
		message.setType(AlertType.DANGER);
		message.setText("Error message test`");
		message.setVisible(true);
	}

	@UiHandler("save")
	void saveDataSourceConnection(ClickEvent clickEvent) {
		message.setType(AlertType.SUCCESS);
		message.setText("Success message test`");
		message.setVisible(true);
	}
}
