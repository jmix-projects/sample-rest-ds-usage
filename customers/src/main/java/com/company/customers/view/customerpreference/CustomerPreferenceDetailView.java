package com.company.customers.view.customerpreference;

import com.company.customers.entity.CustomerPreference;
import com.company.customers.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "customerPreferences/:id", layout = MainView.class)
@ViewController("CustomerPreference.detail")
@ViewDescriptor("customer-preference-detail-view.xml")
@EditedEntityContainer("customerPreferenceDc")
public class CustomerPreferenceDetailView extends StandardDetailView<CustomerPreference> {
}