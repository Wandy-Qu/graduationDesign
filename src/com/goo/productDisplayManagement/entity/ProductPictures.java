package com.goo.productDisplayManagement.entity;

public class ProductPictures {
    private int pictureMessageId;
    private int productId;
    private String mainPicUrl;
    private String frontPicUrl;
    private String backPicUrl;
    private String leftPicUrl;
    private String rightPicUrl;

    public ProductPictures() {
    }

    public int getPictureMessageId() {
        return pictureMessageId;
    }

    public void setPictureMessageId(int pictureMessageId) {
        this.pictureMessageId = pictureMessageId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getMainPicUrl() {
        return mainPicUrl;
    }

    public void setMainPicUrl(String mainPicUrl) {
        this.mainPicUrl = mainPicUrl;
    }

    public String getFrontPicUrl() {
        return frontPicUrl;
    }

    public void setFrontPicUrl(String frontPicUrl) {
        this.frontPicUrl = frontPicUrl;
    }

    public String getBackPicUrl() {
        return backPicUrl;
    }

    public void setBackPicUrl(String backPicUrl) {
        this.backPicUrl = backPicUrl;
    }

    public String getLeftPicUrl() {
        return leftPicUrl;
    }

    public void setLeftPicUrl(String leftPicUrl) {
        this.leftPicUrl = leftPicUrl;
    }

    public String getRightPicUrl() {
        return rightPicUrl;
    }

    public void setRightPicUrl(String rightPicUrl) {
        this.rightPicUrl = rightPicUrl;
    }
}
