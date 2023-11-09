package me.ningpp.demos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "dest_table6")
public class DestTable6 {
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

    public DestTable6() {
    }

    public DestTable6(Integer id1, Integer id2, Integer id3, String name) {
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
        return "DestTable6 [id1=" + id1 + ", id2=" + id2 + ", id3=" + id3
                + ", name=" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DestTable6 that = (DestTable6) o;
        return Objects.equals(id1, that.id1) && Objects.equals(id2, that.id2) && Objects.equals(id3, that.id3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id1, id2, id3);
    }
}
