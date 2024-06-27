package gettingStarted;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightExample {

	public static void main(String[] args) {
	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	      BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setViewportSize(1020, 720));
	      Page page = browserContext.newPage();
	      
	      
	      page.navigate("https://google.com");
	      System.out.println(page.title());

	      // Close the browser, which will also close all pages within it
	      browser.close();
	    }
	  }
}

