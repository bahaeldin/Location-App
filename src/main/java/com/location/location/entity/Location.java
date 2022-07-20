
package com.location.location.entity;

import javax.persistence.*;

@Entity
@Table(name = "locations")
public class Location {

    @Id
    @Column(name = "location_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "location_name")
    private String name;

    @Column(name = "location_code")
    private String code;

    @Column(name = "location_type")
    public String type;

    public Location() {

    }

    public Location(String name, String code, String type) {
        this.name = name;
        this.code = code;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Location{" + "id=" + id + ", name='" + name + '\'' +
                ", code='" + code + '\'' + ", type='" + type + '\'' + '}';
    }

}
