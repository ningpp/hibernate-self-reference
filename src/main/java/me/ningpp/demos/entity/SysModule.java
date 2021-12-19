package me.ningpp.demos.entity;

import java.util.HashSet;
import java.util.Set;

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
@Table(name = "sys_module")
public class SysModule {
    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToMany(targetEntity = SysModule.class, cascade = { CascadeType.PERSIST }, fetch = FetchType.EAGER)
    @JoinTable(name = "sys_module_relationship", 
        joinColumns = 
            @JoinColumn(name = "source_id", referencedColumnName = "id"), 

        inverseJoinColumns = 
            @JoinColumn(name = "target_id", referencedColumnName = "id")
    )
    private Set<SysModule> targetModules = new HashSet<>();

    public SysModule() {
    }

    public SysModule(Integer id, String name, Set<SysModule> targetModules) {
        super();
        this.id = id;
        this.name = name;
        this.targetModules = targetModules;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<SysModule> getTargetModules() {
        return targetModules;
    }
    public void setTargetModules(Set<SysModule> targetModules) {
        this.targetModules = targetModules;
    }
    @Override
    public String toString() {
        return "SysModule [id=" + id + ", name=" + name + ", targetModules=" + targetModules + "]";
    }
}
