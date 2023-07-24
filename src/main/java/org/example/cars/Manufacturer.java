package org.example.cars;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.Locale;
import java.util.Objects;

@AllArgsConstructor
@Builder
@Data
public class Manufacturer {

   private String name;
    private Date yeaOfEstablishment;
    private String country;


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Date getYeaOfEstablishment() {
//        return yeaOfEstablishment;
//    }
//
//    public void setYeaOfEstablishment(Date yeaOfEstablishment) {
//        this.yeaOfEstablishment = yeaOfEstablishment;
//    }
//
//    public String getCountry() {
//        return country;
//    }

//    public void setCountry(Locale.IsoCountryCode country) {
//        this.country = country;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return Objects.equals(name, that.name) && Objects.equals(yeaOfEstablishment, that.yeaOfEstablishment) && country == that.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yeaOfEstablishment, country);
    }
}
