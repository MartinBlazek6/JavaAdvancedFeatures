package validator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Parcel parcel = Parcel.builder()
                .weight(20.f)
                .xLength(20)
                .zLength(20)
                .yLength(20)
                .isExpress(false).build();

        Parcel parcel2 = Parcel.builder()
                .weight(20.f)
                .xLength(20)
                .zLength(20)
                .yLength(20)
                .isExpress(false).build();

        Parcel parcel3 = Parcel.builder()
                .weight(20.f)
                .xLength(20)
                .zLength(20)
                .yLength(20)
                .isExpress(false).build();

        List.of(parcel,parcel2,parcel3).forEach(p->p.validate(p));




    }
}
