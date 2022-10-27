package kodlama.io.LessonFour.entities.concretes;


import javax.validation.Valid;

public class SoftwareLanguages {

    private int softwareLanguagesId;

    @Valid
    private String softwareLanguagesName;

    public SoftwareLanguages() {
    }

    public SoftwareLanguages(int softwareLanguagesId, String softwareLanguagesName) {
        this.softwareLanguagesId = softwareLanguagesId;
        this.softwareLanguagesName = softwareLanguagesName;
    }

    public int getSoftwareLanguagesId() {
        return softwareLanguagesId;
    }

    public void setSoftwareLanguagesId(int softwareLanguagesId) {
        this.softwareLanguagesId = softwareLanguagesId;
    }

    public String getSoftwareLanguagesName() {
        return softwareLanguagesName;
    }

    public void setSoftwareLanguagesName(String softwareLanguagesName) {
        this.softwareLanguagesName = softwareLanguagesName;
    }
}
