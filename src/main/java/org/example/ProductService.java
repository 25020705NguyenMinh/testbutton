package org.example;

public class ProductService {

    public String validatePrice(double price) {
        if (price <= 0) {
            return "Giá phải lớn hơn 0!";
        }

        return "Giá hợp lệ!";
    }
}
