package ru.ocrv.asoup3.pfmx.model;

import java.io.Serializable;

import ru.ocrv.asoup3.pfmx.util.ClassUtil;

import com.google.gson.Gson;

public abstract class PfmxModelRow implements Serializable
{

    private Integer rowLength;

    public Integer getRowLength() {

        return rowLength;
    }

    public void setRowLength(Integer rowLength) {

        this.rowLength = rowLength;
    }

    public String toJson() {

        return new Gson().toJson(this);
    }

    @Override
    public String toString() {

        return ClassUtil.getString(this) + " Length:" + rowLength;
    }

}
