package cn.mldn.microboot.service.impl;

import org.springframework.stereotype.Service;

import cn.mldn.microboot.service.IMessageService;
//@Service
public class MessageServiceImpl implements IMessageService {

	@Override
	public String info() {
		return "www.xiaoxian.com";
	}

}
