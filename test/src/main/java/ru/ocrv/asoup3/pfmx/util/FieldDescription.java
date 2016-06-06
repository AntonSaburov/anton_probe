package ru.ocrv.asoup3.pfmx.util;


public class FieldDescription {

    public enum FieldType {
        STRING, SHORT, INT, BIGINT, RAW, DATE, TIMS
    }

    private String fieldName;
    private int offset;
    private int size;
    private FieldType fieldType;

    public FieldDescription(String fieldName, int offset, int size, FieldType fieldType) {

        this.fieldName = fieldName;
        this.offset = offset;
        this.size = size;
        this.fieldType = fieldType;
    }

    public String getFieldName() {

        return fieldName;
    }

    public void setOffset(int offset) {

        this.offset = offset;
    }

    public int getOffset() {

        return offset;
    }

    public void setSize(int size) {

        this.size = size;
    }

    public int getSize() {

        return size;
    }

    public FieldType getFieldType() {

        return fieldType;
    }

    @Override
    public String toString() {

        return ClassUtil.getString(this);
    }
}
