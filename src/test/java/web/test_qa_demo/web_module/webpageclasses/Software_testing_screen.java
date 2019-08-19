package web.test_qa_demo.web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Software_testing_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":85,\"executed_user_id\":85,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.guru99.com/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"test_qa_demo\",\"project_description\":\"desc\",\"project_id\":404,\"module_name\":\"web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":674,\"testcase_name\":\"TC_demo\",\"testcase_id\":568,\"testset_id\":0,\"executed_timestamp\":-1464354588,\"browser_type\":\"chrome\",\"testcase_overwrite\":true}";

	public static String projectName = "test_qa_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Software_testing_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "#g-mainbar > div > div > div > div > div > div > div:nth-child(4) > table:nth-child(10) > tbody > tr:nth-child(1) > td.responsivetable > a > strong")	
	private WebElement	Tutorial_400693a;
	public String clkaTutorial_400693() {
		waitForExpectedElement(driver, Tutorial_400693a);		
		String text = Tutorial_400693a.getText();
		Tutorial_400693a.click();
		return text;
	}

}