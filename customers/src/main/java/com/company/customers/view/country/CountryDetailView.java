package com.company.customers.view.country;

import com.company.customers.entity.Country;
import com.company.customers.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "countries/:id", layout = MainView.class)
@ViewController("Country.detail")
@ViewDescriptor("country-detail-view.xml")
@EditedEntityContainer("countryDc")
public class CountryDetailView extends StandardDetailView<Country> {
}