package com.mingsoft.testapp;

/**
 * Created by Administrator on 2020/07/09.
 */

public class Bean {
    private String contexts;
    private int image;
    public String getContext() {
        return contexts;
    }

    public Bean(String contexts,int image){
        this.contexts=contexts;
        this.image=image;
    }

    public void setContext(String context) {
        this.contexts = context;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


}
