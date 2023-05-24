package Object;

import BaseClass.BaseSetUp;
import org.openqa.selenium.By;

public class Login extends BaseSetUp {

    private final By masuk = new By.ById("btn_login");
    public void setMasuk() {
        click(masuk);
    }

    private final By nomorHP = new By.ById("etPhonePontaNumber");
    public void setNomorHP(String x) {
        input(nomorHP, x);
    }

}
