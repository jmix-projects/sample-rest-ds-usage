package com.company.orders.view.customerregion;

import com.company.orders.entity.customer.CustomerRegion;
import com.company.orders.view.main.MainView;
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
