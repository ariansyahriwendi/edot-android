package Object;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;

public class Register extends BaseSetUp {

    private final By skip = new By.ById("");
    public void setSkip() {
        click(skip);
    }

}
