package com.example;

import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a click listener.
 */
@Route("")
@JavaScript("https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js")
public class MainView extends VerticalLayout {

    public MainView() {
        H1 title = new H1("Test Page");
        add(title);
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
