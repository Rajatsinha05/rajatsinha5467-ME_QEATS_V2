
/*
 *
 *  * Copyright (c) Crio.Do 2019. All rights reserved
 *
 */

package com.crio.qeats.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// TODO: CRIO_TASK_MODULE_SERIALIZATION
//  Implement Restaurant class.
// Complete the class such that it produces the following JSON during serialization.
// {
//  "restaurantId": "10",
//  "name": "A2B",
//  "city": "Hsr Layout",
//  "imageUrl": "www.google.com",
//  "latitude": 20.027,
//  "longitude": 30.0,
//  "opensAt": "18:00",
//  "closesAt": "23:00",
//  "attributes": [
//    "Tamil",
//    "South Indian"
//  ]
// }


// @NoArgsConstructor
// @AllArgsConstructor
// @Data

@JsonIgnoreProperties(ignoreUnknown = true)
public class Restaurant {
    // @JsonProperty("restaurantId")
    @NotNull
    private String restaurantId;
    // @JsonProperty("name")
    @NotNull
    private String name;
    // @JsonProperty("city")
    @NotNull
    private String city;
    // @JsonProperty("imageUrl")
    @NotNull
    private String imageUrl;
    // @JsonProperty("latitude")
    @NotNull
    private double latitude;
    // @JsonProperty("longitude")
    @NotNull
    private double longitude;
    // @JsonProperty("opensAt")
    @NotNull
    private String opensAt;
    // @JsonProperty("closesAt")
    @NotNull
    private String closesAt;
    // @JsonProperty("attributes")
    @NotNull
    private List<String> attributes;
   
    @JsonIgnore
    private String id;

   

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getOpensAt() {
        return opensAt;
    }

    public void setOpensAt(String opensAt) {
        this.opensAt = opensAt;
    }

    public String getClosesAt() {
        return closesAt;
    }

    public void setClosesAt(String closesAt) {
        this.closesAt = closesAt;
    }

    public List<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    // Constructors
    public Restaurant(String restaurantId, String name, String city, String imageUrl,
                      double latitude, double longitude, String opensAt, String closesAt,
                      List<String> attributes) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.city = city;
        this.imageUrl = imageUrl;
        this.latitude = latitude;
        this.longitude = longitude;
        this.opensAt = opensAt;
        this.closesAt = closesAt;
        this.attributes = attributes;
    }

   
    public Restaurant() {}

}

