package TestStep;

import BaseClass.BaseSetUp;
import BaseClass.BaseStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static io.appium.java_client.remote.MobileCapabilityType.NO_RESET;

public class LoginStep extends BaseStep {

    @Given("Account created")
    public void accountCreated() {
    }

    @Given("Application opened")
    public void applicationOpened() {
    }

    @Given("Account not logged in")
    public void accountNotLoggedIn() {
        BaseSetUp.reset();
    }

    @When("I click button Masuk")
    public void iClickButtonMasuk() {
        login.setMasuk();
    }

    @And("I input {string} on field Nomor HP atau No. kartu member")
    public void iInputOnFieldNomorHPNoKartuMember(String x) {
        login.setNomorHP(x);
    }

    @And("I input {string} on field Masukkan Password")
    public void iInputOnFieldMasukkanPassword(String x) {
        login.setPassword(x);
    }

    @And("I click button Lanjut")
    public void iClickButtonLanjut() {
        login.setLanjut();
    }

    @Then("Success to login")
    public void successToLogin() throws InterruptedException {
        Thread.sleep(2000);
        login.setWelcomeLogin();
    }

    @Then("Open to beranda page")
    public void openToBerandaPage() {
    }

    @Then("Fail to login")
    public void failToLogin() {
    }

    @Then("Error message Password Anda salah. Silahkan coba lagi")
    public void errorMessagePasswordAndaSalahSilahkanCobaLagi() {
        login.setErrorPasswordSalah();
    }

    @Given("Device connected with account 081806442929")
    public void deviceConnectedWithAccount081806442929() {
    }

    @Then("Pop up error message Login Gagal, Maaf device ini sudah terhubung dengan Id:xxx, No:xxx, dan No Hp:0818xxxxx929. Mohon hubungi Sahabat Alfamart")
    public void popUpErrorMessageLoginGagalMaafDeviceIniSudahTerhubungDenganIdXxxNoXxxDanNoHp0818xxxxx929MohonHubungiSahabatAlfamart() {
        login.setErrorDeviceTerhubung();
    }

    @Then("Error message Nomor HP atau No. kartu Member tidak boleh kosong")
    public void errorMessageNomorHPAtauNoKartuMemberTidakBolehKosong() {
        login.setErrorPhoneNumber();
    }

    @Then("Error message Kolom ini diperlukan")
    public void errorMessageKolomIniDiperlukan() {
        login.setErrorPassword();
    }

    @Then("Error message Password minimum delapan karakter")
    public void errorMessagePasswordMinimumDelapanKarakter() {
        login.setErrorPassword();
    }

    @And("I click icon visible password")
    public void iClickIconVisiblePassword() {
        login.setVisiblePassword();
    }
}
