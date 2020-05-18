package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {
    List<Address> collect(List<Profile> profiles) {
    return profiles.stream().map(Profile::getAddress).sorted(Comparator.comparing(Address::getCity)).distinct().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Profiles profil = new Profiles();
        List<Address> profile1 = List.of(new Address("Подольск", "Ревпроспект", 20, 36));
        List<Address> profile2 = List.of(new Address("Климовск", "Заводская", 1, 10));
        List<Address> profile3 = List.of(new Address("Климовск", "Заводская", 1, 10));
        List<Address> profile4 = List.of(new Address("Москва", "Проспект Вернадского", 2, 5));
        List<Profile> st = new ArrayList<>();
        st.add((Profile) profile1);
        st.add((Profile) profile2);
        st.add((Profile) profile3);
        st.add((Profile) profile4);
        List<Address> rsl = profil.collect(st);
        for (Object value : rsl) {
            System.out.println(value);
        }
    }
}