package com.Picloud.hibernate.entities;

// Generated 2015-8-3 14:27:19 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "Picloud")
public class User implements java.io.Serializable {

        private Integer uid;
        private String accountType;
        private String email;
        private Date lastLogin;
        private String website;
        private String nickname;
        private String password;
        private int imageNum;
        private double imageTotalSize;
        private int spaceNum;
        private Set<Space> spaces = new HashSet<Space>(0);

        public User() {
        }

        public User(String accountType, String email, String nickname,
                        String password, int imageNum, double imageTotalSize,
                        int spaceNum) {
                this.accountType = accountType;
                this.email = email;
                this.nickname = nickname;
                this.password = password;
                this.imageNum = imageNum;
                this.imageTotalSize = imageTotalSize;
                this.spaceNum = spaceNum;
        }

        public User(String accountType, String email, Date lastLogin,
                        String website, String nickname, String password,
                        int imageNum, double imageTotalSize, int spaceNum,
                        Set<Space> spaces) {
                this.accountType = accountType;
                this.email = email;
                this.lastLogin = lastLogin;
                this.website = website;
                this.nickname = nickname;
                this.password = password;
                this.imageNum = imageNum;
                this.imageTotalSize = imageTotalSize;
                this.spaceNum = spaceNum;
                this.spaces = spaces;
        }

        @Id
        @GeneratedValue(strategy = IDENTITY)
        @Column(name = "uid", unique = true, nullable = false)
        public Integer getUid() {
                return this.uid;
        }

        public void setUid(Integer uid) {
                this.uid = uid;
        }

        @Column(name = "accountType", nullable = false, length = 10)
        public String getAccountType() {
                return this.accountType;
        }

        public void setAccountType(String accountType) {
                this.accountType = accountType;
        }

        @Column(name = "email", nullable = false, length = 100)
        public String getEmail() {
                return this.email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "lastLogin", length = 19)
        public Date getLastLogin() {
                return this.lastLogin;
        }

        public void setLastLogin(Date lastLogin) {
                this.lastLogin = lastLogin;
        }

        @Column(name = "website", length = 100)
        public String getWebsite() {
                return this.website;
        }

        public void setWebsite(String website) {
                this.website = website;
        }

        @Column(name = "nickname", nullable = false, length = 50)
        public String getNickname() {
                return this.nickname;
        }

        public void setNickname(String nickname) {
                this.nickname = nickname;
        }

        @Column(name = "password", nullable = false, length = 200)
        public String getPassword() {
                return this.password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        @Column(name = "imageNum", nullable = false)
        public int getImageNum() {
                return this.imageNum;
        }

        public void setImageNum(int imageNum) {
                this.imageNum = imageNum;
        }

        @Column(name = "imageTotalSize", nullable = false, precision = 22, scale = 0)
        public double getImageTotalSize() {
                return this.imageTotalSize;
        }

        public void setImageTotalSize(double imageTotalSize) {
                this.imageTotalSize = imageTotalSize;
        }

        @Column(name = "spaceNum", nullable = false)
        public int getSpaceNum() {
                return this.spaceNum;
        }

        public void setSpaceNum(int spaceNum) {
                this.spaceNum = spaceNum;
        }

        @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
        @JsonIgnore
        public Set<Space> getSpaces() {
                return this.spaces;
        }

        public void setSpaces(Set<Space> spaces) {
                this.spaces = spaces;
        }

}
