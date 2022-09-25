package me.ningpp.demos.entity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "main_multi_pks")
public class MainMultiPks {
    @Id
    @Column(name = "id1")
    private Integer id1;
    @Id
    @Column(name = "id2")
    private Integer id2;

    @Column(name = "name")
    private String name;

    @ManyToMany(targetEntity = DestTable1.class, cascade = { CascadeType.PERSIST }, fetch = FetchType.EAGER)
    @JoinTable(name = "middle_table1", 
        joinColumns = {
                @JoinColumn(name = "main_id1", referencedColumnName = "id1"),
                @JoinColumn(name = "main_id2", referencedColumnName = "id2")
        },

        inverseJoinColumns = {
                @JoinColumn(name = "dest1_id1", referencedColumnName = "dest1_id1"),
                @JoinColumn(name = "dest1_id2", referencedColumnName = "dest1_id2"),
        }
    )
    private Set<DestTable1> destTable1s = new HashSet<>();

    @ManyToMany(targetEntity = DestTable2.class, cascade = { CascadeType.PERSIST }, fetch = FetchType.EAGER)
    @JoinTable(name = "middle_table2", 
        joinColumns = {
                @JoinColumn(name = "main_id1", referencedColumnName = "id1"),
                @JoinColumn(name = "main_id2", referencedColumnName = "id2")
        },

        inverseJoinColumns = {
                @JoinColumn(name = "dest2_id", referencedColumnName = "id")
        }
    )
    private Set<DestTable2> destTable2s = new HashSet<>();

    @ManyToMany(targetEntity = DestTable4.class, cascade = { CascadeType.PERSIST }, fetch = FetchType.EAGER)
    @JoinTable(name = "middle_table4", 
        joinColumns = {
                @JoinColumn(name = "main_id1", referencedColumnName = "id1"),
                @JoinColumn(name = "main_id2", referencedColumnName = "id2")
        },

        inverseJoinColumns = {
                @JoinColumn(name = "dest4_id1", referencedColumnName = "id1"),
                @JoinColumn(name = "dest4_id2", referencedColumnName = "id2"),
                @JoinColumn(name = "dest4_id3", referencedColumnName = "id3")
        }
    )
    private Set<DestTable4> destTable4s = new HashSet<>();

    @ManyToMany(targetEntity = DestTable3.class, cascade = { CascadeType.PERSIST }, fetch = FetchType.EAGER)
    @JoinTable(name = "middle_table3", 
        joinColumns = {
                @JoinColumn(name = "main_id1", referencedColumnName = "id1"),
                @JoinColumn(name = "main_id2", referencedColumnName = "id2")
        },

        inverseJoinColumns = {
                @JoinColumn(name = "dest3_id1", referencedColumnName = "id1"),
                @JoinColumn(name = "dest3_id2", referencedColumnName = "id2"),
                @JoinColumn(name = "dest3_id3", referencedColumnName = "id3")
        }
    )
    private Set<DestTable3> destTable3s = new HashSet<>();

    public MainMultiPks() {
    }

    public MainMultiPks(Integer id1, Integer id2, String name,
            Set<DestTable1> destTable1s, Set<DestTable2> destTable2s,
            Set<DestTable3> destTable3s,
            Set<DestTable4> destTable4s) {
        super();
        this.id1 = id1;
        this.id2 = id2;
        this.name = name;
        this.destTable1s = destTable1s;
        this.destTable2s = destTable2s;
        this.destTable3s = destTable3s;
        this.destTable4s = destTable4s;
    }

    public static MainMultiPks build(int n) {
        Set<DestTable1> destTable1s = new HashSet<>();
        destTable1s.add(new DestTable1(n+10001, n+10002, 
                UUID.randomUUID().toString()));

        Set<DestTable2> destTable2s = new HashSet<>();
        for (int i = 20001; i < 20003;i++) {
            destTable2s.add(new DestTable2(n + i, null));
        }

        Set<DestTable3> destTable3s = new HashSet<>();
        for (int i = 30001; i < 30004;i++) {
            destTable3s.add(new DestTable3(
                    n + i + 1, n + i + 2, n + i + 3, 
                    UUID.randomUUID().toString()));
        }

        Set<DestTable4> destTable4s = new HashSet<>();
        for (int i = 40001; i < 40004;i++) {
            destTable4s.add(new DestTable4(
                    n + i + 1, n + i + 2, n + i + 3, 
                    UUID.randomUUID().toString()));
        }

        return new MainMultiPks(
                n+101,
                n+201,
                UUID.randomUUID().toString(),
                destTable1s,
                destTable2s,
                destTable3s,
                destTable4s
        ); 
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<DestTable1> getDestTable1s() {
        return destTable1s;
    }

    public void setDestTable1s(Set<DestTable1> destTable1s) {
        this.destTable1s = destTable1s;
    }

    public Set<DestTable2> getDestTable2s() {
        return destTable2s;
    }

    public void setDestTable2s(Set<DestTable2> destTable2s) {
        this.destTable2s = destTable2s;
    }

    public Set<DestTable4> getDestTable4s() {
        return destTable4s;
    }

    public void setDestTable4s(Set<DestTable4> destTable4s) {
        this.destTable4s = destTable4s;
    }

    public Set<DestTable3> getDestTable3s() {
        return destTable3s;
    }

    public void setDestTable3s(Set<DestTable3> destTable3s) {
        this.destTable3s = destTable3s;
    }

}
