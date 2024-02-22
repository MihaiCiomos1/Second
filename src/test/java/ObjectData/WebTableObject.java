package ObjectData;

import java.util.HashMap;

public class WebTableObject {
    private String firstN;
    private String lastN;
    private String email;
    private String ageNr;
    private String salaryVal;
    private String departmentName;

    public WebTableObject(HashMap<String, String> testData) {
        populateData(testData);
    }

    public void populateData(HashMap<String,String> testData)
    {
        for(String key : testData.keySet())
        {
            switch (key)
            {
                case "firstName" :
                    setFirstN(testData.get(key));
                    break;
                case "lastName" :
                    setLastN(testData.get(key));
                case "email" :
                    setLastN(testData.get(key));
                case "ageNr" :
                    setLastN(testData.get(key));
                case "salaryVal" :
                    setLastN(testData.get(key));
                case "departmentName" :
                    setLastN(testData.get(key));
            }
        }
    }

    public String getFirstN() {
        return firstN;
    }

    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    public String getLastN() {
        return lastN;
    }

    public void setLastN(String lastN) {
        this.lastN = lastN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAgeNr() {
        return ageNr;
    }

    public void setAgeNr(String ageNr) {
        this.ageNr = ageNr;
    }

    public String getSalaryVal() {
        return salaryVal;
    }

    public void setSalaryVal(String salaryVal) {
        this.salaryVal = salaryVal;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
