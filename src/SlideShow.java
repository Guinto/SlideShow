import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SlideShow {

	public static void main(String[] args) {
		//new SlideShow();
		new Database();
	}
	
	private ArrayList<Page> pages = new ArrayList<Page>();
	
	public SlideShow() {
		addSlides();
		play();
	}
	
	public void addSlides() {
		pages.add(new Page("http://www.businessinsider.com"));
		pages.add(new Page("http://www.yahoo.com"));
		pages.add(new Page("http://www.youtube.com"));
	}
	
	public void play() {
		WebDriver driver = new FirefoxDriver();
		while (true) {
			for (Page page : pages) {
				driver.get(page.getUrl());
				pauseFor(10);
			}
		}
	}
	
	/* TODO
	 * give a list of commands that it runs before, during, after for the site
	 */
	
	public void pauseFor(double seconds) {
		int waitTime = (int)seconds * 1000;
		try {
			Thread.sleep(waitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
