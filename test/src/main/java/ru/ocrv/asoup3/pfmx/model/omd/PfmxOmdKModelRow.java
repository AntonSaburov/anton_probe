package ru.ocrv.asoup3.pfmx.model.omd;

import java.io.Serializable;

import ru.ocrv.asoup3.pfmx.util.ClassUtil;

import com.google.gson.Gson;

public class PfmxOmdKModelRow implements Serializable {

    private static final long serialVersionUID = 5733616041999149422L;

    public String toJson() {

        return new Gson().toJson(this);
    }

    @Override
    public String toString() {

        return ClassUtil.getString(this);
    }

}
