package com.example;

import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@NpmPackage(value = "jquery", version = "3.4.1")
@JavaScript("./src/jquery-test.js")
public class MainView extends VerticalLayout {

    public MainView() {
        H1 title = new H1("Test Page");
        add(title);
        getElement().executeJs("if (typeof jQuery !== 'undefined') { \n" +
                "               alert(\"jQuery is loaded globally\");\n" +
                "             } else {\n" +
                "               alert(\"jQuery is not loaded globally\");\n" +
                "             };");
    }
}