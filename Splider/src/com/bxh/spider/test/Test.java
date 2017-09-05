package com.bxh.spider.test;

import java.util.List;

import com.bxh.spider.bean.LinkTypeData;
import com.bxh.spider.core.ExtractService;
import com.bxh.spider.rule.Rule;



public class Test
{
	@org.junit.Test
	public void getDatasByCssQuery()
	{
		Rule rule = new Rule("http://www.baidu.com",
				new String[] { "word" }, new String[] { "支付宝" },
				null, -1, Rule.GET);
		List<LinkTypeData> extracts = ExtractService.extract(rule);
		printf(extracts);
	}

	public void printf(List<LinkTypeData> datas)
	{
		for (LinkTypeData data : datas)
		{
			System.out.println(data.getLinkText());
			System.out.println(data.getLinkHref());
			System.out.println("***********************************");
		}

	}
}
