package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String countryCode = null;
            for (Map.Entry<String, String> pair : countries.entrySet()
                 ) {
                String key = pair.getKey();
                String value = pair.getValue();
                if (value.equals(this.customer.getCountryName())){
                    countryCode = key;
                    break;
                }
            }
            return countryCode;
        }

        @Override
        public String getCompany() {
            return this.customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            return this.contact.getName().split(", ")[1];
        }

        @Override
        public String getContactLastName() {
            return this.contact.getName().split(", ")[0];
        }

        @Override
        public String getDialString() {
            return "callto://+" + this.contact.getPhoneNumber().replaceAll("[^0-9]", "");
            /*String[] phoneNumber = contact.getPhoneNumber().split("");
            StringBuilder result = new StringBuilder(22);
            result.append("callto://+");
            for (int i = 0; i < phoneNumber.length; i++) {
                try {
                    result.append(Integer.parseInt(phoneNumber[i]));
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
            return result;*/
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}