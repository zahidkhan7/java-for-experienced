package com.zad.excellence.practice.standard.model;

public class Customer
{
        private int customerId;
        private String customerName;
        private String mailId;
        private long phoneNumber;

        public Customer()
        {
        }

        public Customer(String name)
        {
                this.customerName = name;
        }

        public Customer(int custId, String name, String mail, long phoneNo)
        {
                this.customerId = custId;
                this.customerName = name;
                this.mailId = mail;
                this.phoneNumber = phoneNo;
        }

        public int getCustomerId()
        {
                return customerId;
        }

        public void setCustomerId(int customerId)
        {
                this.customerId = customerId;
        }

        public String getCustomerName()
        {
                return customerName;
        }

        public void setCustomerName(String customerName)
        {
                this.customerName = customerName;
        }

        public String getMailId()
        {
                return mailId;
        }

        public void setMailId(String mailId)
        {
                this.mailId = mailId;
        }

        public long getPhoneNumber()
        {
                return phoneNumber;
        }

        public void setPhoneNumber(long phoneNumber)
        {
                this.phoneNumber = phoneNumber;
        }

        @Override
        public boolean equals(Object obj)
        {
                if ((obj instanceof Customer)
                                && (((Customer) obj).getCustomerId() == this.getCustomerId()))
                {
                        return true;
                } else
                {
                        return false;
                }
        }

        @Override
        public int hashCode()
        {
                int result = 0;
                result = (int) (customerId / 16);
                return result;
        }

        @Override
        public String toString()
        {
                return "Customer Details: " + this.customerId + " : "
                                + this.customerName + " : " + this.mailId;
        }
}
