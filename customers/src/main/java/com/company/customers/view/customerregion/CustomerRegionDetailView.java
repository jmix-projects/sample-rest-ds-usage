package com.company.customers.view.customerregion;

import com.company.customers.entity.CustomerRegion;
import com.company.customers.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "customerRegions/:id", layout = MainView.class)
@ViewController("CustomerRegion.detail")
@ViewDescriptor("customer-region-detail-view.xml")
@EditedEntityContainer("customerRegionDc")
public class CustomerRegionDetailView extends StandardDetailView<CustomerRegion> {
}