package com.kar.steps.Programs;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private final List<String> items = new ArrayList<>();

    public void put(String item) {
        if(item != null && !item.isEmpty()) {
            this.items.add(item);
        }
    }

    public boolean take(String item) {
        if(items.contains(item)) {
            items.remove(item);
            return true;
        }

        return false;
    }
    @Test
    public void shelfCanAcceptAndReturnItem() {
        Shelf shelf = new Shelf();
        shelf.put("Orange");
        Assert.assertTrue(shelf.take("Orange"));
    }

}
