package com.goo.productDisplayManagement.entity;

/**
 * Created by Administrator on 2017/5/18 0018.
 */
public class Comments {
    private int commentId;
    private int userId;
    private int proId;
    private String comment;

    public Comments() {

    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
