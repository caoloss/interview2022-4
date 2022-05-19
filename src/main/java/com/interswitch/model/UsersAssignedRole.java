/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.interswitch.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author User
 */
@Entity
@Table(name = "users_assigned_role", catalog = "interview", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "UsersAssignedRole.findAll", query = "SELECT u FROM UsersAssignedRole u")
    , @NamedQuery(name = "UsersAssignedRole.findByUsersAssignedRoleId", query = "SELECT u FROM UsersAssignedRole u WHERE u.usersAssignedRoleId = :usersAssignedRoleId")
    , @NamedQuery(name = "UsersAssignedRole.findByDateCreated", query = "SELECT u FROM UsersAssignedRole u WHERE u.dateCreated = :dateCreated")})
public class UsersAssignedRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "users_assigned_role_id", nullable = false)
    private Long usersAssignedRoleId;
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    @ManyToOne
    private UserRoles roleId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne
    private Users userId;

    public UsersAssignedRole() {
    }

    public UsersAssignedRole(Long usersAssignedRoleId) {
        this.usersAssignedRoleId = usersAssignedRoleId;
    }

    public Long getUsersAssignedRoleId() {
        return usersAssignedRoleId;
    }

    public void setUsersAssignedRoleId(Long usersAssignedRoleId) {
        this.usersAssignedRoleId = usersAssignedRoleId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public UserRoles getRoleId() {
        return roleId;
    }

    public void setRoleId(UserRoles roleId) {
        this.roleId = roleId;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usersAssignedRoleId != null ? usersAssignedRoleId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsersAssignedRole)) {
            return false;
        }
        UsersAssignedRole other = (UsersAssignedRole) object;
        if ((this.usersAssignedRoleId == null && other.usersAssignedRoleId != null) || (this.usersAssignedRoleId != null && !this.usersAssignedRoleId.equals(other.usersAssignedRoleId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.interswitch.model.UsersAssignedRole[ usersAssignedRoleId=" + usersAssignedRoleId + " ]";
    }
    
}
