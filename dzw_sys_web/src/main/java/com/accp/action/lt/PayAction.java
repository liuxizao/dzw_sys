package com.accp.action.lt;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;

@RestController
@RequestMapping("/api/lt/dzwpay")
public class PayAction {

	@RequestMapping("/pay/{out_trade_no}/{total_amount}/{subject}/{body}")
	@ResponseBody
	public String pay(@PathVariable String out_trade_no, @PathVariable String total_amount,
			@PathVariable String subject, @PathVariable String body) throws AlipayApiException {
		System.out.println(out_trade_no);
		System.out.println(total_amount);
		// 获得初始化的AlipayClient
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id,
				AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key,
				AlipayConfig.sign_type);

		// 设置请求参数
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
		alipayRequest.setReturnUrl(AlipayConfig.return_url);
		alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

//        //商户订单号，商户网站订单系统中唯一订单号，必填
//        String out_trade_no = "1";
//        //付款金额，必填
//        String total_amount = "1";
//        //订单名称，必填
//        String subject = "1";
//        //商品描述，可空
//        String body = "1";
		System.out.println("out_trade_no:" + out_trade_no + "total_amount:" + total_amount + "subject:" + subject
				+ "body:" + body);
		
		alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
				+ "\"total_amount\":\""+ total_amount +"\"," 
				+ "\"subject\":\""+ subject +"\"," 
				+ "\"body\":\""+ body +"\"," 
				+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

		// 若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
		// alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
		// + "\"total_amount\":\""+ total_amount +"\","
		// + "\"subject\":\""+ subject +"\","
		// + "\"body\":\""+ body +"\","
		// + "\"timeout_express\":\"10m\","
		// + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
		// 请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节

		// 请求
		String result = alipayClient.pageExecute(alipayRequest).getBody();
		;
		return result;
	}
}
