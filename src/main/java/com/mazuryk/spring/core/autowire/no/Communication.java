package com.mazuryk.spring.core.autowire.no;

public class Communication {
    private String phone;
    private String email;
    private int zip_code;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    @Override
    public String toString() {
        return "Communication{" +
                "phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", zip_code='" + zip_code + '\'' +
                '}';
    }
}
