package me.ningpp.demos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "middle_table3")
public class MiddleTable3 {

    @Id
    @Column(name = "main_id1")
    private Integer mainId1;

    @Id
    @Column(name = "main_id2")
    private Integer mainId2;

    @Id
    @Column(name = "dest3_id1")
    private Integer dest3Id1;

    @Id
    @Column(name = "dest3_id2")
    private Integer dest3Id2;

    @Id
    @Column(name = "dest3_id3")
    private Integer dest3Id3;

    public MiddleTable3() {
    }

    public MiddleTable3(Integer mainId1, Integer mainId2,
            Integer dest3Id1, Integer dest3Id2, Integer dest3Id3) {
        super();
        this.mainId1 = mainId1;
        this.mainId2 = mainId2;
        this.dest3Id1 = dest3Id1;
        this.dest3Id2 = dest3Id2;
        this.dest3Id3 = dest3Id3;
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

    public Integer getDest3Id1() {
        return dest3Id1;
    }

    public void setDest3Id1(Integer dest3Id1) {
        this.dest3Id1 = dest3Id1;
    }

    public Integer getDest3Id2() {
        return dest3Id2;
    }

    public void setDest3Id2(Integer dest3Id2) {
        this.dest3Id2 = dest3Id2;
    }

    public Integer getDest3Id3() {
        return dest3Id3;
    }

    public void setDest3Id3(Integer dest3Id3) {
        this.dest3Id3 = dest3Id3;
    }

}
