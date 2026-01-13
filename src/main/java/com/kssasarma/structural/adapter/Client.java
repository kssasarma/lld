package com.kssasarma.structural.adapter;

import java.util.List;

public class Client {
    public static void main(String[] args) {

        // legacy data generator util class
        DatabaseDataGenerator gen = new DatabaseDataGenerator();

        // adapter to convert legacy data to display data
        DatabaseDataConverter adapter = new DisplayDataAdapter();

        // We can now use the adapter to get the data in the desired format
        List<DisplayData3rdParty> legacyData = adapter.convert(gen.generateData());

        for (DisplayData3rdParty data : legacyData) {
            data.display();
        }
    }
}
