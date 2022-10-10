package com.loyanix.sosialnetwork.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Document
public class Post {
    @Id
    private String id;
    private String userName;
    private String description;
    private String image;
    private Set<String> likesFromUsers;
    private Date creatingDate;

    public Post() {
    }

    public Post(String id, String userName, String description, String image, Set<String> likesFromUsers, Date creatingDate) {
        this.id = id;
        this.userName = userName;
        this.description = description;
        this.image = image;
        this.likesFromUsers = likesFromUsers;
        this.creatingDate = creatingDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Set<String> getLikesFromUsers() {
        return likesFromUsers;
    }

    public void setLikesFromUsers(Set<String> likesFromUsers) {
        this.likesFromUsers = likesFromUsers;
    }

    public Date getCreatingDate() {
        return creatingDate;
    }

    public void setCreatingDate(Date creatingDate) {
        this.creatingDate = creatingDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id.equals(post.id) && userName.equals(post.userName) && Objects.equals(description, post.description) && Objects.equals(image, post.image) && Objects.equals(likesFromUsers, post.likesFromUsers) && creatingDate.equals(post.creatingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, description, image, likesFromUsers, creatingDate);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", likesFromUsers=" + likesFromUsers +
                ", creatingDate=" + creatingDate +
                '}';
    }
}
