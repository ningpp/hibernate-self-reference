package me.ningpp.demos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "middle_table6")
public class MiddleTable6 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "middle6_id", nullable = false)
    private Integer middle6Id;

    @Column(name = "order_column")
    private Integer orderColumn;

    @Column(name = "main_id1")
    private Integer mainId1;

    @Column(name = "main_id2")
    private Integer mainId2;

    @Column(name = "dest4_id1")
    private Integer dest4Id1;

    @Column(name = "dest4_id2")
    private Integer dest4Id2;

    @Column(name = "dest4_id3")
    private Integer dest4Id3;

    public MiddleTable6() {
    }

    public MiddleTable6(Integer middle6Id, Integer mainId1, Integer mainId2, Integer dest4Id1, Integer dest4Id2, Integer dest4Id3) {
        this.middle6Id = middle6Id;
        this.mainId1 = mainId1;
        this.mainId2 = mainId2;
        this.dest4Id1 = dest4Id1;
        this.dest4Id2 = dest4Id2;
        this.dest4Id3 = dest4Id3;
    }

    public Integer getMiddle6Id() {
        return middle6Id;
    }

    public void setMiddle6Id(Integer middle4Id) {
        this.middle6Id = middle4Id;
    }

    public Integer getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(Integer orderColumn) {
        this.orderColumn = orderColumn;
    }

    public Integer getMainId1() {
        return mainId1;
    }

    public void setMainId1(Integer mainId1) {
        this.mainId1 = mainId1;
    }

    public Integer getMainId2() {
        return mainId2;
    }

    public void setMainId2(Integer mainId2) {
        this.mainId2 = mainId2;
    }

    public Integer getDest4Id1() {
        return dest4Id1;
    }

    public void setDest4Id1(Integer dest4Id1) {
        this.dest4Id1 = dest4Id1;
    }

    public Integer getDest4Id2() {
        return dest4Id2;
    }

    public void setDest4Id2(Integer dest4Id2) {
        this.dest4Id2 = dest4Id2;
    }

    public Integer getDest4Id3() {
        return dest4Id3;
    }

    public void setDest4Id3(Integer dest4Id3) {
        this.dest4Id3 = dest4Id3;
    }

    @Override
    public String toString() {
        return "MiddleTable6{" +
                "middle6Id=" + middle6Id +
                ", mainId1=" + mainId1 +
                ", mainId2=" + mainId2 +
                ", dest4Id1=" + dest4Id1 +
                ", dest4Id2=" + dest4Id2 +
                ", dest4Id3=" + dest4Id3 +
                '}';
    }
}
