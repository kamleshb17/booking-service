package com.maersk.core.booking.model.to;

import com.maersk.core.booking.model.ContainerType;

import java.io.Serializable;
import java.util.Objects;


public class PackageRequest implements Serializable {

    private static final long serialVersionUID = 7674562930100849348L;
    private long containerSize;
    private ContainerType containerType;
    private String origin;
    private String destination;
    private int quantity;

    public PackageRequest(final long containerSize, final ContainerType containerType, final String origin,
                          final String destination, final int quantity) {
        this.containerSize = containerSize;
        this.containerType = containerType;
        this.origin = origin;
        this.destination = destination;
        this.quantity = quantity;
    }

    protected PackageRequest() {

    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        PackageRequest that = (PackageRequest) obj;
        return getContainerSize() == that.getContainerSize() &&
                getQuantity() == that.getQuantity() &&
                getContainerType() == that.getContainerType() &&
                Objects.equals(getOrigin(), that.getOrigin()) &&
                Objects.equals(getDestination(), that.getDestination());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getContainerSize(), getContainerType(), getOrigin(), getDestination(), getQuantity());
    }

    public long getContainerSize() {
        return containerSize;
    }

    public ContainerType getContainerType() {
        return containerType;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getQuantity() {
        return quantity;
    }
}
