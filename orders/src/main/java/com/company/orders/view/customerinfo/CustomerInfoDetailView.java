package com.company.orders.view.customerinfo;

import com.company.orders.entity.customer.CustomerInfo;
import com.company.orders.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "customerInfo/:id", layout = MainView.class)
@ViewController("CustomerInfo.detail")
@ViewDescriptor("customer-info-detail-view.xml")
@EditedEntityContainer("customerInfoDc")
public class CustomerInfoDetailView extends StandardDetailView<CustomerInfo> {
}
