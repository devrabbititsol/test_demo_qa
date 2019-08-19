package web.test_qa_demo.web_module.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Home_screen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":85,\"executed_user_id\":85,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.guru99.com/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"test_qa_demo\",\"project_description\":\"desc\",\"project_id\":404,\"module_name\":\"web_module\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":674,\"testcase_name\":\"TC_demo\",\"testcase_id\":568,\"testset_id\":0,\"executed_timestamp\":-1464354588,\"browser_type\":\"chrome\",\"testcase_overwrite\":true}";

	public static String projectName = "test_qa_demo";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Home_screen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Software Testing')]")	
	private WebElement	SoftwareTesting_399945a;
	public String clkaSoftwareTesting_399945() {
		waitForExpectedElement(driver, SoftwareTesting_399945a);		
		String text = SoftwareTesting_399945a.getText();
		SoftwareTesting_399945a.click();
		return text;
	}

}