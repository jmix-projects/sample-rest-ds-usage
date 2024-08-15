package com.company.orders.view.customerregion;

import com.company.orders.entity.customer.CustomerRegion;
import com.company.orders.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "customerRegions", layout = MainView.class)
@ViewController("CustomerRegion.list")
@ViewDescriptor("customer-region-list-view.xml")
@LookupComponent("customerRegionsDataGrid")
@DialogMode(width = "50em")
public class CustomerRegionListView extends StandardListView<CustomerRegion> {
}
