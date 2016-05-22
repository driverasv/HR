/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.promerica.hr.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Dora
 */
@Embeddable
public class JobHistoryPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "EMPLOYEE_ID", nullable = false)
    private int employeeId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "START_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    public JobHistoryPK() {
    }

    public JobHistoryPK(int employeeId, Date startDate) {
        this.employeeId = employeeId;
        this.startDate = startDate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) employeeId;
        hash += (startDate != null ? startDate.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JobHistoryPK)) {
            return false;
        }
        JobHistoryPK other = (JobHistoryPK) object;
        if (this.employeeId != other.employeeId) {
            return false;
        }
        if ((this.startDate == null && other.startDate != null) || (this.startDate != null && !this.startDate.equals(other.startDate))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.promerica.hr.model.JobHistoryPK[ employeeId=" + employeeId + ", startDate=" + startDate + " ]";
    }
    
}
