package me.ningpp.demos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dest_table1")
public class DestTable1 {
    @Id
    @Column(name = "dest1_id1")
    private Integer dest1Id1;
    @Id
    @Column(name = "dest1_id2")
    private Integer dest1Id2;

    @Column(name = "name")
    private String name;


    public DestTable1() {
    }
    
    public DestTable1(Integer dest1Id1, Integer dest1Id2, String name) {
        super();
        this.dest1Id1 = dest1Id1;
        this.dest1Id2 = dest1Id2;
        this.name = name;
    }

    public Integer getDest1Id1() {
        return dest1Id1;
    }

    public void setDest1Id1(Integer dest1Id1) {
        this.dest1Id1 = dest1Id1;
    }

    public Integer getDest1Id2() {
        return dest1Id2;
    }

    public void setDest1Id2(Integer dest1Id2) {
        this.dest1Id2 = dest1Id2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DestTable1 [dest1Id1=" + dest1Id1 + ", dest1Id2=" + dest1Id2
                + ", name=" + name + "]";
    }

}
