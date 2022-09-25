package me.ningpp.demos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "middle_table2")
public class MiddleTable2 {

    @Id
    @Column(name = "main_id1")
    private Integer mainId1;

    @Id
    @Column(name = "main_id2")
    private Integer mainId2;

    @Id
    @Column(name = "dest2_id")
    private Integer dest2Id;

    public MiddleTable2() {
    }

    public MiddleTable2(Integer mainId1, Integer mainId2, Integer dest2Id) {
        super();
        this.mainId1 = mainId1;
        this.mainId2 = mainId2;
        this.dest2Id = dest2Id;
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

    public Integer getDest2Id() {
        return dest2Id;
    }

    public void setDest2Id(Integer dest2Id) {
        this.dest2Id = dest2Id;
    }

}
