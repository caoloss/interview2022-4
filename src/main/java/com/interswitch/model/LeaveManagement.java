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
@Table(name = "leave_management", catalog = "interview", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "LeaveManagement.findAll", query = "SELECT l FROM LeaveManagement l")
    , @NamedQuery(name = "LeaveManagement.findByLeaveRequestId", query = "SELECT l FROM LeaveManagement l WHERE l.leaveRequestId = :leaveRequestId")
    , @NamedQuery(name = "LeaveManagement.findByLeavestartdate", query = "SELECT l FROM LeaveManagement l WHERE l.leavestartdate = :leavestartdate")
    , @NamedQuery(name = "LeaveManagement.findByLeaveEndDate", query = "SELECT l FROM LeaveManagement l WHERE l.leaveEndDate = :leaveEndDate")
    , @NamedQuery(name = "LeaveManagement.findByLeaveStatus", query = "SELECT l FROM LeaveManagement l WHERE l.leaveStatus = :leaveStatus")
    , @NamedQuery(name = "LeaveManagement.findByRequestDate", query = "SELECT l FROM LeaveManagement l WHERE l.requestDate = :requestDate")
    , @NamedQuery(name = "LeaveManagement.findByApproverDate", query = "SELECT l FROM LeaveManagement l WHERE l.approverDate = :approverDate")})
public class LeaveManagement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "leave_request_id", nullable = false)
    private Long leaveRequestId;
    @Column(name = "Leave_start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date leavestartdate;
    @Column(name = "leave_end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date leaveEndDate;
    @Column(name = "leave_status")
    private Boolean leaveStatus;
    @Column(name = "request_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date requestDate;
    @Column(name = "approver_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date approverDate;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne
    private Users userId;
    @JoinColumn(name = "leave_approver", referencedColumnName = "user_id")
    @ManyToOne
    private Users leaveApprover;

    public LeaveManagement() {
    }

    public LeaveManagement(Long leaveRequestId) {
        this.leaveRequestId = leaveRequestId;
    }

    public Long getLeaveRequestId() {
        return leaveRequestId;
    }

    public void setLeaveRequestId(Long leaveRequestId) {
        this.leaveRequestId = leaveRequestId;
    }

    public Date getLeavestartdate() {
        return leavestartdate;
    }

    public void setLeavestartdate(Date leavestartdate) {
        this.leavestartdate = leavestartdate;
    }

    public Date getLeaveEndDate() {
        return leaveEndDate;
    }

    public void setLeaveEndDate(Date leaveEndDate) {
        this.leaveEndDate = leaveEndDate;
    }

    public Boolean getLeaveStatus() {
        return leaveStatus;
    }

    public void setLeaveStatus(Boolean leaveStatus) {
        this.leaveStatus = leaveStatus;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getApproverDate() {
        return approverDate;
    }

    public void setApproverDate(Date approverDate) {
        this.approverDate = approverDate;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public Users getLeaveApprover() {
        return leaveApprover;
    }

    public void setLeaveApprover(Users leaveApprover) {
        this.leaveApprover = leaveApprover;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (leaveRequestId != null ? leaveRequestId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LeaveManagement)) {
            return false;
        }
        LeaveManagement other = (LeaveManagement) object;
        if ((this.leaveRequestId == null && other.leaveRequestId != null) || (this.leaveRequestId != null && !this.leaveRequestId.equals(other.leaveRequestId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.interswitch.model.LeaveManagement[ leaveRequestId=" + leaveRequestId + " ]";
    }
    
}
