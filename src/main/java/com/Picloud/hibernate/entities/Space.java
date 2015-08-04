package com.Picloud.hibernate.entities;

// Generated 2015-8-4 18:21:49 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Space generated by hbm2java
 */
@Entity
@Table(name = "space", catalog = "Picloud")
public class Space implements java.io.Serializable {

        private Integer sid;
        private User user;
        private String name;
        private String description;
        private double storage;
        private int number;
        private Date time;
        private String cover;

        public Space() {
        }

        public Space(User user, String name, String description,
                        double storage, int number, Date time) {
                this.user = user;
                this.name = name;
                this.description = description;
                this.storage = storage;
                this.number = number;
                this.time = time;
        }

        public Space(User user, String name, String description,
                        double storage, int number, Date time, String cover) {
                this.user = user;
                this.name = name;
                this.description = description;
                this.storage = storage;
                this.number = number;
                this.time = time;
                this.cover = cover;
        }

        @Id
        @GeneratedValue(strategy = IDENTITY)
        @Column(name = "sid", unique = true, nullable = false)
        public Integer getSid() {
                return this.sid;
        }

        public void setSid(Integer sid) {
                this.sid = sid;
        }

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "uid", nullable = false)
        public User getUser() {
                return this.user;
        }

        public void setUser(User user) {
                this.user = user;
        }

        @Column(name = "name", nullable = false, length = 100)
        public String getName() {
                return this.name;
        }

        public void setName(String name) {
                this.name = name;
        }

        @Column(name = "description", nullable = false)
        public String getDescription() {
                return this.description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        @Column(name = "storage", nullable = false, precision = 22, scale = 0)
        public double getStorage() {
                return this.storage;
        }

        public void setStorage(double storage) {
                this.storage = storage;
        }

        @Column(name = "number", nullable = false)
        public int getNumber() {
                return this.number;
        }

        public void setNumber(int number) {
                this.number = number;
        }

        @Temporal(TemporalType.TIMESTAMP)
        @Column(name = "time", nullable = false, length = 19)
        public Date getTime() {
                return this.time;
        }

        public void setTime(Date time) {
                this.time = time;
        }

        @Column(name = "cover")
        public String getCover() {
                return this.cover;
        }

        public void setCover(String cover) {
                this.cover = cover;
        }

}
