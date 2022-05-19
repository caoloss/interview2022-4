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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "bank_branch", catalog = "interview", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "BankBranch.findAll", query = "SELECT b FROM BankBranch b")
    , @NamedQuery(name = "BankBranch.findByBranchId", query = "SELECT b FROM BankBranch b WHERE b.branchId = :branchId")
    , @NamedQuery(name = "BankBranch.findByBranchCode", query = "SELECT b FROM BankBranch b WHERE b.branchCode = :branchCode")
    , @NamedQuery(name = "BankBranch.findByBranchName", query = "SELECT b FROM BankBranch b WHERE b.branchName = :branchName")
    , @NamedQuery(name = "BankBranch.findByDateCreated", query = "SELECT b FROM BankBranch b WHERE b.dateCreated = :dateCreated")})
public class BankBranch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "branch_id", nullable = false)
    private Long branchId;
    @Basic(optional = false)
    @Column(name = "branch_code", nullable = false, length = 255)
    private String branchCode;
    @Column(name = "branch_name", length = 255)
    private String branchName;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @JoinColumn(name = "institution_id", referencedColumnName = "institution_id")
    @ManyToOne
    private Institution institutionId;
    @OneToMany(mappedBy = "branchId")
    private List<Users> usersList;

    public BankBranch() {
    }

    public BankBranch(Long branchId) {
        this.branchId = branchId;
    }

    public BankBranch(Long branchId, String branchCode) {
        this.branchId = branchId;
        this.branchCode = branchCode;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Institution getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(Institution institutionId) {
        this.institutionId = institutionId;
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
        hash += (branchId != null ? branchId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BankBranch)) {
            return false;
        }
        BankBranch other = (BankBranch) object;
        if ((this.branchId == null && other.branchId != null) || (this.branchId != null && !this.branchId.equals(other.branchId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.interswitch.model.BankBranch[ branchId=" + branchId + " ]";
    }
    
}
