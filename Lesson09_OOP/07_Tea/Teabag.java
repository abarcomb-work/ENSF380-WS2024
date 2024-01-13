/*
Copyright Ann Barcomb and Emily Marasco, 2022
Licensed under GPL v3
See LICENSE.txt for more information.
*/

public class Teabag {
    private final String UNKWN = "unknown";
    private final String teaType;
    private final String teaOrigin;
    private final String teaBrand;

    public String getTeaType() { return this.teaType; }
    public String getTeaOrigin() { return this.teaOrigin; }
    public String getTeaBrand() { return this.teaBrand; }

    public Teabag(String teaType) {
        this.teaType = teaType;
        this.teaOrigin = UNKWN;
        this.teaBrand = UNKWN;
    }

    public Teabag(String teaType, String country) {
        this.teaType = teaType;
        this.teaOrigin = country;
        this.teaBrand = UNKWN;
    }

    public Teabag(String teaType, String country, String brand) {
        this.teaType = teaType;
        this.teaOrigin = country;
        this.teaBrand = brand;
    }

    public Teabag() {
        this.teaType = "samdayeon";
        this.teaOrigin = "Korea";
        this.teaBrand = UNKWN;
    }
}


