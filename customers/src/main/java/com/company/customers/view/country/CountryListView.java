package com.company.customers.view.country;

import com.company.customers.entity.Country;
import com.company.customers.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "countries", layout = MainView.class)
@ViewController("Country.list")
@ViewDescriptor("country-list-view.xml")
@LookupComponent("countriesDataGrid")
@DialogMode(width = "64em")
public class CountryListView extends StandardListView<Country> {
}