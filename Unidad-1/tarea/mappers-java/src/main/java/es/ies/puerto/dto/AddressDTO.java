package es.ies.puerto.dto;

import java.util.Objects;

public class AddressDTO {

    private Long id;
    private String country;
    private String address;
    private String zipCode;

    private String isla;

    public AddressDTO() {
    }

    public AddressDTO(Long id) {
        this.id = id;
    }

    public AddressDTO(Long id, String country, String address, String zipCode) {
        this.id = id;
        this.country = country;
        this.address = address;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getIsla() {
        return isla;
    }

    public void setIsla(String isla) {
        this.isla = isla;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressDTO that = (AddressDTO) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
