package gettingStarted;

import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MaximizingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		ArrayList<String> arguments = new ArrayList<>();
		arguments.add("--start-maximized");
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome").setHeadless(false).setArgs(null));
		BrowserContext context =  browser.newContext(new Browser.NewContextOptions().setViewportSize(null));
		
		
		Page page = context.newPage();
		page.navigate("https://www.google.com");
		String title = page.title();
		System.out.println(title);
	}

}
