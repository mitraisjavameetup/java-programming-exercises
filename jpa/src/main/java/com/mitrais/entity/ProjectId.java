package com.mitrais.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

// TODO please add annotation for entity class
public class ProjectId implements Serializable {
    // TODO implement this entity class
    private String projectName;
    private String role;

    public ProjectId() {

    }

    public ProjectId(String projectName, String role) {
    }
}
