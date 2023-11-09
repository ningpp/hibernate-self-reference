package me.ningpp.demos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "middle_table5")
public class MiddleTable5 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "middle5_id", nullable = false)
    private Integer middle5Id;

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

    public MiddleTable5() {
    }

    public MiddleTable5(Integer middle5Id, Integer mainId1, Integer mainId2, Integer dest4Id1, Integer dest4Id2, Integer dest4Id3) {
        this.middle5Id = middle5Id;
        this.mainId1 = mainId1;
        this.mainId2 = mainId2;
        this.dest4Id1 = dest4Id1;
        this.dest4Id2 = dest4Id2;
        this.dest4Id3 = dest4Id3;
    }

    public Integer getMiddle5Id() {
        return middle5Id;
    }

    public void setMiddle5Id(Integer middle5Id) {
        this.middle5Id = middle5Id;
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
}
