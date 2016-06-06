package ru.ocrv.asoup3.pfmx.parser;

import ru.ocrv.asoup3.pfmx.model.PfmxMessage;

public interface PfmxModelParser {

    public void processRow(PfmxMessage pfmx, byte[] modelData, int localOffset, int modelLength);

}
