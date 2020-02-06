package com.example.newintership.modules.fnd_application_system.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.sql.Blob;
import java.util.List;

@Entity
@Table
public class FndApplicationSystem {

    @Id
    @GeneratedValue
    private Long applicationSystemId;

    private String namAppShortAppls;
    private String desFarsiAppls;
    private String desAppPathAppls;
    private String desLatinAppls;
    private Long dlgEnabledAppls;
    private String namAppZoneAppls;
    private String namAppZoneCommAppls;
    private String desApplicationUrlAppls;
    private Blob filSysIconAppls;
    private String namIconAppls;
    private Long typAppAppls;
    private Long flgBaseRunAppls;
    private Long numSysIconAtchAppls;
    private Long numSysIconAtchSeqAppls;
    private String lkpBaseTypAppls;
    private String desLatinZoneAppls;
    private String codAppRolesAppls;

    public FndApplicationSystem() {
    }

    public Long getApplicationSystemId() {
        return applicationSystemId;
    }

    public void setApplicationSystemId(Long applicationSystemId) {
        this.applicationSystemId = applicationSystemId;
    }

    public String getNamAppShortAppls() {
        return namAppShortAppls;
    }

    public void setNamAppShortAppls(String namAppShortAppls) {
        this.namAppShortAppls = namAppShortAppls;
    }

    public String getDesFarsiAppls() {
        return desFarsiAppls;
    }

    public void setDesFarsiAppls(String desFarsiAppls) {
        this.desFarsiAppls = desFarsiAppls;
    }

    public String getDesAppPathAppls() {
        return desAppPathAppls;
    }

    public void setDesAppPathAppls(String desAppPathAppls) {
        this.desAppPathAppls = desAppPathAppls;
    }

    public String getDesLatinAppls() {
        return desLatinAppls;
    }

    public void setDesLatinAppls(String desLatinAppls) {
        this.desLatinAppls = desLatinAppls;
    }

    public Long getDlgEnabledAppls() {
        return dlgEnabledAppls;
    }

    public void setDlgEnabledAppls(Long dlgEnabledAppls) {
        this.dlgEnabledAppls = dlgEnabledAppls;
    }

    public String getNamAppZoneAppls() {
        return namAppZoneAppls;
    }

    public void setNamAppZoneAppls(String namAppZoneAppls) {
        this.namAppZoneAppls = namAppZoneAppls;
    }

    public String getNamAppZoneCommAppls() {
        return namAppZoneCommAppls;
    }

    public void setNamAppZoneCommAppls(String namAppZoneCommAppls) {
        this.namAppZoneCommAppls = namAppZoneCommAppls;
    }

    public String getDesApplicationUrlAppls() {
        return desApplicationUrlAppls;
    }

    public void setDesApplicationUrlAppls(String desApplicationUrlAppls) {
        this.desApplicationUrlAppls = desApplicationUrlAppls;
    }

    public Blob getFilSysIconAppls() {
        return filSysIconAppls;
    }

    public void setFilSysIconAppls(Blob filSysIconAppls) {
        this.filSysIconAppls = filSysIconAppls;
    }

    public String getNamIconAppls() {
        return namIconAppls;
    }

    public void setNamIconAppls(String namIconAppls) {
        this.namIconAppls = namIconAppls;
    }

    public Long getTypAppAppls() {
        return typAppAppls;
    }

    public void setTypAppAppls(Long typAppAppls) {
        this.typAppAppls = typAppAppls;
    }

    public Long getFlgBaseRunAppls() {
        return flgBaseRunAppls;
    }

    public void setFlgBaseRunAppls(Long flgBaseRunAppls) {
        this.flgBaseRunAppls = flgBaseRunAppls;
    }

    public Long getNumSysIconAtchAppls() {
        return numSysIconAtchAppls;
    }

    public void setNumSysIconAtchAppls(Long numSysIconAtchAppls) {
        this.numSysIconAtchAppls = numSysIconAtchAppls;
    }

    public Long getNumSysIconAtchSeqAppls() {
        return numSysIconAtchSeqAppls;
    }

    public void setNumSysIconAtchSeqAppls(Long numSysIconAtchSeqAppls) {
        this.numSysIconAtchSeqAppls = numSysIconAtchSeqAppls;
    }

    public String getLkpBaseTypAppls() {
        return lkpBaseTypAppls;
    }

    public void setLkpBaseTypAppls(String lkpBaseTypAppls) {
        this.lkpBaseTypAppls = lkpBaseTypAppls;
    }

    public String getDesLatinZoneAppls() {
        return desLatinZoneAppls;
    }

    public void setDesLatinZoneAppls(String desLatinZoneAppls) {
        this.desLatinZoneAppls = desLatinZoneAppls;
    }

    public String getCodAppRolesAppls() {
        return codAppRolesAppls;
    }

    public void setCodAppRolesAppls(String codAppRolesAppls) {
        this.codAppRolesAppls = codAppRolesAppls;
    }
}
