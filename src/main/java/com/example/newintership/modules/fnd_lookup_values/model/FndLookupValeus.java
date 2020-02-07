package com.example.newintership.modules.fnd_lookup_values.model;

import com.example.newintership.modules.fnd_loockup_names.model.FndLookupNames;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class FndLookupValeus {


    @Id
    @GeneratedValue
    private Long lookupValueId;
    // private String lkpnmNamLookupLkpnm;
    private String valLookupLkpvl;
    private String desLatinLkpvl;
    private String desCommLkpvl;
    private Long flgEnabledLkpvl;
    private Date datStartActiveLkpvl;
    private Date datEndActiveLkpvl;
    private String desFarsiLkpvl;
    private Long numSortOrderLkpvl;

    @ManyToOne
    private FndLookupNames fndLookupNames;

    public FndLookupValeus(String valLookupLkpvl) {
    this.valLookupLkpvl=valLookupLkpvl;
    }


    public FndLookupValeus() {
    }

    public Long getLookupValueId() {
        return lookupValueId;
    }

    public void setLookupValueId(Long lookupValueId) {
        this.lookupValueId = lookupValueId;
    }

    public String getValLookupLkpvl() {
        return valLookupLkpvl;
    }

    public void setValLookupLkpvl(String valLookupLkpvl) {
        this.valLookupLkpvl = valLookupLkpvl;
    }

    public String getDesLatinLkpvl() {
        return desLatinLkpvl;
    }

    public void setDesLatinLkpvl(String desLatinLkpvl) {
        this.desLatinLkpvl = desLatinLkpvl;
    }

    public String getDesCommLkpvl() {
        return desCommLkpvl;
    }

    public void setDesCommLkpvl(String desCommLkpvl) {
        this.desCommLkpvl = desCommLkpvl;
    }

    public Long getFlgEnabledLkpvl() {
        return flgEnabledLkpvl;
    }

    public void setFlgEnabledLkpvl(Long flgEnabledLkpvl) {
        this.flgEnabledLkpvl = flgEnabledLkpvl;
    }

    public Date getDatStartActiveLkpvl() {
        return datStartActiveLkpvl;
    }

    public void setDatStartActiveLkpvl(Date datStartActiveLkpvl) {
        this.datStartActiveLkpvl = datStartActiveLkpvl;
    }

    public Date getDatEndActiveLkpvl() {
        return datEndActiveLkpvl;
    }

    public void setDatEndActiveLkpvl(Date datEndActiveLkpvl) {
        this.datEndActiveLkpvl = datEndActiveLkpvl;
    }

    public String getDesFarsiLkpvl() {
        return desFarsiLkpvl;
    }

    public void setDesFarsiLkpvl(String desFarsiLkpvl) {
        this.desFarsiLkpvl = desFarsiLkpvl;
    }

    public Long getNumSortOrderLkpvl() {
        return numSortOrderLkpvl;
    }

    public void setNumSortOrderLkpvl(Long numSortOrderLkpvl) {
        this.numSortOrderLkpvl = numSortOrderLkpvl;
    }

    public FndLookupNames getFndLookupNames() {
        return fndLookupNames;
    }

    public void setFndLookupNames(FndLookupNames fndLookupNames) {
        this.fndLookupNames = fndLookupNames;
    }


}
