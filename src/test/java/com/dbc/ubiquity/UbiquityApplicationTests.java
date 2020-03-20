package com.dbc.ubiquity;

import com.dbc.ubiquity.Entity.Primary.PUbiquityUserEntity;
import com.dbc.ubiquity.Repository.Primary.UserPrimaryRepository;
import com.dbc.ubiquity.Repository.Secondary.UserSecondaryPository;
import com.dbc.ubiquity.Service.MailService;
import com.dbc.ubiquity.Utils.DateUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;

@SpringBootTest
class UbiquityApplicationTests {
	@Resource
	private UserPrimaryRepository userPrimaryRepository;
	@Resource
	private UserSecondaryPository userSecondaryPository;

	@Test
	public void testSave() throws Exception{
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String formattedDate = dateFormat.format(date);
//		userPrimaryPository.save(new User("aaaa", "aaa123456a","aa@126.comaa", "aaaa",  formattedDate));
//		userPrimaryPository.save(new User("aa", "aa123456","aa@126.com", "aa",  formattedDate));
//		userPrimaryPository.save(new User("bb", "bb123456","bb@126.com", "bb",  formattedDate));
//		userSecondaryPository.save(new Userq("cc", "cc123456","cc@126.com", "cc",  formattedDate));
		PUbiquityUserEntity userEntity = userPrimaryRepository.findByAccount("18870125082").orElse(null);

	}

	@Test
	public void testDelete() throws Exception {
		userPrimaryRepository.deleteAll();
		userSecondaryPository.deleteAll();
	}

	@Test
	public void testBaseQuery() {
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
//		String formattedDate = dateFormat.format(date);
//		User user=new User("ff", "ff123456","ff@126.com", "ff",  formattedDate);
//		Userq userq=new Userq("ff", "ff123456","ff@126.com", "ff",  formattedDate);
//		userPrimaryPository.findAll();
//		userSecondaryPository.findById(3l);
//		userSecondaryPository.save(userq);
//		user.setId(2l);
//		userPrimaryPository.delete(user);
//		userPrimaryPository.count();
//		userSecondaryPository.findById(3l);
	}

	@Autowired
	private MailService mailService;
	@Test
	void contextLoads() {
		mailService.sendSimpleMail("xxxxxx@qq.com", "你好呀", "邮件测试");
	}

	@Autowired
	private HelloSender helloSender;
	@Test
	public void hello() throws Exception {
		helloSender.send();
	}

}
