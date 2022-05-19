/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interswitch.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity
@Table(name = "institution", catalog = "interview", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Institution.findAll", query = "SELECT i FROM Institution i")
    , @NamedQuery(name = "Institution.findByInstitutionId", query = "SELECT i FROM Institution i WHERE i.institutionId = :institutionId")
    , @NamedQuery(name = "Institution.findByInstitutionCode", query = "SELECT i FROM Institution i WHERE i.institutionCode = :institutionCode")
    , @NamedQuery(name = "Institution.findByInstitutionName", query = "SELECT i FROM Institution i WHERE i.institutionName = :institutionName")
    , @NamedQuery(name = "Institution.findByDateCreated", query = "SELECT i FROM Institution i WHERE i.dateCreated = :dateCreated")})
public class Institution implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "institution_id", nullable = false)
    private Long institutionId;
    @Basic(optional = false)
    @Column(name = "institution_code", nullable = false, length = 255)
    private String institutionCode;
    @Column(name = "institution_name", length = 255)
    private String institutionName;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @OneToMany(mappedBy = "institutionId")
    private List<BankBranch> bankBranchList;
    @OneToMany(mappedBy = "institutionId")
    private List<Users> usersList;

    public Institution() {
    }

    public Institution(Long institutionId) {
        this.institutionId = institutionId;
    }

    public Institution(Long institutionId, String institutionCode) {
        this.institutionId = institutionId;
        this.institutionCode = institutionCode;
    }

    public Long getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(Long institutionId) {
        this.institutionId = institutionId;
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<BankBranch> getBankBranchList() {
        return bankBranchList;
    }

    public void setBankBranchList(List<BankBranch> bankBranchList) {
        this.bankBranchList = bankBranchList;
    }

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (institutionId != null ? institutionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Institution)) {
            return false;
        }
        Institution other = (Institution) object;
        if ((this.institutionId == null && other.institutionId != null) || (this.institutionId != null && !this.institutionId.equals(other.institutionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.interswitch.model.Institution[ institutionId=" + institutionId + " ]";
    }
    
}
