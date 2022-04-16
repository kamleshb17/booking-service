package com.maersk.core.booking.model.to;

import com.maersk.core.booking.model.ContainerType;

public class PackageRequestBuilder {
    private long containerSize;
    private ContainerType containerType;
    private String origin;
    private String destination;
    private int quantity;

    public PackageRequestBuilder() {

    }

    public PackageRequestBuilder(final PackageRequest prototype) {
        if (prototype != null) {
            this.containerSize = prototype.getContainerSize();
            this.containerType = prototype.getContainerType();
            this.origin = prototype.getOrigin();
            this.destination = prototype.getDestination();
            this.quantity = prototype.getQuantity();
        }
    }

    public PackageRequestBuilder withContainerSize(long containerSize) {
        this.containerSize = containerSize;
        return this;
    }

    public PackageRequestBuilder withContainerType(ContainerType containerType) {
        this.containerType = containerType;
        return this;
    }

    public PackageRequestBuilder withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public PackageRequestBuilder withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public PackageRequestBuilder withQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public PackageRequest build() {
        return new PackageRequest(containerSize, containerType, origin, destination, quantity);
    }
}