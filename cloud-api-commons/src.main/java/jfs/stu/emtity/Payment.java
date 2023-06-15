package jfs.stu.emtity;

import lombok.Data;

@Data
public class Payment {

    public Payment(float key, String value) {
        this.key = key;
        this.value = value;
    }

    private float key;

    private String value;
}
