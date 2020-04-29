package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {

    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            for (Account value : list) {
                if (!value.equals(account)) {
                    list.add(account);
                } else {
                    System.out.println("Такой счет у пользователя уже есть");
                }
            }
            } else {
            System.out.println("Пользователь не найден!");
        }
    }

    public User findByPassport(String passport) {
        User result = null;
        for (User key : users.keySet()) {
         if (key.getPassport().equals(passport)) {
             result = key;
             break;
         }
        }
        return result;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account result = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
            for (Account value : list) {
               if (value.getRequisite().equals(requisite)) {
                   result = value;
                   break;
               }
            }
        }
        return result;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account valueDest = findByRequisite(destPassport, destRequisite);
        Account valueSrc = findByRequisite(srcPassport, srcRequisite);
        if (valueSrc.getBalance() >= amount && valueSrc != null && valueDest != null) {
        valueDest.setBalance(valueDest.getBalance() + amount);
        valueSrc.setBalance(valueSrc.getBalance() - amount);
        rsl = true;
        }
        return rsl;
    }
}