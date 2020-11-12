package com.lihaiyang.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author lihaiyang
 * @since 2020-11-12
 */
public class Level implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Level{" +
            "id=" + id +
            ", name=" + name +
        "}";
    }
}
