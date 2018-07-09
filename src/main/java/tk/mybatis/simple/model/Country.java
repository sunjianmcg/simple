package tk.mybatis.simple.model;

public class Country {
    private Long id;
    private String countryname;
    private String Countrycode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return Countrycode;
    }

    public void setCountrycode(String countrycode) {
        Countrycode = countrycode;
    }
}
