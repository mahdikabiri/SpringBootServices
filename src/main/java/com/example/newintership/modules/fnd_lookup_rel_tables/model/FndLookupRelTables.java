package com.example.newintership.modules.fnd_lookup_rel_tables.model;

import com.example.newintership.modules.fnd_loockup_names.model.FndLookupNames;

import javax.persistence.*;

@Entity
@Table
public class FndLookupRelTables {
    @Id
    @GeneratedValue
    private Long lookupRelTablesId;

    //private String LkpnmNamLookupLkpnm;
    private String namTableLkprt;
    private String namColumnLkprt;

    @ManyToOne
    private FndLookupNames fndLookupNames;

    public FndLookupRelTables() {
    }

    public FndLookupRelTables(String namColumnLkprt) {
        this.namColumnLkprt=namColumnLkprt;
    }


    public Long getLookupRelTablesId() {
        return lookupRelTablesId;
    }

    public void setLookupRelTablesId(Long lookupRelTablesId) {
        this.lookupRelTablesId = lookupRelTablesId;
    }

    public String getNamTableLkprt() {
        return namTableLkprt;
    }

    public void setNamTableLkprt(String namTableLkprt) {
        this.namTableLkprt = namTableLkprt;
    }

    public String getNamColumnLkprt() {
        return namColumnLkprt;
    }

    public void setNamColumnLkprt(String namColumnLkprt) {
        this.namColumnLkprt = namColumnLkprt;
    }
}
