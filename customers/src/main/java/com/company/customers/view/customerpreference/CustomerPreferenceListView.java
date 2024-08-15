package com.company.customers.view.customerpreference;

import com.company.customers.entity.CustomerPreference;
import com.company.customers.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "customerPreferences", layout = MainView.class)
@ViewController("CustomerPreference.list")
@ViewDescriptor("customer-preference-list-view.xml")
@LookupComponent("customerPreferencesDataGrid")
@DialogMode(width = "64em")
public class CustomerPreferenceListView extends StandardListView<CustomerPreference> {
}