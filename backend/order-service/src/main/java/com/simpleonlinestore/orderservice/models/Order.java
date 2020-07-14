package com.simpleonlinestore.orderservice.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "order_id")
    @NotNull
    private String orderId;

    @Column(name = "username")
    @NotNull
    private String username;

    @Column(name = "product_id")
    @NotNull
    private String productId;

    @Column(name = "quality")
    private Integer quality;

    @Column(name = "purchased_ts")
    private Timestamp purchasedTs;

    @Column(name = "details")
    private String details;

    public Order() {
    }

    public Order(@NotNull String orderId, @NotNull String username, @NotNull String productId, Integer quality, Timestamp purchasedTs, String details) {
        this.orderId = orderId;
        this.username = username;
        this.productId = productId;
        this.quality = quality;
        this.purchasedTs = purchasedTs;
        this.details = details;
    }

    public Order(long id, @NotNull String orderId, @NotNull String username, @NotNull String productId, Integer quality, Timestamp purchasedTs, String details) {
        this.id = id;
        this.orderId = orderId;
        this.username = username;
        this.productId = productId;
        this.quality = quality;
        this.purchasedTs = purchasedTs;
        this.details = details;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getQuality() {
        return quality;
    }

    public void setQuality(Integer quality) {
        this.quality = quality;
    }

    public Timestamp getPurchasedTs() {
        return purchasedTs;
    }

    public void setPurchasedTs(Timestamp purchasedTs) {
        this.purchasedTs = purchasedTs;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderId='" + orderId + '\'' +
                ", username='" + username + '\'' +
                ", productId='" + productId + '\'' +
                ", quality=" + quality +
                ", purchasedTs=" + purchasedTs +
                ", details='" + details + '\'' +
                '}';
    }
}
