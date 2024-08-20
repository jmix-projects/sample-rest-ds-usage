package com.company.customers.entity;

import io.jmix.core.MetadataTools;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

@JmixEntity
@Table(name = "CUSTOMER_INFO")
@Entity
public class CustomerInfo {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "DETAILS")
    @Lob
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
    public String getInstanceName(MetadataTools metadataTools) {
        return StringUtils.isBlank(details) ? "<empty>" : StringUtils.abbreviate(details, 30);
    }
}