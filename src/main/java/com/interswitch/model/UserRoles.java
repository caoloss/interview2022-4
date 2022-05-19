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
@Table(name = "user_roles", catalog = "interview", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "UserRoles.findAll", query = "SELECT u FROM UserRoles u")
    , @NamedQuery(name = "UserRoles.findByRoleId", query = "SELECT u FROM UserRoles u WHERE u.roleId = :roleId")
    , @NamedQuery(name = "UserRoles.findByRoleName", query = "SELECT u FROM UserRoles u WHERE u.roleName = :roleName")
    , @NamedQuery(name = "UserRoles.findByDateCreated", query = "SELECT u FROM UserRoles u WHERE u.dateCreated = :dateCreated")
    , @NamedQuery(name = "UserRoles.findByRoleCode", query = "SELECT u FROM UserRoles u WHERE u.roleCode = :roleCode")
    , @NamedQuery(name = "UserRoles.findByRoleDescription", query = "SELECT u FROM UserRoles u WHERE u.roleDescription = :roleDescription")})
public class UserRoles implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "role_id", nullable = false)
    private Long roleId;
    @Column(name = "role_name", length = 255)
    private String roleName;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "role_code", length = 255)
    private String roleCode;
    @Column(name = "role_description", length = 255)
    private String roleDescription;
    @OneToMany(mappedBy = "roleId")
    private List<UsersAssignedRole> usersAssignedRoleList;

    public UserRoles() {
    }

    public UserRoles(Long roleId) {
        this.roleId = roleId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
    }

    public List<UsersAssignedRole> getUsersAssignedRoleList() {
        return usersAssignedRoleList;
    }

    public void setUsersAssignedRoleList(List<UsersAssignedRole> usersAssignedRoleList) {
        this.usersAssignedRoleList = usersAssignedRoleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roleId != null ? roleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserRoles)) {
            return false;
        }
        UserRoles other = (UserRoles) object;
        if ((this.roleId == null && other.roleId != null) || (this.roleId != null && !this.roleId.equals(other.roleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.interswitch.model.UserRoles[ roleId=" + roleId + " ]";
    }
    
}
