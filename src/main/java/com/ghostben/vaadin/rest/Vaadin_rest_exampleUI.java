package com.ghostben.vaadin.rest;

import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

/**
 * @author : ben.zhang.b.q
 * @date : 2018/10/10 16:33
 * package   : com.ghostben.vaadin.rest
 * description : UI界面
 **/
@SpringUI
@SuppressWarnings("serial")
public class Vaadin_rest_exampleUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        final VerticalLayout layout = new VerticalLayout();
        layout.setMargin(true);
        setContent(layout);
        RestClient restClient = new RestClient();
        Label resultLabel = new Label();
        resultLabel.setWidth("100%");
        resultLabel.setHeight("200px");
        resultLabel.addStyleName("h1");
        resultLabel.addStyleName("mylabelstyle");


        HorizontalLayout hLayot = new HorizontalLayout();
        Button buttonGetResponse = new Button("Get Response");
        buttonGetResponse.addClickListener((Button.ClickListener) event -> resultLabel.setValue(restClient.getResponse()));
        Button buttonGetText = new Button("Get Text Answer");
        buttonGetText.addClickListener((Button.ClickListener) event -> resultLabel.setValue(restClient.getAnswerText()));
        Button buttonGetXml = new Button("Get XML Answer");
        buttonGetXml.addClickListener((Button.ClickListener) event -> resultLabel.setValue(restClient.getAnswerXML()));
        Button buttonGetJson = new Button("Get JSON Answer");
        buttonGetJson.addClickListener((Button.ClickListener) event -> resultLabel.setValue(restClient.getAnswerJSON()));

        hLayot.addComponent(buttonGetResponse);
        hLayot.addComponent(buttonGetText);
        hLayot.addComponent(buttonGetXml);
        hLayot.addComponent(buttonGetJson);

        layout.addComponent(resultLabel);
        layout.addComponent(hLayot);
    }
}
