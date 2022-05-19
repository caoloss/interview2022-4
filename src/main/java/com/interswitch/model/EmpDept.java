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
@Table(name = "emp_dept", catalog = "interview", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "EmpDept.findAll", query = "SELECT e FROM EmpDept e")
    , @NamedQuery(name = "EmpDept.findByEmpDeptId", query = "SELECT e FROM EmpDept e WHERE e.empDeptId = :empDeptId")
    , @NamedQuery(name = "EmpDept.findByEmpDeptName", query = "SELECT e FROM EmpDept e WHERE e.empDeptName = :empDeptName")
    , @NamedQuery(name = "EmpDept.findByDateCreated", query = "SELECT e FROM EmpDept e WHERE e.dateCreated = :dateCreated")})
public class EmpDept implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "emp_dept_id", nullable = false)
    private Long empDeptId;
    @Column(name = "emp_dept_name", length = 255)
    private String empDeptName;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @OneToMany(mappedBy = "empDeptId")
    private List<Users> usersList;

    public EmpDept() {
    }

    public EmpDept(Long empDeptId) {
        this.empDeptId = empDeptId;
    }

    public Long getEmpDeptId() {
        return empDeptId;
    }

    public void setEmpDeptId(Long empDeptId) {
        this.empDeptId = empDeptId;
    }

    public String getEmpDeptName() {
        return empDeptName;
    }

    public void setEmpDeptName(String empDeptName) {
        this.empDeptName = empDeptName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
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
        hash += (empDeptId != null ? empDeptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpDept)) {
            return false;
        }
        EmpDept other = (EmpDept) object;
        if ((this.empDeptId == null && other.empDeptId != null) || (this.empDeptId != null && !this.empDeptId.equals(other.empDeptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.interswitch.model.EmpDept[ empDeptId=" + empDeptId + " ]";
    }
    
}
