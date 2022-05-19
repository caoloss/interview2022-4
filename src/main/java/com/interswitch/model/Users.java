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
@Table(name = "users", catalog = "interview", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")
    , @NamedQuery(name = "Users.findByUserId", query = "SELECT u FROM Users u WHERE u.userId = :userId")
    , @NamedQuery(name = "Users.findByUsername", query = "SELECT u FROM Users u WHERE u.username = :username")
    , @NamedQuery(name = "Users.findByPassword", query = "SELECT u FROM Users u WHERE u.password = :password")
    , @NamedQuery(name = "Users.findByLastName", query = "SELECT u FROM Users u WHERE u.lastName = :lastName")
    , @NamedQuery(name = "Users.findByFirstName", query = "SELECT u FROM Users u WHERE u.firstName = :firstName")
    , @NamedQuery(name = "Users.findByEmailAddress", query = "SELECT u FROM Users u WHERE u.emailAddress = :emailAddress")
    , @NamedQuery(name = "Users.findByDateCreated", query = "SELECT u FROM Users u WHERE u.dateCreated = :dateCreated")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "user_id", nullable = false)
    private Long userId;
    @Column(name = "username", length = 1)
    private String username;
    @Column(name = "password", length = 255)
    private String password;
    @Column(name = "last_name", length = 255)
    private String lastName;
    @Column(name = "first_name", length = 255)
    private String firstName;
    @Column(name = "email_address", length = 255)
    private String emailAddress;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @OneToMany(mappedBy = "userId")
    private List<UsersAssignedRole> usersAssignedRoleList;
    @OneToMany(mappedBy = "userId")
    private List<LeaveManagement> leaveManagementList;
    @OneToMany(mappedBy = "leaveApprover")
    private List<LeaveManagement> leaveManagementList1;
    @JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
    @ManyToOne
    private BankBranch branchId;
    @JoinColumn(name = "emp_dept_id", referencedColumnName = "emp_dept_id")
    @ManyToOne
    private EmpDept empDeptId;
    @JoinColumn(name = "institution_id", referencedColumnName = "institution_id")
    @ManyToOne
    private Institution institutionId;

    public Users() {
    }

    public Users(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<UsersAssignedRole> getUsersAssignedRoleList() {
        return usersAssignedRoleList;
    }

    public void setUsersAssignedRoleList(List<UsersAssignedRole> usersAssignedRoleList) {
        this.usersAssignedRoleList = usersAssignedRoleList;
    }

    public List<LeaveManagement> getLeaveManagementList() {
        return leaveManagementList;
    }

    public void setLeaveManagementList(List<LeaveManagement> leaveManagementList) {
        this.leaveManagementList = leaveManagementList;
    }

    public List<LeaveManagement> getLeaveManagementList1() {
        return leaveManagementList1;
    }

    public void setLeaveManagementList1(List<LeaveManagement> leaveManagementList1) {
        this.leaveManagementList1 = leaveManagementList1;
    }

    public BankBranch getBranchId() {
        return branchId;
    }

    public void setBranchId(BankBranch branchId) {
        this.branchId = branchId;
    }

    public EmpDept getEmpDeptId() {
        return empDeptId;
    }

    public void setEmpDeptId(EmpDept empDeptId) {
        this.empDeptId = empDeptId;
    }

    public Institution getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(Institution institutionId) {
        this.institutionId = institutionId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.interswitch.model.Users[ userId=" + userId + " ]";
    }
    
}
