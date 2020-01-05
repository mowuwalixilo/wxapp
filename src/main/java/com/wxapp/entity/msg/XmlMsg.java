package com.wxapp.entity.msg;

import java.util.List;

/**
 * {
 *   "toWxIds": [
 *     "string"
 *   ],
 *   "xml": "string",
 *   "wxId": "string"
 * }
 */
public class XmlMsg {
    private List<String> toWxIds;
    private String xml;
    private String wxId;

    public XmlMsg( ) {
    }

    public XmlMsg(List<String> toWxIds, String xml, String wxId) {
        this.toWxIds = toWxIds;
        this.xml = xml;
        this.wxId = wxId;
    }

    public List<String> getToWxIds() {
        return toWxIds;
    }

    public void setToWxIds(List<String> toWxIds) {
        this.toWxIds = toWxIds;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public String getWxId() {
        return wxId;
    }

    public void setWxId(String wxId) {
        this.wxId = wxId;
    }
}
