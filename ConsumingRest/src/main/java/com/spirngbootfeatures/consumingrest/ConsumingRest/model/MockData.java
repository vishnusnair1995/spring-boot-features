package com.spirngbootfeatures.consumingrest.ConsumingRest.model;

import java.util.List;

public class MockData {
    private Metadata meta;
    private List<Data> data;

    public Metadata getMeta() {
        return meta;
    }

    public void setMeta(Metadata meta) {
        this.meta = meta;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
