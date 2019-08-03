import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springexample.bSearch.SpringSearchApp;

public class MySpring {

	public static void main(String[] args) {
	    Resource resource  =new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);
	    SpringSearchApp searchObj=(SpringSearchApp) factory.getBean("searchApp");
	    searchObj.search();
	}
}
