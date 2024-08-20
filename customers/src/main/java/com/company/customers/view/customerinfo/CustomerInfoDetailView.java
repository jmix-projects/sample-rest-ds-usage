package com.company.customers.view.customerinfo;

import com.company.customers.entity.CustomerInfo;
import com.company.customers.view.main.MainView;
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