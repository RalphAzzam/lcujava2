/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymregistration;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Toshiba
 */
@Entity
@Table(name = "gymclients", catalog = "gymregistration", schema = "")
@NamedQueries({
    @NamedQuery(name = "Gymclients.findAll", query = "SELECT g FROM Gymclients g"),
    @NamedQuery(name = "Gymclients.findByClientID", query = "SELECT g FROM Gymclients g WHERE g.clientID = :clientID"),
    @NamedQuery(name = "Gymclients.findByClientName", query = "SELECT g FROM Gymclients g WHERE g.clientName = :clientName"),
    @NamedQuery(name = "Gymclients.findByClientLname", query = "SELECT g FROM Gymclients g WHERE g.clientLname = :clientLname"),
    @NamedQuery(name = "Gymclients.findByClientTel", query = "SELECT g FROM Gymclients g WHERE g.clientTel = :clientTel"),
    @NamedQuery(name = "Gymclients.findByClientActivity", query = "SELECT g FROM Gymclients g WHERE g.clientActivity = :clientActivity"),
    @NamedQuery(name = "Gymclients.findByRegisteredDays", query = "SELECT g FROM Gymclients g WHERE g.registeredDays = :registeredDays"),
    @NamedQuery(name = "Gymclients.findByDataRegistered", query = "SELECT g FROM Gymclients g WHERE g.dataRegistered = :dataRegistered")})
public class Gymclients implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @Column(name = "dataRegistered")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataRegistered;

    public Gymclients() {
    }

    public Gymclients(Integer clientID) {
        this.clientID = clientID;
    }

    public Gymclients(Integer clientID, String clientName, String clientLname, String clientTel, String clientActivity, String registeredDays, Date dataRegistered) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.clientLname = clientLname;
        this.clientTel = clientTel;
        this.clientActivity = clientActivity;
        this.registeredDays = registeredDays;
        this.dataRegistered = dataRegistered;
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

    public Date getDataRegistered() {
        return dataRegistered;
    }

    public void setDataRegistered(Date dataRegistered) {
        Date oldDataRegistered = this.dataRegistered;
        this.dataRegistered = dataRegistered;
        changeSupport.firePropertyChange("dataRegistered", oldDataRegistered, dataRegistered);
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
        if (!(object instanceof Gymclients)) {
            return false;
        }
        Gymclients other = (Gymclients) object;
        if ((this.clientID == null && other.clientID != null) || (this.clientID != null && !this.clientID.equals(other.clientID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gymregistration.Gymclients[ clientID=" + clientID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
