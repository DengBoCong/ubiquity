package com.dbc.ubiquity;

import com.dbc.ubiquity.Entity.Primary.User;
import com.dbc.ubiquity.Entity.Secondary.Userq;
import com.dbc.ubiquity.Repository.Primary.UserPrimaryPository;
import com.dbc.ubiquity.Repository.Secondary.UserSecondaryPository;
import com.dbc.ubiquity.Service.MailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;

@SpringBootTest
class UbiquityApplicationTests {
	@Resource
	private UserPrimaryPository userPrimaryPository;
	@Resource
	private UserSecondaryPository userSecondaryPository;

	@Test
	public void testSave() throws Exception{
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String formattedDate = dateFormat.format(date);
//		userPrimaryPository.save(new User("aaaa", "aaa123456a","aa@126.comaa", "aaaa",  formattedDate));
		userPrimaryPository.save(new User("aa", "aa123456","aa@126.com", "aa",  formattedDate));
		userPrimaryPository.save(new User("bb", "bb123456","bb@126.com", "bb",  formattedDate));
		userSecondaryPository.save(new Userq("cc", "cc123456","cc@126.com", "cc",  formattedDate));
	}

	@Test
	public void testDelete() throws Exception {
		userPrimaryPository.deleteAll();
		userSecondaryPository.deleteAll();
	}

	@Test
	public void testBaseQuery() {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String formattedDate = dateFormat.format(date);
		User user=new User("ff", "ff123456","ff@126.com", "ff",  formattedDate);
		Userq userq=new Userq("ff", "ff123456","ff@126.com", "ff",  formattedDate);
		userPrimaryPository.findAll();
		userSecondaryPository.findById(3l);
		userSecondaryPository.save(userq);
		user.setId(2l);
		userPrimaryPository.delete(user);
		userPrimaryPository.count();
		userSecondaryPository.findById(3l);
	}

	@Autowired
	private MailService mailService;
	@Test
	void contextLoads() {
		mailService.sendSimpleMail("xxxxxx@qq.com", "你好呀", "邮件测试");
	}

}
