package com.company.orders.view.customercontact;

import com.company.orders.entity.customer.CustomerContact;
import com.company.orders.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "customerContacts/:id", layout = MainView.class)
@ViewController("CustomerContact.detail")
@ViewDescriptor("customer-contact-detail-view.xml")
@EditedEntityContainer("customerContactDc")
public class CustomerContactDetailView extends StandardDetailView<CustomerContact> {
}
