package Revisao.API_Streams_e_Generics;

import java.util.ArrayList;
import java.util.List;

import Revisao.API_Streams_e_Generics.domain.Contact;
import Revisao.API_Streams_e_Generics.domain.User;

import static Revisao.API_Streams_e_Generics.domain.ContactType.EMAIL;
import static Revisao.API_Streams_e_Generics.domain.ContactType.PHONE;
import static Revisao.API_Streams_e_Generics.domain.Sex.FEMALE;
import static Revisao.API_Streams_e_Generics.domain.Sex.MALE;

public class Main {

  public static void main(String[] args) {

    List<User> users = new ArrayList<>(generateUsers());

    var values = users
        .stream()
        .filter(u -> u.contacts().stream().anyMatch(c -> c.type() == PHONE))
        .toList();

    values.forEach(System.out::println);
    System.out.println("------");
  }

  private static List<User> generateUsers() {

    var contacts1 = List.of(
        new Contact("(51) 9845100-9900", PHONE),
        new Contact("ariel@email.com", EMAIL));
    var contacts2 = List.of(
        new Contact("(51) 99999-8888", PHONE),
        new Contact("maria@gmail.com", EMAIL));
    var contacts3 = List.of(
        new Contact("(11) 91234-5678", PHONE),
        new Contact("joao@outlook.com", EMAIL));
    var contacts4 = List.of(
        new Contact("(21) 99876-5432", PHONE),
        new Contact("ana@email.com", EMAIL));
    var contacts5 = List.of(
        new Contact("", PHONE),
        new Contact("", EMAIL));

    var user1 = new User("Ariel", 27, MALE, new ArrayList<>(contacts1));
    var user2 = new User("Maria", 12, FEMALE, new ArrayList<>(contacts2));
    var user3 = new User("Joao", 22, MALE, new ArrayList<>(contacts3));
    var user4 = new User("Ana", 25, FEMALE, new ArrayList<>(contacts4));
    var user5 = new User("Carlos", 18, MALE, new ArrayList<>(contacts5));

    return List.of(user1, user2, user3, user4, user5);
  }

}
