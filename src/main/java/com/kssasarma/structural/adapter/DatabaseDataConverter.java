package com.kssasarma.structural.adapter;

import java.util.List;

public interface DatabaseDataConverter {
    public List<DisplayData3rdParty> convert(List<DatabaseData> databaseDataList);
}
