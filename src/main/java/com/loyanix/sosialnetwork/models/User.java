package com.loyanix.sosialnetwork.models;

import com.loyanix.sosialnetwork.enums.Relationship;
import com.loyanix.sosialnetwork.enums.Sex;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.Set;

@Document
public class User {
    @Id
    private String id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private Boolean isAdmin;
    private String avatar;
    private String coverPictures;
    private String about;
    private String geo;
    private String worksAt;
    private Sex sex;
    private String age;
    private Relationship relationship;
    private Set<String> followers;
    private Set<String> following;

    public User() {
    }

    public User(String id, String userName, String password, String firstName, String lastName, Boolean isAdmin, String avatar, String coverPictures, String about, String geo, String worksAt, Sex sex, String age, Relationship relationship, Set<String> followers, Set<String> following) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isAdmin = isAdmin;
        this.avatar = avatar;
        this.coverPictures = coverPictures;
        this.about = about;
        this.geo = geo;
        this.worksAt = worksAt;
        this.sex = sex;
        this.age = age;
        this.relationship = relationship;
        this.followers = followers;
        this.following = following;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCoverPictures() {
        return coverPictures;
    }

    public void setCoverPictures(String coverPictures) {
        this.coverPictures = coverPictures;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public String getWorksAt() {
        return worksAt;
    }

    public void setWorksAt(String worksAt) {
        this.worksAt = worksAt;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }

    public Set<String> getFollowers() {
        return followers;
    }

    public void setFollowers(Set<String> followers) {
        this.followers = followers;
    }

    public Set<String> getFollowing() {
        return following;
    }

    public void setFollowing(Set<String> following) {
        this.following = following;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) && userName.equals(user.userName) && password.equals(user.password) && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && isAdmin.equals(user.isAdmin) && Objects.equals(avatar, user.avatar) && Objects.equals(coverPictures, user.coverPictures) && Objects.equals(about, user.about) && Objects.equals(geo, user.geo) && Objects.equals(worksAt, user.worksAt) && sex == user.sex && Objects.equals(age, user.age) && relationship == user.relationship && Objects.equals(followers, user.followers) && Objects.equals(following, user.following);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, password, firstName, lastName, isAdmin, avatar, coverPictures, about, geo, worksAt, sex, age, relationship, followers, following);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", isAdmin=" + isAdmin +
                ", avatar='" + avatar + '\'' +
                ", coverPictures='" + coverPictures + '\'' +
                ", about='" + about + '\'' +
                ", geo='" + geo + '\'' +
                ", worksAt='" + worksAt + '\'' +
                ", sex=" + sex +
                ", age='" + age + '\'' +
                ", relationship=" + relationship +
                ", followers=" + followers +
                ", following=" + following +
                '}';
    }
}
