package me.ningpp.demos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "middle_table1")
public class MiddleTable1 {

    @Id
    @Column(name = "main_id1")
    private Integer mainId1;

    @Id
    @Column(name = "main_id2")
    private Integer mainId2;

    @Id
    @Column(name = "dest1_id1")
    private Integer dest1Id1;

    @Id
    @Column(name = "dest1_id2")
    private Integer dest1Id2;

    public MiddleTable1() {
    }

    public MiddleTable1(Integer mainId1, Integer mainId2,
            Integer dest1Id1, Integer dest1Id2) {
        super();
        this.mainId1 = mainId1;
        this.mainId2 = mainId2;
        this.dest1Id1 = dest1Id1;
        this.dest1Id2 = dest1Id2;
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

}
