package extentListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporterNG {
	public static ExtentReports extent;
	public static ExtentReports extentReportGenerator()
	{
		String path = System.getProperty("user.dir")+"\\Reports\\Index2.html";
		ExtentHtmlReporter reporter=new ExtentHtmlReporter(path);
		reporter.config().setReportName("Zerodha Test Report");
		reporter.config().setDocumentTitle("Regression Test cases");
		reporter.config().setTheme(Theme.STANDARD);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Organization", "kosshika IT");
		extent.setSystemInfo("Automation Tester","kosshika");
		
		return extent;

	}

}
