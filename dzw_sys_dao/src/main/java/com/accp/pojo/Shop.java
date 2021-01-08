package com.accp.pojo;

public class Shop {
    private Integer shopid;

    private Integer goodid;

    private Integer firmid;

    private String shopname;

    private Integer weight;

    private Float stockprice;

    private Float sellingprice;

    private Integer quantity;

    private Float agreement;

    private String numbering;

    private String image;

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Integer getFirmid() {
        return firmid;
    }

    public void setFirmid(Integer firmid) {
        this.firmid = firmid;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Float getStockprice() {
        return stockprice;
    }

    public void setStockprice(Float stockprice) {
        this.stockprice = stockprice;
    }

    public Float getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(Float sellingprice) {
        this.sellingprice = sellingprice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getAgreement() {
        return agreement;
    }

    public void setAgreement(Float agreement) {
        this.agreement = agreement;
    }

    public String getNumbering() {
        return numbering;
    }

    public void setNumbering(String numbering) {
        this.numbering = numbering == null ? null : numbering.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
}