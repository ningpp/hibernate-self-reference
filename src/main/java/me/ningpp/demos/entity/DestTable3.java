package me.ningpp.demos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dest_table3")
public class DestTable3 {
    @Id
    @Column(name = "id1")
    private Integer id1;
    @Id
    @Column(name = "id2")
    private Integer id2;
    @Id
    @Column(name = "id3")
    private Integer id3;

    @Column(name = "name")
    private String name;

    public DestTable3() {
    }

    public DestTable3(Integer id1, Integer id2, Integer id3, String name) {
        super();
        this.id1 = id1;
        this.id2 = id2;
        this.id3 = id3;
        this.name = name;
    }

    public Integer getId1() {
        return id1;
    }

    public void setId1(Integer id1) {
        this.id1 = id1;
    }

    public Integer getId2() {
        return id2;
    }

    public void setId2(Integer id2) {
        this.id2 = id2;
    }

    public Integer getId3() {
        return id3;
    }

    public void setId3(Integer id3) {
        this.id3 = id3;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DestTable3 [id1=" + id1 + ", id2=" + id2 + ", id3=" + id3
                + ", name=" + name + "]";
    }

}
