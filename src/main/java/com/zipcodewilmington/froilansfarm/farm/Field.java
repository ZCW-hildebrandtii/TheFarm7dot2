package com.zipcodewilmington.froilansfarm.farm;

import java.util.ArrayList;
import java.util.List;

public class Field {

    List<CropRow> cropRows;

    public Field(List<CropRow> cropRows) {
        this.cropRows = new ArrayList<>();
    }

    public Field(int noOfCropRow) {
        for (int i = 0; i < noOfCropRow; i++) {
            this.cropRows.add(new CropRow());
        }
    }

    public Field() {

    }

    public void add(List<CropRow> cropRows) {
        cropRows.addAll(cropRows);
    }

    public void add(CropRow cropRow) {
        cropRows.add(cropRow);
    }

    public List<CropRow> getCropRows() {
        return this.cropRows;
    }

    public void reset() {
        int noOfCropRow = this.cropRows.size();
        this.cropRows.clear();
        for (int i = 0; i < noOfCropRow; i++) {
            this.cropRows.add(new CropRow());
        }
    }
}
