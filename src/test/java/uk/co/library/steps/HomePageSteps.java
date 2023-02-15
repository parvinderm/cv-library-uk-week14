package uk.co.library.steps;

import com.sun.org.apache.bcel.internal.generic.NEW;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uk.co.library.pages.HomePage;

public class HomePageSteps {
    @Given("^I am on homepage$")
    public void i_am_on_homepage()  {
        
    }

    @When("^User accept cookies$")
    public void user_accept_cookies() throws InterruptedException {
        new HomePage().acceptCookiesandSwitchToFrame();

    }

    @And("^User enter job title \"([^\"]*)\"$")
    public void user_enter_job_title(String jobT)  {
        new HomePage().enterJobTitle(jobT);
    }

    @And("^User enter Location \"([^\"]*)\"$")
    public void user_enter_Location(String locT)  {
      new HomePage().enterLocation(locT);
    }

    @And("^User select distance \"([^\"]*)\"$")
    public void user_select_distance(String dist)  {
     new HomePage().selectDistanceFromDropDown(dist);
    }

    @And("^User click on moreSearchOptionsLink$")
    public void user_click_on_moreSearchOptionsLink()  {
        new HomePage().userClickOnMoreSearchOptionLink();
    }

    @And("^User enter salaryMin \"([^\"]*)\"$")
    public void user_enter_salaryMin(String minSal)  {
        new HomePage().enterMinSalary(minSal);

    }

    @And("^User enter salaryMax \"([^\"]*)\"$")
    public void user_enter_salaryMax(String maxS)  {
        new HomePage().enterMaxSalary(maxS);
    }
    @And("^User select salaryType \"([^\"]*)\"$")
    public void user_select_salaryType(String perA)  {
        new HomePage().selectSalaryType(perA);

    }

    @And("^User select jobType \"([^\"]*)\"$")
    public void user_select_jobType(String jobs)  {
        new HomePage().selectJobType(jobs);

    }

    @And("^User click on Find Jobs Button$")
    public void user_click_on_Find_Jobs_Button() {
        new HomePage().clickOnFindJobsButton();
    }


    @Then("^User verify the result \"([^\"]*)\"$")
    public void user_verify_the_result(String text)  {
     Assert.assertEquals(text,new HomePage().userVerifyTheResultText(text));
    }


}
