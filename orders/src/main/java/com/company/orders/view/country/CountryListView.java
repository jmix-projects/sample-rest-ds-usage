package com.company.orders.view.country;

import com.company.orders.entity.customer.Country;
import com.company.orders.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "countries", layout = MainView.class)
@ViewController("Country.list")
@ViewDescriptor("country-list-view.xml")
@LookupComponent("countriesDataGrid")
@DialogMode(width = "50em")
public class CountryListView extends StandardListView<Country> {
}
