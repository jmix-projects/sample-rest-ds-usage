package com.company.orders.entity.customer;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.JmixId;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.Store;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

@Store(name = "customers")
@JmixEntity
public class CustomerInfo {
    @JmixGeneratedValue
    @JmixId
    private UUID id;

    private String details;

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @InstanceName
    @DependsOnProperties({"details"})
    public String getInstanceName() {
        return StringUtils.isBlank(details) ? "<empty>" : StringUtils.abbreviate(details, 30);
    }
}