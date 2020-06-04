package com.cr.generic;

public class ServiceImpl2 implements Service<String> {

    private String s;

    public ServiceImpl2(String s) {
        this.s = s;
    }

    @Override
    public String get() {
        return this.s;
    }

    public static void main(String[] args) {
        Service service = new ServiceImpl2("cr");
        service.get();
    }

}
