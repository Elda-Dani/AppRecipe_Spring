package com.nestdigital.AppRecipe.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recipe")
public class RecipeModel {
@Id
@GeneratedValue
    private int id;
    private int userid;
    private String postdate;
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getPostdate() {
        return postdate;
    }

    public void setPostdate(String postdate) {
        this.postdate = postdate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public RecipeModel() {
    }

    public RecipeModel(int id, int userid, String postdate, String image) {
        this.id = id;
        this.userid = userid;
        this.postdate = postdate;
        this.image = image;
    }
}
