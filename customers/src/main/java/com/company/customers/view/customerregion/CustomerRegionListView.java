package com.company.customers.view.customerregion;

import com.company.customers.entity.CustomerRegion;
import com.company.customers.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "customerRegions", layout = MainView.class)
@ViewController("CustomerRegion.list")
@ViewDescriptor("customer-region-list-view.xml")
@LookupComponent("customerRegionsDataGrid")
@DialogMode(width = "64em")
public class CustomerRegionListView extends StandardListView<CustomerRegion> {
}