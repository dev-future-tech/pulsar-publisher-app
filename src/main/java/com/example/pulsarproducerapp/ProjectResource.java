package com.example.pulsarproducerapp;

public class ProjectResource {

    private ProjectResourceType resourceType;
    private String resourceName;

    private boolean approved = false;

    public ProjectResourceType getResourceType() {
        return resourceType;
    }

    public void setResourceType(ProjectResourceType resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
}
