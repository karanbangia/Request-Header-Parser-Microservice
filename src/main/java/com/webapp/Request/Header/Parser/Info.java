package com.webapp.Request.Header.Parser;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"ipaddress", "language", "software"})
public class Info {
    @JsonProperty("ipaddress")
    private String ipaddress;

    @JsonProperty("language")
    private String language;

    @JsonProperty("software")
    private String software;

    public Info(String ipaddress, String language, String software) {
        this.ipaddress = ipaddress;
        this.language = language;
        this.software = software;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public String getLanguage() {
        return language;
    }

    public String getSoftware() {
        return software;
    }


}
