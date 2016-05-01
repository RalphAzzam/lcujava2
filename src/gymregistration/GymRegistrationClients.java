/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymregistration;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Toshiba
 */
@Entity
@Table(name = "gym_registration_clients", catalog = "gym_registration", schema = "")
@NamedQueries({
    @NamedQuery(name = "GymRegistrationClients.findAll", query = "SELECT g FROM GymRegistrationClients g"),
    @NamedQuery(name = "GymRegistrationClients.findByClientID", query = "SELECT g FROM GymRegistrationClients g WHERE g.clientID = :clientID"),
    @NamedQuery(name = "GymRegistrationClients.findByClientName", query = "SELECT g FROM GymRegistrationClients g WHERE g.clientName = :clientName"),
    @NamedQuery(name = "GymRegistrationClients.findByClientLname", query = "SELECT g FROM GymRegistrationClients g WHERE g.clientLname = :clientLname"),
    @NamedQuery(name = "GymRegistrationClients.findByClientTel", query = "SELECT g FROM GymRegistrationClients g WHERE g.clientTel = :clientTel"),
    @NamedQuery(name = "GymRegistrationClients.findByClientActivity", query = "SELECT g FROM GymRegistrationClients g WHERE g.clientActivity = :clientActivity"),
    @NamedQuery(name = "GymRegistrationClients.findByRegisteredDays", query = "SELECT g FROM GymRegistrationClients g WHERE g.registeredDays = :registeredDays"),
    @NamedQuery(name = "GymRegistrationClients.findByRegisteredDate", query = "SELECT g FROM GymRegistrationClients g WHERE g.registeredDate = :registeredDate")})
public class GymRegistrationClients implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "clientID")
    private Integer clientID;
    @Basic(optional = false)
    @Column(name = "clientName")
    private String clientName;
    @Basic(optional = false)
    @Column(name = "clientLname")
    private String clientLname;
    @Basic(optional = false)
    @Column(name = "clientTel")
    private String clientTel;
    @Basic(optional = false)
    @Column(name = "clientActivity")
    private String clientActivity;
    @Basic(optional = false)
    @Column(name = "registeredDays")
    private String registeredDays;
    @Basic(optional = false)
    @Column(name = "registeredDate")
    private String registeredDate;

    public GymRegistrationClients() {
    }

    public GymRegistrationClients(Integer clientID) {
        this.clientID = clientID;
    }

    public GymRegistrationClients(Integer clientID, String clientName, String clientLname, String clientTel, String clientActivity, String registeredDays, String registeredDate) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.clientLname = clientLname;
        this.clientTel = clientTel;
        this.clientActivity = clientActivity;
        this.registeredDays = registeredDays;
        this.registeredDate = registeredDate;
    }

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        Integer oldClientID = this.clientID;
        this.clientID = clientID;
        changeSupport.firePropertyChange("clientID", oldClientID, clientID);
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        String oldClientName = this.clientName;
        this.clientName = clientName;
        changeSupport.firePropertyChange("clientName", oldClientName, clientName);
    }

    public String getClientLname() {
        return clientLname;
    }

    public void setClientLname(String clientLname) {
        String oldClientLname = this.clientLname;
        this.clientLname = clientLname;
        changeSupport.firePropertyChange("clientLname", oldClientLname, clientLname);
    }

    public String getClientTel() {
        return clientTel;
    }

    public void setClientTel(String clientTel) {
        String oldClientTel = this.clientTel;
        this.clientTel = clientTel;
        changeSupport.firePropertyChange("clientTel", oldClientTel, clientTel);
    }

    public String getClientActivity() {
        return clientActivity;
    }

    public void setClientActivity(String clientActivity) {
        String oldClientActivity = this.clientActivity;
        this.clientActivity = clientActivity;
        changeSupport.firePropertyChange("clientActivity", oldClientActivity, clientActivity);
    }

    public String getRegisteredDays() {
        return registeredDays;
    }

    public void setRegisteredDays(String registeredDays) {
        String oldRegisteredDays = this.registeredDays;
        this.registeredDays = registeredDays;
        changeSupport.firePropertyChange("registeredDays", oldRegisteredDays, registeredDays);
    }

    public String getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(String registeredDate) {
        String oldRegisteredDate = this.registeredDate;
        this.registeredDate = registeredDate;
        changeSupport.firePropertyChange("registeredDate", oldRegisteredDate, registeredDate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientID != null ? clientID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GymRegistrationClients)) {
            return false;
        }
        GymRegistrationClients other = (GymRegistrationClients) object;
        if ((this.clientID == null && other.clientID != null) || (this.clientID != null && !this.clientID.equals(other.clientID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gymregistration.GymRegistrationClients[ clientID=" + clientID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
