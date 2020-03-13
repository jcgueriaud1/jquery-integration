package com.example;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route("")
@NpmPackage(value = "jquery", version = "3.4.1")
@NpmPackage(value = "jtippy", version = "1.7.2")
@JsModule("./src/jtippy-loader.js")
@CssImport("jtippy/jTippy.css")
public class MainView extends VerticalLayout {

    public MainView() {
        H1 title = new H1("Test Page");
        add(title);
        Anchor anchor = new Anchor("#");
        anchor.setHref("#");
        anchor.setText("There are many variations of...");
        anchor.setTitle("There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable.");
        anchor.getElement().setAttribute("data-toggle", "tooltip");
        add(anchor);
    }

    protected void onAttach(AttachEvent event) {
        super.onAttach(event);
        // executing JS should be avoided in constructor
        getElement().executeJs("if (typeof jQuery !== 'undefined') { \n" +
                "               alert(\"jQuery is loaded globally\");\n" +
                "             } else {\n" +
                "               alert(\"jQuery is not loaded globally\");\n" +
                "             };");
    }
}
