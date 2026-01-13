package com.kssasarma.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class DatabaseDataGenerator {
    public List<DatabaseData> generateData() {
        List<DatabaseData> dataList = new ArrayList<>();
        dataList.add(new DatabaseData(1, 100));
        dataList.add(new DatabaseData(2, 200));
        dataList.add(new DatabaseData(3, 300));
        return dataList;
    }
}
