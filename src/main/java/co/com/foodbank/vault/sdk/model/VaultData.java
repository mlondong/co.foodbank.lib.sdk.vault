package co.com.foodbank.vault.sdk.model;

import java.util.Collection;
import co.com.foodbank.address.dto.Address;
import co.com.foodbank.address.dto.IAddress;
import co.com.foodbank.contribution.dto.IContribution;

public class VaultData {

    private String id;

    private Address address;

    private String phones;

    private String contact;

    private Collection<IContribution> contribution;


    public VaultData() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public VaultData(Address address, String phones, String contact,
            Collection<IContribution> contribution) {
        this.address = address;
        this.phones = phones;
        this.contact = contact;
        this.contribution = contribution;
    }

    public IAddress getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhones() {
        return phones;
    }

    public void setPhones(String phones) {
        this.phones = phones;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Collection<IContribution> getContribution() {
        return contribution;
    }

    public void setContribution(Collection<IContribution> contribution) {
        this.contribution = contribution;
    }



}
