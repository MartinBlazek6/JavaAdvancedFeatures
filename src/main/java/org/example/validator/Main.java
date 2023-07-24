package org.example.validator;

public class Main {
    public static void main(String[] args) {
        Parcel parcel1 = new Parcel(20, 20, 20, 20.0f, false);
        Parcel parcel2 = new Parcel(30, 40, 50, 15.0f, true);


        System.out.println("Parcel 1 is valid: " + parcel1.validate(parcel1));
        System.out.println("Parcel 2 is valid: " + parcel2.validate(parcel2));

    }
}
