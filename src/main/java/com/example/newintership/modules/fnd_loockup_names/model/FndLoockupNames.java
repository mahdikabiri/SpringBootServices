package com.example.newintership.modules.fnd_loockup_names.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FndLoockupNames {
    @Id
    @GeneratedValue
    private Long lookupNameId;

    private Long applsApplicationSystemId;
    private String desLatinLkpnm;
    private String desFarsiLkpnm;
    private Long numMaximizeSizeLkpnm;
    private Long flgFixSizeLkpnm;
    private String valDefaultLkpnm;
    private Long flgEnabledLkpnm;

    public FndLoockupNames() {
    }


    public FndLoockupNames(String desFarsiLkpnm) {
        this.desFarsiLkpnm=desFarsiLkpnm;
    }
    public Long getLookupNameId() {
        return lookupNameId;
    }

    public void setLookupNameId(Long lookupNameId) {
        this.lookupNameId = lookupNameId;
    }

    public Long getApplsApplicationSystemId() {
        return applsApplicationSystemId;
    }

    public void setApplsApplicationSystemId(Long applsApplicationSystemId) {
        this.applsApplicationSystemId = applsApplicationSystemId;
    }

    public String getDesLatinLkpnm() {
        return desLatinLkpnm;
    }

    public void setDesLatinLkpnm(String desLatinLkpnm) {
        this.desLatinLkpnm = desLatinLkpnm;
    }

    public String getDesFarsiLkpnm() {
        return desFarsiLkpnm;
    }

    public void setDesFarsiLkpnm(String desFarsiLkpnm) {
        this.desFarsiLkpnm = desFarsiLkpnm;
    }

    public Long getNumMaximizeSizeLkpnm() {
        return numMaximizeSizeLkpnm;
    }

    public void setNumMaximizeSizeLkpnm(Long numMaximizeSizeLkpnm) {
        this.numMaximizeSizeLkpnm = numMaximizeSizeLkpnm;
    }

    public Long getFlgFixSizeLkpnm() {
        return flgFixSizeLkpnm;
    }

    public void setFlgFixSizeLkpnm(Long flgFixSizeLkpnm) {
        this.flgFixSizeLkpnm = flgFixSizeLkpnm;
    }

    public String getValDefaultLkpnm() {
        return valDefaultLkpnm;
    }

    public void setValDefaultLkpnm(String valDefaultLkpnm) {
        this.valDefaultLkpnm = valDefaultLkpnm;
    }

    public Long getFlgEnabledLkpnm() {
        return flgEnabledLkpnm;
    }

    public void setFlgEnabledLkpnm(Long flgEnabledLkpnm) {
        this.flgEnabledLkpnm = flgEnabledLkpnm;
    }
}
