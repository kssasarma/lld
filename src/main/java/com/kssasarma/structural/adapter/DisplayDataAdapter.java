package com.kssasarma.structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class DisplayDataAdapter implements DatabaseDataConverter {
    @Override
    public List<DisplayData3rdParty> convert(List<DatabaseData> databaseDataList) {
        List<DisplayData3rdParty> displayDataList = new ArrayList<>();
        for (DatabaseData dbData : databaseDataList) {
            float index = (float) dbData.position;
            String data = "Amount: " + dbData.amount;
            displayDataList.add(new DisplayData3rdParty(index, data));
        }
        return displayDataList;
    }

}
